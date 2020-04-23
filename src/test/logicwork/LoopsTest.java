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

}
