public class LogLevels {

    public static String message(String logLine) {
        return logLine.substring(logLine.indexOf("]:") + 2).trim();
    }

    public static String logLevel(String logLine) {
        if (logLine.contains("ERROR")) {
            return "error";
        }
        if (logLine.contains("WARNING")){
            return "warning";
        }
        if (logLine.contains("INFO")){
            return "info";
        }
        return "";
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        message = message + " (" + logLevel(logLine) + ")";
        return message;
    }
}
