import java.util.*;

class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String first_word = sc.next();
      String second_word = sc.next();
      int first_word_length = first_word.length();
      int second_word_length = second_word.length();
      if(second_word_length>first_word_length) {
         System.out.println("no");
      }
      else{
         System.out.println("go");
      }

   }
}
