import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int hour = sc.nextInt();
      int minutes = sc.nextInt();
      int minused_minutes = minutes-45;
      int real_hour = hour;
      int real_minutes = minutes;
      //If less than 0, means need to add the hour
      if(minutes<45) {
        real_minutes += 60;
         if(real_hour <1) {
            real_hour += 24;
         }
         --real_hour;
      }
     real_minutes -= 45;
      System.out.println( real_hour + " " + real_minutes);
   }
}

