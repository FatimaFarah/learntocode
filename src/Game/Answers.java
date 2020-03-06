package src.Game;

import java.util.Scanner;

public class Answers {



      public String answerOne = "You stay in bed and ignore the loud noise";
      public String answerTwo = "You leap out of bed and head towards your door!";
      public String answerThree = "You follow the shadow";
      public String answerFour = "You hide around the nearest corner";



      /*ArrayList<String> answers = new ArrayList<>();

      answers.add(answerOne);
      answers.add(answerTwo);
      answers.add(answerThree);
      answers.add(answerFour); */


  }

  class Question extends Answers {


  public boolean getScenarioOne;
  public boolean getUserInput;


  Scanner userInput = new Scanner(System.in);


    protected String scenarioOne = "You're in bed and hear a noise, what do you do?" + userInput;

    protected String nextQuestion = "You're now outside of your room but you can see a shadow at the end of the hallway, " +
        "what do you do?" + userInput;



  }

