public class OopsBannerAppUC7 {

    // UC7: Static Inner Class to encapsulate character data
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor to initialize the character and its pattern
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter to retrieve the pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        // Define the pattern for 'O'
        String[] patternO = {
            "  *** ",
            " * * ",
            " * * ",
            " * * ",
            "  *** "
        };

        // Create an object of CharacterPattern
        CharacterPattern charO = new CharacterPattern('O', patternO);

        // Display the pattern using the object
        display(charO);
    }

    public static void display(CharacterPattern cp) {
        // Use the getter to access the encapsulated data
        for (String line : cp.getPattern()) {
            System.out.println(line);
        }
    }
}