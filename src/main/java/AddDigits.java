// digital root problem
public class AddDigits {

    public int addDigits(int num) {
        while (num > 9) {
            int sum = 0;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public int addDigitsRoot(int num) {
        if (num == 0) {
            return 0;
        }
        if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    public int addDigitsRootS(int num) {
        return 1 + (num - 1) % 9;
    }
}
