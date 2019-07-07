import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int width = sc.nextInt();
      int height = sc.nextInt();
      int calculated_width_height =(int) Math.sqrt((width*width) + (height*height));

      for(int i=0; i<number; i++) {
         if(calculated_width_height >= sc.nextInt()) {
            System.out.println("DA");
         }
         else{
            System.out.println("NE");
         }
      }
   }
}
