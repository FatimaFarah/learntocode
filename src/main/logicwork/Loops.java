package src.main.logicwork;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Loops {

  //return fizz if multiple of 3,
  // buzz if multiple of 5,
  // fizzbuzz if multiple of both


  public String fizzBuzz(int x) {


    if (x % 3 == 0 && x % 5 == 0) {
      System.out.println("fizzbuzz");
    } else {
      System.out.println("boo you whore");
    }

    return "fizzbuzz";
  }

  public String fizz(int x) {
    if (x % 3 == 0) {
      System.out.println("fizz");
    } else {
      System.out.println("boo you whore");
    }

    return "fizz";
  }

  public String buzz(int x) {
    if (x % 5 == 0) {
      System.out.println("buzz");
    } else {
      System.out.println("boo you whore");
    }

    return "buzz";

  }
    //converts list into fizzbuzz

    public List<String> fizzBuzz (List < Integer > input) {

      String fizzBuzz;

      for (int i = 0; i % 3 == 0 ; i++) {
        System.out.println("fizz");

      }

      for (int i = 0; i % 5 == 0 ; i++) {
        System.out.println("buzz");

      }

      for (int i = 0; i % 3 == 0 && i % 5 == 0 ; i++) {
        System.out.println("fizzbuzz");

      }



      return Collections.emptyList();

    }

    //reads a csv file calls fizzbuzz

    public List<String> fizzBuzz (String path){

      return Collections.emptyList();
    }

    //join the lists together and sort them in numerical order
    //input will be an array of lists of integer
    public List<Integer> joinAndSort (List < Integer >...inputs) {

      return Collections.emptyList();
    }

  }

