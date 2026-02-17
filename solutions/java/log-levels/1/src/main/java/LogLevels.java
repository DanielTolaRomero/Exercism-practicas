public class LogLevels {
    
    public static String message(String logLine) {
        return logLine
                    .split(":") [1]
                    .trim()
                    .replaceAll("\\s+"," ")
                    .replaceAll("\\r\\n|\\r|\\n", "");
    }

    public static String logLevel(String logLine) {
        return logLine
                    .split(":")[0]
                    .replaceAll("[^\\w]", "")
                    .toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine)+" ("+ logLevel(logLine)+")";
    }
}
