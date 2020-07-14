public class AngleBetweenHandsOfAClock {

    public double angleClock(int hour, int minutes) {
        double minuteAngle = 360 * (minutes / 60.0);
        double hourAngle = 360 * (hour / 12.0) + 30 * (minutes / 60.0);
        double result = Math.abs(minuteAngle - hourAngle);
        if (result > 180.0) {
            result = 360.0 - result;
        }
        return result;
    }
}
