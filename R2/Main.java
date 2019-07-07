import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      try {
         int input = sc.nextInt();
         int input2 = sc.nextInt();
         if(input>1000|| input2 >1000 || input <-1000|| input2<-1000) {
            throw new IllegalArgumentException();
         } else {
            System.out.println( (input2*2)- input);

      }
      }
      catch(Exception e){
         System.out.println("Numbers not in range");
      }
   }
}
