public class OOPSBannerApp {

    // Inner static class
    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getters
        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create array of mappings
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
                "     ","     ","     ",
                "     ","     ","     ","     "
        });

        return maps;
    }

    // Get pattern for a character
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] maps) {

        for (CharacterPatternMap m : maps) {
            if (m.getCharacter() == ch) {
                return m.getPattern();
            }
        }
        return maps[3].getPattern(); // space fallback
    }

    // Print banner
    public static void printMessage(String message,
                                    CharacterPatternMap[] maps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            for (char c : message.toCharArray()) {
                sb.append(getCharacterPattern(c, maps)[row]).append("  ");
            }

            System.out.println(sb);
        }
    }

    // Main method
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps =
                createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}