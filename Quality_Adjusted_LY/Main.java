import java.util.*;

class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double counter =0;
      int num_of_input = sc.nextInt();
      for(int i=0; i< num_of_input; i++ ){
         double first_input = sc.nextDouble();
         double second_input = sc.nextDouble();
         counter += (first_input*second_input);
      }
      System.out.println(counter);

   }
}
