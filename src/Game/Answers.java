package src.Game;

import java.util.ArrayList;
import java.util.Scanner;

public class Answers {

    public static void main(String[] args){


      String answerOne = "You stay in bed and ignore the loud noise";
      String answerTwo = "You leap out of bed and head towards your door!";
      String answerThree = "You follow the shadow";
      String answerFour = "You hide around the nearest corner";

      ArrayList<String> answers = new ArrayList<>();

      answers.add(answerOne);
      answers.add(answerTwo);
      answers.add(answerThree);
      answers.add(answerFour);


  }

  public static class Question  extends Answers{


    Scanner userInput = new Scanner(System.in);

    public Scanner getUserInput() {
      return userInput;
    }

    public String getScenarioOne() {
      return scenarioOne;
    }

    public String getNextQuestion() {
      return nextQuestion;
    }

    protected String scenarioOne = "You're in bed and hear a noise, what do you do?" + userInput;

    protected String nextQuestion = "You're now outside of your room but you can see a shadow at the end of the hallway, " +
        "what do you do?" + userInput;



  }

}