class ResistorColorDuo {

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

    int value(String[] colors) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(2, colors.length); i++) {
            sb.append(String.valueOf(colorCode(colors[i])));
        }
        int result = Integer.parseInt(sb.toString());
        return result;
    }
}