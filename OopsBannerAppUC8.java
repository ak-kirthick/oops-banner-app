import java.util.HashMap;
import java.util.Map;

public class OopsBannerAppUC8 {

    // Same class from UC7 to hold the data
    static class CharacterPattern {
        private String[] pattern;

        public CharacterPattern(String[] pattern) {
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // UC8: Using a Map for centralized pattern management
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        // Populate the Map with patterns
        patternMap.put('O', new CharacterPattern(new String[]{
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        }));

        patternMap.put('P', new CharacterPattern(new String[]{
            " **** ",
            " * * ",
            " **** ",
            " * ",
            " * "
        }));

        // Now we can print any word by looking it up in the Map!
        String word = "OOP";
        printWord(word, patternMap);
    }

    public static void printWord(String word, Map<Character, CharacterPattern> map) {
        // Loop through each character in the word
        for (char c : word.toCharArray()) {
            if (map.containsKey(c)) {
                for (String line : map.get(c).getPattern()) {
                    System.out.println(line);
                }
                System.out.println(); // Space between letters
            }
        }
    }
}