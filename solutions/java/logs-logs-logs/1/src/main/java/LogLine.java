public class LogLine {

    private final LogLevel logLevel;
    private String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine.split(":")[1].trim();
        switch (logLine.split(":")[0].replaceAll("[\\[\\]]","").toUpperCase()) {
            case "TRC" -> this.logLevel = LogLevel.TRACE;
            case "DBG" -> this.logLevel = LogLevel.DEBUG;
            case "INF" -> this.logLevel = LogLevel.INFO;
            case "WRN" -> this.logLevel = LogLevel.WARNING;
            case "ERR" -> this.logLevel = LogLevel.ERROR;
            case "FTL" -> this.logLevel = LogLevel.FATAL;
            default -> this.logLevel = LogLevel.UNKNOWN;
        }
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        String encodedLevel = "";
          
        switch (logLevel) {
            case TRACE -> encodedLevel = "1";
            case DEBUG -> encodedLevel = "2";
            case INFO -> encodedLevel = "4";
            case WARNING -> encodedLevel = "5";
            case ERROR -> encodedLevel = "6";
            case FATAL -> encodedLevel = "42";
            case UNKNOWN -> encodedLevel = "0";
        }
        
        return encodedLevel+":"+logLine;
    }
}
