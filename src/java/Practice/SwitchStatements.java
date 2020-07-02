package Practice;

public class SwitchStatements {

public SwitchStatements(){

    String course = "Biology";
    //without a break statement switches carry on
    //with the input Biology the bellow statement will run the biology case and the default
    switch (course) {
      case "Algebra":
        // Enroll in Algebra

      case "Biology":
        // Enroll in Biology

      case "History":
        // Enroll in History

      case "Theatre":
        // Enroll in Theatre

      default:
        System.out.println("Course not found");
    }
  }
}