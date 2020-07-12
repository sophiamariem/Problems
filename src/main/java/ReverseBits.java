public class ReverseBits {

    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result += n & 1;
            n >>>= 1;
        }
        return result;
    }

    public int reverseBitsM(int n) {
        int result = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            result = result * 2 + (n & mask);
            n >>>= 1;
        }
        return result;
    }

    public int reverseBits8(int n) {
        n = (n >>> 16) | (n << 16);
        n = ((n & 0xFF00FF00) >>> 8) | ((n & 0x00FF00FF) << 8);
        n = ((n & 0xF0F0F0F0) >>> 4) | ((n & 0x0F0F0F0F) << 4);
        n = ((n & 0xCCCCCCCC) >>> 2) | ((n & 0x33333333) << 2);
        n = ((n & 0xAAAAAAAA) >>> 1) | ((n & 0x55555555) << 1);
        return n;
    }
}
