package src.Practice;

import java.util.HashMap;
import java.util.Map;

public class Maps {
  public Maps() {


    Map<String, String> meals = new HashMap<>();

    meals.put("breakfast", "Waffles");
    meals.put("lunch", "Beans");
    meals.put("dinner", "pizza");

    System.out.println(meals.get("dinner"));

    String lunch = meals.remove("lunch"); //to remove values, remove function does return a value
    //and can be encased within a String

    boolean hasLunch = meals.containsKey("lunch");
    boolean hasPizza = meals.containsValue("pizza");

    int size = meals.size();

    System.out.println(lunch + " " + hasLunch + " "  + hasPizza + " " + size);

    // prints out Beans false true 2 because we removed lunch, so the boolean is false, and we have
    //dinner so it returns true, and the 2 value is for how many values are in the list

    //maps don't allow duplicate keys


  }
}
