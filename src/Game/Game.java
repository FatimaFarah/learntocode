package src.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

  private Scanner scanner;

  private List<Question> questions = new ArrayList<>();


  public Game() {


    questions.add(new Question(0,"You hear a noise, what do you do", "";
    questions.add(new Question(1,"You leave your room and see something","";


    scanner = new Scanner(System.in);
  }

  void addQuestion(Question question){
    questions.add(question);
  }



  private void run(){
    int currentQuestion =0;
    while (currentQuestion != 1000) {

      System.out.println(questions.get(currentQuestion).question);
      String userInput = scanner.nextLine();
      currentQuestion = questions.get(currentQuestion).checkAnswer(userInput);
    }

  }


  public List<Question> getQuestions() {
    return questions;
  }
}

