public class UC7 {

    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern oPattern = new CharacterPattern('O', new String[] {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        CharacterPattern pPattern = new CharacterPattern('P', new String[] {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        CharacterPattern sPattern = new CharacterPattern('S', new String[] {
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "        *",
                "        *",
                "  *****  "
        });

        CharacterPattern[] messagePatterns = {
                oPattern, oPattern, pPattern, sPattern
        };

        for (int i = 0; i < 7; i++) {
            for (CharacterPattern cp : messagePatterns) {
                System.out.print(cp.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }
}