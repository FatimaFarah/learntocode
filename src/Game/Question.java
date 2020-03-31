package src.Game;

import java.util.ArrayList;
import java.util.List;

public class Question {

  int id;

  String question;
  List<Answer> answers;
  
    answers.add("Stay in bed");
    answers.add("Investigate the noise");


  public Question(int id, String questionText, List<Answer> answers) {
    this.id = id;
    this.question = questionText;
    this.answers = answers;


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
