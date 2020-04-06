package src.Game;

public class Answer {

  private String answer;
  private int nextQuestionId;

  Answer(String answer, int nextQuestionId){
    this.answer = answer;
    this.nextQuestionId = nextQuestionId;
  }

  boolean Matches(String input){
    return input.equals(answer);
  }

  public String getAnswer() {
    return answer;
  }

  public int getNextQuestionId() {
    return nextQuestionId;
  }
}
