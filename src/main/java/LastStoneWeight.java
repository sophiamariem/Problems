import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i : stones) {
            pq.add(i);
        }

        while (pq.size() > 1) {
            int elemOne = pq.poll();
            int elemTwo = pq.poll();

            if (elemOne != elemTwo) {
                int largest = elemOne > elemTwo ? elemOne : elemTwo; /// faster than Math.Abs
                int smallest = elemOne < elemTwo ? elemOne : elemTwo;
                pq.add(largest - smallest);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
