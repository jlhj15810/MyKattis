import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double cost = sc.nextDouble();
      int number = sc.nextInt();
      double answer = 0.000000;
      for (int i=0; i<number; i++ ) {
         answer = answer + (sc.nextDouble() * sc.nextDouble() * cost);
      }
      System.out.printf("%.6f", answer);
      // I Love Claire


   }


}
