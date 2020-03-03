import java.util.Scanner;

public class GfgLookup {

    /*
    For Input:
    2
    geefgfgksforgfgeeks
    dsajslsdlsfgf

    Your Output is:
    2
    -1
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            int occurrences = 0;
            String input = sc.next();
            for (int j = 0; j < input.length() - 2; j++) {
                if ((input.substring(j, j + 3)).equals("gfg")) {
                    occurrences++;
                }
            }
            System.out.println(occurrences == 0 ? -1 : occurrences);
        }
    }

}
