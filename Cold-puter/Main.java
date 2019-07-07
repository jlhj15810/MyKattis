import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      List<Integer> integer_list = new ArrayList<>();
      int num_of_cases = sc.nextInt();
      for(int i=0; i<num_of_cases; i++) {

         integer_list.add(sc.nextInt());
      }
      System.out.println(integer_list.stream().filter(x-> x<0).count());

   }
}
