package nr1.imperative;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Live {
  public static void main(String[] args) {    
    
      List<Integer> numbers = Arrays.asList(new Integer[] { 1,2,3,4,5,6 });
      
      // external iterator
//      for (int i = 0; i < numbers.size(); i++) {
//          System.out.println(numbers.get(i));
//      }
      
      // external iterator
      for (int e : numbers) {
          System.err.println(e);
      }

      numbers.forEach(new Consumer<Integer>() {

          @Override
          public void accept(Integer i) {
              System.out.println(i);
          }
          
      });
  }
}
