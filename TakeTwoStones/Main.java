import java.util.*;
class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num_of_stones = sc.nextInt();
      if(num_of_stones%2 !=0) {
         System.out.println("Alice");
      }
      else{
         System.out.println("Bob");
      }
   }

}
