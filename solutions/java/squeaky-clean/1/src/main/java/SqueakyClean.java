class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();

        boolean capitalizeNext = false;

        for (char c : identifier.toCharArray()) {

            if (c == '-') {
                capitalizeNext = true;
                continue;
            }
            if (Character.isWhitespace(c)) {
                sb.append('_');
                capitalizeNext = false;
                continue;
            }

            if (isLeetSpeak(c)) {
                c = leetSpeakToNormal(c);
            }

            if (Character.isLetter(c)) {
                if (capitalizeNext) {
                    sb.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    sb.append(c);
                }
            }
        }
        return sb.toString();

    }

    private static boolean isLeetSpeak(char c) {
        if (c == '4' || c == '3' || c == '0' || c == '1' || c == '7') {
            return true;
        } else {
            return false;
        }
    }

    private static char leetSpeakToNormal(char c){
        return switch (c) {
                    case '4' ->'a';
                    case '3' -> 'e';
                    case '0' -> 'o';
                    case '1' -> 'l';
                    case '7' -> 't';
                    default -> '0';
                };
            }
}
