package src.Game;

import java.util.*;

public class Game {

  private Scanner scanner;

  private List<Question> questions;

  public Game() {
    scanner = new Scanner(System.in);
    questions = new ArrayList<>();
  }

  void addQuestion(Question question) {
    questions.add(question);
  }

  public void run() {
    int currentQuestion = 0;
    while (currentQuestion != 1000) {
      Question current = getQuestion(currentQuestion);

      current.printQuestion();
      String userInput = scanner.nextLine();
      int nextQuestion = current.checkAnswer(userInput);
      if (nextQuestion == -1) {
        System.out.println("you dummy");
      } else {
        currentQuestion = nextQuestion;
      }
    }

  }

  //find the question with the right id, not the question in that position in the list

  private Question getQuestion(int id) {
    Question result = questions.get(id);

    for ( Question question : questions) {

    }

      return result;

  }

    public List<Question> getQuestions () {
      return questions;
    }


}

