public class TimeFormatter {
    
  public static String formatDuration(int seconds) {
    if (seconds == 0){
      return "now";
    }
    String txt = "";
    int minuts = seconds/60;
    seconds %= 60;
    int hours = minuts/60;
    minuts %= 60;
    int days = hours/24;
    hours %= 24;
    int years = days/365;
    days %= 365;
    if (years != 0) {
      if (years == 1) {
        txt += years + " year, ";
      } else {
        txt += years + " years, ";
      }
    }
    if (days != 0) {
      if (days == 1) {
        txt += days + " day, ";
      } else {
        txt += days + " days, ";
      }
    }
    if (hours != 0) {
      if (hours == 1) {
        txt += hours + " hour, ";
      } else {
        txt += hours + " hours, ";
      }
    }
    if (minuts != 0) {
      if (minuts == 1) {
        txt += minuts + " minute, ";
      } else {
        txt += minuts + " minutes, ";
      }
    }
    if (seconds != 0) {
      if (seconds == 1) {
        txt += seconds + " second";
      } else {
        txt += seconds + " seconds";
      }
    }
    if (txt.lastIndexOf(" ") == (txt.length()-1)) {
      System.out.println("br");
      txt = txt.substring(0, txt.length()-1);
    }
    if (txt.lastIndexOf(",") == (txt.length()-1)) {
      System.out.println("br");
      txt = txt.substring(0, txt.length()-1);
    }
    int coma = txt.lastIndexOf(",");
    String solve = "";
    for (int i = 0; i < txt.length(); i++) {
      if (i == coma) {
        solve += " and";
      } else {
        solve += txt.charAt(i);
      }
    }
    return solve;
  }
}
