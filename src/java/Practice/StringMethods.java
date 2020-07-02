package Practice;

import org.w3c.dom.ls.LSOutput;

public class StringMethods {

  public StringMethods() {


  String firstName = "Fatima";
    String lastName = "Farah";

    //length()

    System.out.println(firstName.length());
    System.out.println(lastName.length());


    //concat()

    //The concat() method concatenates one string to the end of another string.
    // Concatenation is the operation of joining two strings together.
    //(Joins together two strings into one)

    System.out.println(firstName.concat(lastName));


    //equals()

    System.out.println(firstName.equals("fatima"));


    // indexOf()

    String letters = "ABCDEFGHIJK";

    System.out.println(letters.indexOf("H"));

    // charAt()

    System.out.println(letters.charAt(2));

    // substring()

    //There may be times when we only want a part of a string.
    // In such cases, we may want to extract a substring from a string.

    System.out.println(letters.substring(3));

    // toUpperCase() / toLowerCase()

    System.out.println(firstName.toUpperCase());
    System.out.println(lastName.toLowerCase());


  }
}