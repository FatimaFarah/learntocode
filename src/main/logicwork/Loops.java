package src.main.logicwork;

import java.util.Collections;
import java.util.List;

public class Loops {

  //return fizz if multiple of 3,
  // buzz if multiple of 5,
  // fizzbuzz if multiple of both



  public String fizzBuzz(int x) {

    if (x % 3 ==0) {
      System.out.println("fizz");
    }
    if (x % 5 ==0){
      System.out.println("buzz");
    }

    if (x % 3 ==0 && x % 5 == 0){
      System.out.println("fizzbuzz");
    }

    return "";
  }


  //converts list into fizzbuzz

  public List<String> fizzBuzz(List<Integer> input) {

    input.add(3);
    input.add(5);
    input.add(10);

    return Collections.emptyList();
  }




  //reads a csv file calls fizzbuzz
  public List<String> fizzBuzz(String path) {
    return Collections.emptyList();
  }

  //join the lists together and sort them in numerical order
  //input will be an array of lists of integer
  public List<Integer> joinAndSort(List<Integer>... inputs) {
    return Collections.emptyList();
  }

}
