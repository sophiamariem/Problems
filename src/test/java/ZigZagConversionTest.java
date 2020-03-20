import static org.junit.Assert.assertEquals;

        import org.junit.Test;

public class ZigZagConversionTest {

    private ZigZagConversion zigZagConversion = new ZigZagConversion();

    @Test
    public void test() {
        assertEquals("PAHNAPLSIIGYIR", zigZagConversion.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI", zigZagConversion.convert("PAYPALISHIRING", 4));
    }
}
