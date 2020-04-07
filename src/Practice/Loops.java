package src.Practice;

import java.util.ArrayList;
import java.util.List;

public class Loops {

  public Loops(){


//While loops

    int chocolate = 0;

    while (chocolate > 10) {

      System.out.println(chocolate);
      chocolate++;

    }

    //For loops

    for (int i = 0; i < 5; i++) ;


    //For each loops

    //For-each loops allow you to directly loop through each item in a list of items (like an array or ArrayList) and perform some action with each item.
    // The syntax looks like this:

    List<String> someList = new ArrayList<String>();

    for (String item : someList) {
      System.out.println(item);
    }


  }
}