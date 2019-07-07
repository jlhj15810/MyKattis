import java.util.Scanner;

class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      try{
         int x_value = sc.nextInt();
         int y_value = sc.nextInt();
         if (x_value>0 && y_value >0){
            System.out.println("1");
         }
         else if (x_value>0 && y_value<0){
            System.out.println("4");
         }
         else if(x_value<0 && y_value>0) {
            System.out.println("2");
         }
         else if (x_value<0 && y_value<0) {
            System.out.println("3");
         }
      }
      catch(Exception e) {
         System.out.println("Something went wrong");
      }
   }
}
