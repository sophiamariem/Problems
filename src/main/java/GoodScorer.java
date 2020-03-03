import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodScorer {

    /*
    For Input:
    2
    5 6
    8 4 5 6 7
    2 3 4 5 6 7
    3 5
    100 29 37
    100 200 300 400 500
    Your Output is:
    C1
    C2
    */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        for (int i = 0; i < count; i++) {

            String[] columnString = reader.readLine().trim().split("\\s+");
            int columnOneSize = Integer.parseInt(columnString[0]);
            int columnTwoSize = Integer.parseInt(columnString[1]);

            String[] firstColumn = reader.readLine().trim().split("\\s+");
            String[] secondColumn = reader.readLine().trim().split("\\s+");

            int sumColumnOne = 0;
            int sumColumnTwo = 0;
            for (int j = 0; j < columnOneSize; j++) {
                sumColumnOne += Integer.parseInt(firstColumn[j]);
            }
            for (int k = 0; k < columnTwoSize; k++) {
                sumColumnTwo += Integer.parseInt(secondColumn[k]);
            }

            String result = "C1";
            if (sumColumnTwo > sumColumnOne) {
                result = "C2";
            }
            System.out.println(result);
        }
    }

}
