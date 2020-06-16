import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidateIPAddressTest {

    private ValidateIPAddress validateIPAddress = new ValidateIPAddress();

    @Test
    public void test() {
        assertEquals(ValidateIPAddress.IPV_4, validateIPAddress.validIPAddress("172.16.254.1"));
        assertEquals(ValidateIPAddress.IPV_6, validateIPAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals(ValidateIPAddress.NEITHER, validateIPAddress.validIPAddress("256.256.256.256"));
        assertEquals(ValidateIPAddress.IPV_4, validateIPAddress.validIPAddress("192.0.0.1"));
    }
}
