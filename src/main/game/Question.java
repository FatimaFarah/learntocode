package src.main.game;

import java.util.List;

public class Question {

  int id;
  String question;
  List<Answer> answers;


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
      if (answer.Matches(input)){
        return answer.getNextQuestionId();
      }
    }
    return -1;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public List<Answer> getAnswers() {
    return answers;
  }

  public void setAnswers(List<Answer> answers) {
    this.answers = answers;
  }
}
