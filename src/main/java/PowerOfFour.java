//  powers of 4 in binary representation:
//  1
//  100
//  10000
//  1000000
public class PowerOfFour {

    public boolean isPowerOfFour(int num) {
        return isPowerOfTwo(num) && isDivisibleByThree(num - 1);
    }

    private boolean isPowerOfTwo(int num) {
        return num > 0 && (num & num - 1) == 0;
    }

    private boolean isDivisibleByThree(int num) {
        return num % 3 == 0;
    }

    public boolean isPowerOfFourLib(int num) {
        return Integer.bitCount(num) == 1 && Integer.numberOfTrailingZeros(num) % 2 == 0;
    }

    public boolean isPowerOfFourMath(int num) {
        return (Math.log(num) / Math.log(4)) % 1 == 0;
    }
}
