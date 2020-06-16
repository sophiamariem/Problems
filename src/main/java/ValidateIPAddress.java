public class ValidateIPAddress {

    protected static final String IPV_4 = "IPv4";
    protected static final String IPV_6 = "IPv6";
    protected static final String NEITHER = "Neither";
    private static final String NUMERIC_REGEX = "\\p{Digit}+";
    private static final String HEX_DIG_REGEX = "\\p{XDigit}+";

    public String validIPAddress(String IP) {
        return isValidIPv4(IP) ? IPV_4 : isValidIPv6(IP) ? IPV_6 : NEITHER;
    }

    private boolean isValidIPv4(String ip) {
        int delimiterCount = ip.length() - ip.replace(".", "").length();

        if (delimiterCount != 3 || ip.length() < 7 || ip.length() > 19) {
            return false;
        }

        String[] groups = ip.split("\\.");
        if (groups.length != 4) {
            return false;
        }

        for (String s : groups) {
            if (s.length() == 0 || s.length() > 4 || !s.matches(NUMERIC_REGEX) || s.length() > 1 && s.startsWith("0") ||
                    Integer.parseInt(s) < 0 || Integer.parseInt(s) > 255) {
                return false;
            }
        }

        return true;
    }

    private boolean isValidIPv6(String ip) {
        int delimiterCount = ip.length() - ip.replace(":", "").length();

        if (delimiterCount != 7 || ip.length() > 39 || ip.length() < 15) {
            return false;
        }

        String[] groups = ip.split(":");
        if (groups.length != 8) {
            return false;
        }

        for (String s : groups) {
            if (s.length() == 0 || s.length() > 4 || !s.matches(HEX_DIG_REGEX)) {
                return false;
            }
        }

        return true;
    }
}
