package src.Game;

import java.util.ArrayList;
import java.util.List;

public class Main {
  private static Game game;

  public static void main(String[] args) {
    setUpGame();
    runGame();
  }

  private static void setUpGame() {
    game = new Game();
    List<Answer> answers= new ArrayList<>();
    answers.add(new Answer("answer 1", 1));
    game.addQuestion(new Question(0, "first question", answers));
  }

  private static void runGame() {
    System.out.println(game.getQuestions().size());

  }
}

//add questions/answers

//mess around with matches method when done