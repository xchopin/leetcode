// Problem from HackerRank, not NeetCode this time
public class TimeConversion {
    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        
        if (s.endsWith("PM")) {
            if (hour != 12) {
               hour = hour + 12; 
            }
 
            s = Integer.toString(hour) + s.substring(2, s.length() - 2);
        } else {
            if (hour == 12) {
                hour = 0;
            }
            s = String.format("%02d", hour) + s.substring(2, s.length() - 2);
        }
    
        
        return s;
    }


}
