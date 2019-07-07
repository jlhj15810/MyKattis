import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main{
   public static void main(String[] args) {
      List<String> inputs = new ArrayList<>();
      try{
         Scanner sc = new Scanner(System.in);
         int num_of_inputs = sc.nextInt();

         //To add the numbers in the list
         for(int i=0; i<num_of_inputs ; i++) {
            String final_string = "";
               int input_number = sc.nextInt();
            if(input_number % 2 ==0) {
               final_string += input_number + " is even";
            }
            else {
               final_string += input_number + " is odd";
            }

            inputs.add(final_string);
         }

         for(String i : inputs){
            System.out.println(i);
         }


      } catch(Exception e){
         System.out.println("You entered something wrong");
      }

   }
}
