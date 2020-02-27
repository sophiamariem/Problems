import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private Map<Integer, LinkedListNode> cache = new HashMap<>();
    private LinkedListNode listHead = null;
    private LinkedListNode listTail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        LinkedListNode node = cache.get(key);
        if (node == null) {
            return -1;
        }

        if (node != listHead) {
            put(node.key, node.value);
        }

        return cache.get(key).value;
    }

    public void put(int key, int value) {
        LinkedListNode node = new LinkedListNode(key, value);
        removeKey(key);

        if (cache.size() >= capacity && listTail != null) {
            removeKey(listTail.key);
        }

        if (listHead == null) {
            listHead = node;
            listTail = node;
        } else {
            listHead.prev = node;
            node.next = listHead;
            listHead = node;
            node.prev = null;
        }
        cache.put(key, node);
    }

    private boolean removeKey(int key) {
        LinkedListNode node = cache.get(key);
        removeFromLinkedList(node);
        cache.remove(key);
        return true;
    }

    private void removeFromLinkedList(LinkedListNode node) {
        if (node == null) {
            return;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }

        if (node == listTail) {
            listTail = node.prev;
        }

        if (node == listHead) {
            listHead = node.next;
        }
    }

    public class LinkedListNode {
        public LinkedListNode next;
        public LinkedListNode prev;
        public int key;
        public int value;

        public LinkedListNode(int k, int v) {
            this.key = k;
            this.value = v;
        }
    }
}
