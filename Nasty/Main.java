import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main{
   public static void main(String[] args) {
      List<String> output = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      int num_of_cases = sc.nextInt();

      for(int i=0; i<num_of_cases; i++) {
         String final_string = "";
         int r_value = sc.nextInt();
         int e_value = sc.nextInt();
         int c_value = sc.nextInt();
         int profit = e_value - c_value;
         //If profit is more than the amount of money you dont advertise
         if(profit > r_value){
            final_string += "advertise";
         } else if(profit < r_value) {
            final_string += "do not advertise";
         }
         else {
            final_string += "does not matter";
         }
         output.add(final_string);
      }

      for(String k : output){
         System.out.println(k);
      }
   }
}
