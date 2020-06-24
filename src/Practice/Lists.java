package src.Practice;

import java.util.ArrayList;
import java.util.List;

public class Lists {
  public static void main(String[] args) {

    //following Treehouse course

    List<String> groceryLine = new ArrayList<>();
    groceryLine.add("Jerome");
    groceryLine.add("Beth");
    groceryLine.add("Sam");

    System.out.println(groceryLine);

    groceryLine.remove(1);

    System.out.println(groceryLine); //removes beth from the list

    String jerome = groceryLine.get(0);

    System.out.println(jerome); //prints out jerome

    int samIndex = groceryLine.indexOf("Sam");
    System.out.println(samIndex); //prints out 1

    System.out.println(groceryLine.size()); //prints out 2

    for (String name : groceryLine) {
      System.out.println(name);
    } //prints out names

    groceryLine.clear(); //clears all names in the list
    groceryLine.set(2, "Brandon"); //which replaces the item at the specified index.
    groceryLine.toArray(); //which returns an array containing the same elements as our list.





  }


}
