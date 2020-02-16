import java.util.ArrayList;

public class SubsetsOfSet {

    public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set) {
        return getSubsets(set, 0);
    }

    private ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {
        ArrayList<ArrayList<Integer>> result;
        if (set.size() == index) {
            result = new ArrayList<>();
            result.add(new ArrayList<>());
        } else {
            result = getSubsets(set, index + 1);
            int item = set.get(index);
            ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
            for (ArrayList<Integer> subset : result) {
                ArrayList<Integer> newSet = new ArrayList<>();
                newSet.addAll(subset);
                newSet.add(item);
                subsets.add(newSet);
            }
            result.addAll(subsets);
        }
        return result;
    }
}
