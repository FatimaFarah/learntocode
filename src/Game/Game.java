package src.Game;

import java.util.Scanner;
import java.util.ArrayList;

public class Game extends Answers {

  //to use variables from another class you have to create that class
  //Answers answer1 = new Answers();
//System.out.println(answer1.answerOne);


  public static void main(String[] args) {

    Answers answer1 = new Answers();
    Question question1 = new Question();



    System.out.println("WELCOME TO FATIMA'S TEXT BASED GAME");
    System.out.println(question1.getScenarioOne);

      if (question1.getScenarioOne = Boolean.parseBoolean(answer1.answerOne)) {
        System.out.println("You rush out of bed in order to identify the noise and leave your room!");
      }
      else if (question1.getScenarioOne= Boolean.parseBoolean(answer1.answerTwo)) {
        System.out.println("You have died");
      }

      System.out.println("You're now outside your room and you see the looming shadow" + question1.getUserInput);

      if (question1.getScenarioOne = Boolean.parseBoolean(answer1.answerThree)) {
        System.out.println("The shadow grabbed you and killed you");
      }
      else if (question1.getScenarioOne = Boolean.parseBoolean(answer1.answerFour)) {
        System.out.println("You run the other way and come across a knife on a table");
      }

    }

  }


