import java.util.Locale;

public class LogLevels {
    
    public static String message(String logLine) {
        String[] arr = logLine.split(":");
        return arr[1].trim();


    }

    public static String logLevel(String logLine) {
        String[] arr=logLine.split(":");
        String s1=arr[0].replace("[","");
        String s2=s1.replace("]","");
        return s2.toLowerCase();
    }

    public static String reformat(String logLine) {

        String message=message(logLine);
        String level=logLevel(logLine);
        return message+" ("+level+")";

    }
}
