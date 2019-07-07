import java.util.*;
class Main {
   public static void main(String[] args) {
      int t;
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int n = sc.nextInt();
      t = x* (n+1);
      for(int i=0; i< n; i++ ) {
         t = t-sc.nextInt();
      }
      System.out.println(t);
   }

}
