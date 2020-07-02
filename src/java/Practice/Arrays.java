package Practice;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

  public static void main(String[] args) {

    // write a method that takes in a list of numbers and returns a new list containing all the numbers less than 4
    // then do the same thing but arrays instead of lists


    //Array

    int[] listOfNumbers = {1,2,3,4,5,6,7,8,9};

    for (int i = 0; i < 4; i++) {
      System.out.println(listOfNumbers[i]);

      //System.out.printf("%s These numbers should return a value less than 4 %n",
        //  listOfNumbers[i]);
    }

    //List

    List<Integer> listTest= new ArrayList();

    listTest.add(1);
    listTest.add(2);
    listTest.add(3);
    listTest.add(4);
    listTest.add(5);
    listTest.add(6);
    listTest.add(7);
    listTest.add(8);
    listTest.add(9);

    for (int i = 0; i< 4; i++) {

      System.out.println((i));
    }

  }
}