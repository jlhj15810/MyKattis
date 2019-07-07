import java.util.Scanner;
class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int v = sc.nextInt();
      int a =(int) Math.toRadians(v);
      System.out.println(a);

      //System.out.println((int) (h/(Math.sin(v))));
   }
}
