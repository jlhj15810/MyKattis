import java.util.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int answer =0;
      int num_of_addends = sc.nextInt();
      for(int i=0; i< num_of_addends; i++ ) {
         int number = sc.nextInt();
         int power = number %10;
         int real_number = number /10;
         answer += Math.pow(real_number,power);
      }
      System.out.println(answer);
   }

   //   static int recursive(int number_of_addends) {
   //      Scanner sc = new Scanner(System.in);
   //      int answer;
   //     
   //      if(number_of_addends ==0) {
   //         return answer;
   //      }
   //      else{
   //        int number = sc.nextInt();
   //         System.out.println(number);
   //         int power = number %10;
   //        int real_number = number/10;

   //       return  answer += Math.pow(real_number,power) + recursive(number_of_addends-1);
   //      }
   //  }
}
