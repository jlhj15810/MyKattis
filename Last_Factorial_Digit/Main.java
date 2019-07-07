import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      int final_answer;
      Scanner sc = new Scanner (System.in);
      int num_test_case = sc.nextInt();
      for(int i=0; i<num_test_case; i++) {
         int number = sc.nextInt();
         int answer = 1 ;
         for(int j=1; j<number+1; j++){
            answer = answer*j;
         }
         answer %=10;
         System.out.println(answer);
      }
   }
}
