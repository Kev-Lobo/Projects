public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":");
        return logLine.substring(colonIndex+1).trim();
    }

    public static String logLevel(String logLine) {
        int openingBracket = logLine.indexOf("[");
        int closingBracket = logLine.indexOf("]");
        String str=logLine.substring(openingBracket + 1, closingBracket).toLowerCase();
        return str;
    }

    public static String reformat(String logLine) {
        String message = logLine.split(":")[1].trim();

        int start = logLine.indexOf("[") + 1;
        int end = logLine.indexOf("]");
        String level = logLine.substring(start, end).toLowerCase();
        return String.format("%s (%s)", message, level);
    }
}
