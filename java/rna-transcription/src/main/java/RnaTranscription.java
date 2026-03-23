class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dnaStrand.length(); i++) {
            sb.append(convertToRna(dnaStrand.charAt(i)));
        }
        return sb.toString();
    }

    private char convertToRna(char c) {
        return switch (c) {
            case 'G' -> 'C';
            case 'C' -> 'G';
            case 'T' -> 'A';
            case 'A' -> 'U';
            default -> throw new IllegalArgumentException("Invalid nucleotide: " + c);
        };
    }

}