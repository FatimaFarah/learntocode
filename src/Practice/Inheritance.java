package src.Practice;

//treehouse course

import java.util.Objects;

public class Inheritance {

  public static void main(String[] args) {

    Dog dog1 = new Dog("bark");
    Dog dog2 = new Dog("bark");

    System.out.println(dog1.equals(dog2));

    //System.out.println(dog.toString());
   // dog.findFood();

  }
}
  abstract class Animal {
  String sound = "";

  Animal(String sound){
    this.sound = sound;
  }

  abstract void findFood();

  void makeSound(){
    System.out.println(sound);
  }
    @Override //ctrl o = override menu
    public String toString() {
      return getClass().getSimpleName() + ": sound = " + sound;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Animal animal = (Animal) o;
      return Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
      return Objects.hash(sound);
    }
  }

  class Dog extends Animal {
  Dog(String sound) {
    super(sound);
  }

    @Override
    void findFood() {
      System.out.println("*looks at human*");
      makeSound();
    }

    @Override
    void makeSound() {
      super.makeSound();
      System.out.println("*wags tail*");
    }
  }

class DogFood {

}

//Cast - tell java object is a more specific object. Moving it up its family tree
// add () with the name of the class

//Object[] list = {new Dog(), new DogFood()};
// example 1 Dog dog = (Dog) list[0];