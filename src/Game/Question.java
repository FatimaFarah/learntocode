package src.Game;

import java.util.ArrayList;
import java.util.List;

public class Question {

  // two answer options
  //"You have died"
  //"You can now proceed to the next question"

  int id;
  String question;
  List<Answer> answers = new ArrayList<>();


  public Question(int id, String questionText, List<Answer> answers) {
    this.id = id;
    this.question = questionText;
    this.answers = answers;

    answers.add();
    answers.add();


  }

  void printQuestion(){
    System.out.println(question);
  }





  int checkAnswer(String input){
    for (Answer answer : answers) {
      answer.Matches(input);
      if (answer.Matches(input)){
        return answer.getNextQuestionId();
      }
    }
    return -1;
  }

  //add if statement for if its -1
  //add a questions to it
}
