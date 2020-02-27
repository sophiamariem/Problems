public class MakingAnagrams {

    public int makingAnagrams(String s1, String s2) {
        int array[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            array[s1.charAt(i) - 97]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            array[s2.charAt(i) - 97]--;
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(array[i]);
        }
        return count;
    }
}
