package src.Practice;

public class SwitchStatements {

public SwitchStatements(){

    String course = "Biology";

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