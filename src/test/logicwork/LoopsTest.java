package src.test.logicwork;

import java.util.List;
import org.junit.Test;
import src.main.logicwork.Loops;
import java.util.ArrayList;

public class LoopsTest {

  private Loops loops = new Loops();

  @Test
  public void shouldReturnFizzForMultiplesOf3() {
    assert(loops.fizzBuzz(3).equals("fizz"));
    assert(loops.fizzBuzz(9).equals("fizz"));
    assert(!loops.fizzBuzz(4).equals("fizz"));
  }

  @Test
  public void shouldReturnFizzForMultiplesof5(){
    assert (loops.fizzBuzz(5).equals("buzz"));
    assert (loops.fizzBuzz(10).equals("buzz"));
    assert (!loops.fizzBuzz(8).equals("buzz"));
  }


  @Test
  public void shouldReturnFizzBuzzForMultiplesof3And5(){
    assert (loops.fizzBuzz(15).equals("fizzbuzz"));
    assert (loops.fizzBuzz(30).equals("fizzbuzz"));
    assert (!loops.fizzBuzz(16).equals("fizzbuzz"));
  }

}
