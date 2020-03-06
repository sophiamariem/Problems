import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringForLinesSplit {

    public List<String> stringForList(String input, int maxCharAtLine) {
        List<String> result = new ArrayList();

        if (input == null || input.isEmpty()) {
            return result;
        }
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            while (i + 1 < words.length && sb.length() + words[i + 1].length() <= maxCharAtLine) {
                sb.append(" " + words[++i]);
            }
            result.add(sb.toString());
        }

        return result;
    }

    public List<String> stringForListPattern(String input, int maxCharAtLine) {
        List<String> result = new ArrayList();
        Pattern pattern = Pattern.compile(String.format(".{1,%d}\\W?", maxCharAtLine));
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            result.add(matcher.group().trim());
        }
        return result;
    }
}