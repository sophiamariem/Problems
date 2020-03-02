import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] stringArray = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(stringArray, (a, b) -> (b + a).compareTo(a + b));
        return String.join("", stringArray).replaceFirst("^0+(?!$)", "");
    }

    public String largestNumberFaster(int[] nums) {
        List<String> numsList = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            numsList.add(Integer.toString(nums[i]));
        }

        Collections.sort(numsList, (a, b)-> {
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });

        int k = 0;
        while (k < numsList.size() - 1 && numsList.get(k).equals("0")) {
            k++;
        }

        StringBuffer result = new StringBuffer();
        for (int i = k; i < numsList.size(); i++) {
            result.append(numsList.get(i));
        }

        return result.toString();
    }
}
