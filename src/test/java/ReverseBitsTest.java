import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {

    private ReverseBits reverseBits = new ReverseBits();

    @Test
    public void test() {
        // The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
        // so return 964176192 which its binary representation is 00111001011110000010100101000000.
        assertEquals(43261596, reverseBits.reverseBits(964176192));

        // The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293,
        // so return 3221225471 which its binary representation is 10111111111111111111111111111111.
        // In Java, the compiler represents the signed integers using 2's complement notation.
        // Therefore, in Example 2 above the input represents the signed integer -3
        // and the output represents the signed integer -1073741825.
        assertEquals(-3, reverseBits.reverseBits(-1073741825));
    }

    @Test
    public void testTwo() {
        // The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
        // so return 964176192 which its binary representation is 00111001011110000010100101000000.
        assertEquals(43261596, reverseBits.reverseBitsM(964176192));

        // The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293,
        // so return 3221225471 which its binary representation is 10111111111111111111111111111111.
        // In Java, the compiler represents the signed integers using 2's complement notation.
        // Therefore, in Example 2 above the input represents the signed integer -3
        // and the output represents the signed integer -1073741825.
        assertEquals(-3, reverseBits.reverseBitsM(-1073741825));
    }

    @Test
    public void testThree() {
        // The input binary string 00000010100101000001111010011100 represents the unsigned integer 43261596,
        // so return 964176192 which its binary representation is 00111001011110000010100101000000.
        assertEquals(43261596, reverseBits.reverseBits8(964176192));

        // The input binary string 11111111111111111111111111111101 represents the unsigned integer 4294967293,
        // so return 3221225471 which its binary representation is 10111111111111111111111111111111.
        // In Java, the compiler represents the signed integers using 2's complement notation.
        // Therefore, in Example 2 above the input represents the signed integer -3
        // and the output represents the signed integer -1073741825.
        assertEquals(-3, reverseBits.reverseBits8(-1073741825));
    }

}
