/*
A password is considered strong if below conditions are all met:
It has at least 6 characters and at most 20 characters.
It must contain at least one lowercase letter, at least one uppercase letter, and at least one digit.
It must NOT contain three repeating characters in a row ("...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met).
Write a function strongPasswordChecker(s), that takes a string s as input, and return the MINIMUM change required to make s a strong password.
If s is already strong, return 0.
*/
public class StrongPasswordChecker {

    private static final int MIN_LENGTH = 6;
    private static final int MAX_LENGTH = 20;

    // based on https://leetcode.com/problems/strong-password-checker/discuss/91008/Simple-Python-solution
    public int strongPasswordChecker(String s) {
        int length = s.length();

        int oneDeletion = 0;
        int twoDeletions = 0;
        int changes = 0;
        int index = 0;

        int uppercase = 0;
        int lowercase = 0;
        int digit = 0;

        while (index < length) {
            char c = s.charAt(index);

            if (Character.isUpperCase(c)) {
                uppercase = 1;
            } else if (Character.isLowerCase(c)) {
                lowercase = 1;
            } else if (Character.isDigit(c)) {
                digit = 1;
            }

            if (index > 1 && c == s.charAt(index - 1) && c == s.charAt(index - 2)) {
                int repetitions = 2;

                while (index < length && s.charAt(index) == c) {
                    index++;
                    repetitions++;
                }

                // For any repeating sequences with len % 3 == 0 we reduce one replacement by deleting one character
                // For any repeating sequences with len % 3 == 1 we reduce one replacement by deleting two characters
                // For the remaining sequences we reduce every replacement by deleting three characters
                if (repetitions % 3 == 0) {
                    oneDeletion++;
                } else if (repetitions % 3 == 1) {
                    twoDeletions++;
                }
                changes += repetitions / 3;
            } else {
                index++;
            }
        }

        int miss = 3 - uppercase - lowercase - digit;

        if (length < MIN_LENGTH) {
            return Math.max(miss, MIN_LENGTH - length);
        } else if (length <= MAX_LENGTH) {
            return Math.max(miss, changes);
        } else {
            int extraChars = length - MAX_LENGTH;
            changes -= Math.min(extraChars, oneDeletion);
            changes -= Math.min(Math.max(extraChars - oneDeletion, 0), twoDeletions * 2) / 2;
            changes -= Math.max(extraChars - oneDeletion - 2 * twoDeletions, 0) / 3;
            return extraChars + Math.max(changes, miss);
        }
    }
}
