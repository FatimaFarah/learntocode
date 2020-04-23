package src.main.Game;

import javax.management.AttributeList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
  private static Game game;

  public static void main(String[] args) {
    setUpGame();
    runGame();
  }

  private static void setUpGame() {
    game = new Game();
    addQuestions();

  }

  private static void runGame() {
    System.out.println("starting game");
    game.run();
  }

  //add questions/answers
  private static void addQuestions() {

    List<Answer> answer = Arrays.asList(new Answer("get up", 10),
      new Answer("ignore it", 20));
    Question question1 = new Question(0, "You hear a noise, what do you do", answer);

    game.addQuestion(question1);
    game.addQuestion(new Question(10, "You leave your room and see something",
      Collections.singletonList(new Answer("Answer 1", 1000))));
    game.addQuestion(new Question(20, "you go back to sleep",
      Collections.singletonList(new Answer("Answer 2", 1000))));
  }

  //mess around with matches method when done
}
