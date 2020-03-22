import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MyCalendar {
    private List<Map<Integer, Integer>> bookedSlots = new ArrayList<>();
    private TreeMap<Integer, Integer> bookedSlotsTree = new TreeMap<>();
    private Node root;

    public boolean bookList(int start, int end) {
        if (canBook(start, end)) {
            saveSlot(start, end);
            return true;
        }
        return false;
    }

    private boolean canBook(int start, int end) {
        for (Map<Integer, Integer> bookedSlot : bookedSlots) {
            boolean foundOverlapping = bookedSlot.entrySet().stream().anyMatch(
                    slot -> start >= slot.getKey() && start + 1 <= slot.getValue() || start <= slot.getKey() && end - 1 >= slot.getKey());
            if (foundOverlapping) {
                return false;
            }
        }
        return true;
    }

    private void saveSlot(int start, int end) {
        bookedSlots.add(Map.of(start, end));
    }

    public boolean bookTreeMap(int start, int end) {
        Integer previousEntryStartTime = bookedSlotsTree.floorKey(start);
        Integer nextEntryStartTime = bookedSlotsTree.ceilingKey(start);

        if ((previousEntryStartTime == null || bookedSlotsTree.get(previousEntryStartTime) <= start)
                && (nextEntryStartTime == null || end <= nextEntryStartTime)) {
            bookedSlotsTree.put(start, end);
            return true;
        }
        return false;
    }


    public boolean bookNode(int start, int end) {
        if (root == null) {
            root = new Node(start, end);
        } else {
            Node node = root;
            while (true) {
                if (start == node.start) {
                    return false;
                }
                if (start < node.start) {
                    if (end > node.start) {
                        return false;
                    }
                    if (node.left != null) {
                        node = node.left;
                    } else {
                        node.left = new Node(start, end);
                        break;
                    }
                } else {
                    if (start < node.end) {
                        return false;
                    }
                    if (node.right != null) {
                        node = node.right;
                    } else {
                        node.right = new Node(start, end);
                        break;
                    }
                }
            }
        }
        return true;
    }

    private class Node {
        public int start;
        public int end;
        public Node left;
        public Node right;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
}
