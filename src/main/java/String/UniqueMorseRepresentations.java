package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = new String[]{".-",
                "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> strings = new HashSet<>();
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                String code = codes[ch - 'a'];
                stringBuilder.append(code);
            }
            strings.add(stringBuilder.toString());
        }
        return strings.size();
    }

    public static void main(String[] args) {
        new UniqueMorseRepresentations().uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
    }
}
