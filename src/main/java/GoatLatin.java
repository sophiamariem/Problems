public class GoatLatin {

    public String toGoatLatin(String S) {
        String[] words = S.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!String.valueOf(word.charAt(0)).matches("[aeiouAEIOU]")) {
                word = word.substring(1) + word.substring(0, 1);
            }
            word += "ma" + "a".repeat(i + 1);
            words[i] = word;
        }
        return String.join(" ", words);
    }

    public String toGoatLatinBoolArr(String S) {
        boolean[] isVowel = new boolean[256];
        isVowel['A'] = true;
        isVowel['a'] = true;
        isVowel['E'] = true;
        isVowel['e'] = true;
        isVowel['I'] = true;
        isVowel['i'] = true;
        isVowel['O'] = true;
        isVowel['o'] = true;
        isVowel['U'] = true;
        isVowel['u'] = true;

        StringBuilder sb = new StringBuilder();
        StringBuilder a = new StringBuilder();

        String[] words = S.split(" ");
        if (words.length == 0 || words[0].length() == 0) {
            return S;
        }

        for (String word : words) {
            char first = word.charAt(0);
            sb.append(word);

            if (!isVowel[first]) {
                sb.deleteCharAt(sb.length() - word.length());
                sb.append(first);
            }

            sb.append("ma");
            sb.append(a.append('a'));
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public String toGoatLatinHelp(String S) {
        StringBuilder sb = new StringBuilder();
        StringBuilder suffix = new StringBuilder();

        String[] words = S.split(" ");
        for (int i = 0; i < words.length; i++) {
            suffix.append('a');
            sb.append(transform(words[i])).append(suffix);
            if (i != words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    private String transform(String s) {
        StringBuilder sb = new StringBuilder();
        if ("aeiouAEIOU".indexOf(s.charAt(0)) >= 0) {
            sb.append("am");
            return s + sb.reverse().toString();
        }
        sb.append("am").append(s.charAt(0));
        return s.substring(1) + sb.reverse().toString();
    }
}
