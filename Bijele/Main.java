import java.util.*;
class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int king = sc.nextInt();
      int queen = sc.nextInt();
      int rooks = sc.nextInt();
      int bishops = sc.nextInt();
      int knights = sc.nextInt();
      int pawns = sc.nextInt();
      String final_string = "";
      final_string += (1-king) + " ";
      final_string += (1-queen) + " ";
      final_string += (2-rooks) + " ";
      final_string += (2-bishops) + " ";
      final_string += (2-knights) + " ";
      final_string += (8-pawns) + "";
      System.out.println(final_string);
   }

}
