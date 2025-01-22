import java.text.DateFormatSymbols;
public class Demo {
   public static void main(String[] args) {
      String[] days = new DateFormatSymbols().getWeekdays();
      for (int i = 0; i < days.length; i++) {
         String weekday = days[i];
         System.out.println(weekday);
      }
   }
}
