public class DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int count = 1;
        int sum = 0;
        int i = 0;
        while (sum < candies) {
            result[i] += count;
            sum += count;
            count = Math.min(count + 1, candies - sum);
            i = (i + 1) % num_people;
        }
        return result;
    }
}
