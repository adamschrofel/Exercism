
class ResistorColor {

    enum ResistanceColor {
        BLACK(0),
        BROWN(1),
        RED(2),
        ORANGE(3),
        YELLOW(4),
        GREEN(5),
        BLUE(6),
        VIOLET(7),
        GREY(8),
        WHITE(9);

        private final int code;

        ResistanceColor(int code) {
            this.code = code;
        }

        int getCode() {
            return code;
        }
    }

    int colorCode(String color) {
        return ResistanceColor.valueOf(color.toUpperCase()).getCode();
    }

    String[] colors() {
        ResistanceColor[] values = ResistanceColor.values();
        String[] result = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i].name().toLowerCase();
        }
        return result;
        // Streams version: return Arrays.stream(ResistanceColor.values()).map(color ->
        // color.name().toLowerCase()).toArray(String[]::new);
    }
}