class Scrabble {
    private final String word;
    private static final int[] SCORE = new int[26];
    static {
        setLetterScore("AEIOULNRST", 1);
        setLetterScore("DG", 2);
        setLetterScore("BCMP", 3);
        setLetterScore("FHVWY", 4);
        setLetterScore("K", 5);
        setLetterScore("JX", 8);
        setLetterScore("QZ", 10);
    }

    Scrabble(String word) {
        this.word = word;
    }

    private static void setLetterScore(String letters, int score) {
        for (int i = 0; i < letters.length(); i++) {
            char c = letters.charAt(i);
            SCORE[c - 'A'] = score;
        }
    }

    public static int scoreLetter(char c) {
        if (c < 'A' || c > 'Z') {
            return 0;
        }
        return SCORE[c - 'A'];

    }

    int getScore() {
        int total = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            total += scoreLetter(c);
        }
        return total;
    }

}
