import java.util.Scanner;
import java.util.*;
class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input_string = sc.next();
      String final_string = "";

      for(int i=0; i<input_string.length(); i++) {
         char currentCharacter = input_string.charAt(i);
         if(Character.isUpperCase(currentCharacter)) {
            final_string += currentCharacter;
         }
      }

      System.out.println(final_string);
   }
}
