import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        String[] stringArray = Arrays.stream(nums).mapToObj(String::valueOf).toArray(String[]::new);
        Arrays.sort(stringArray, (a, b) -> (b + a).compareTo(a + b));
        return String.join("", stringArray).replaceFirst("^0+(?!$)", "");
    }
}
