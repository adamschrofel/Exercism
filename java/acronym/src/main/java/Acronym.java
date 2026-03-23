class Acronym {
    private StringBuilder sb = new StringBuilder();

    Acronym(String phrase) {
        if (phrase.isEmpty()) {
            return;
        }
        if (Character.isLetter(phrase.charAt(0))) {
            sb.append(Character.toUpperCase(phrase.charAt(0)));
        }
        for (int i = 1; i < phrase.length(); i++) {

            if (Character.isLetter(phrase.charAt(i)) && !Character.isLetter(phrase.charAt(i - 1))
                    && phrase.charAt(i - 1) != '\'') {
                sb.append(Character.toUpperCase(phrase.charAt(i)));
            }
        }
    }

    String get() {
        return sb.toString();
    }

}
