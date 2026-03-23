public class LogLine {
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String code = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]"));
        return switch (code) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        LogLevel level = this.getLogLevel();
        StringBuilder sb = new StringBuilder();
        sb.append(level.getLevelCode());
        sb.append(":" + logLine.substring(logLine.indexOf(":") + 2));
        return sb.toString();
    }
}
