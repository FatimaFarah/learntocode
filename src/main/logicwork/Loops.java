package src.main.logicwork;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Loops {

  //return fizz if multiple of 3,
  // buzz if multiple of 5,
  // fizzbuzz if multiple of both

  // NOTE fizzbuzz, fizz and buzz were meant to be all one mthod called fizzBuzz
  // NOTE return the answer instead of printing it out



  public String fizzBuzz(int x) {

    if (x % 3 == 0 && x % 5 == 0) {
      return "fizzbuzz";
    }
    if (x % 3 == 0) {
      return "fizz";

    }

    if (x % 5 == 0) {
      return "buzz";
    }


    else {
      return "";
    }
  }

    //converts list into fizzbuzz

    public List<String> fizzBuzz (List < Integer> input) {
      input = new ArrayList<>();






      //These loops aren't quite right
      //This loop will only run once
      // first iteration i = 0, 0%3 = 0 so it will run
      // second iteration i=1, 1%3 = 1 not 0 so terminate loop



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

    //return sum of all even numbers in the list
    public int sumOfEvens(List<Integer> input) {
      return 0;
    }

    //return sum of all odd numbers in the list
    public int sumOfOdds(List<Integer> input) {
      return 0;
    }

    //return key value map where even = sum of all the even numbers and odd = sum of all the odd number
    public Map<String, Integer> sumOfEvensAndOdds(List<Integer> input) {
      return Collections.emptyMap();
    }
  }



