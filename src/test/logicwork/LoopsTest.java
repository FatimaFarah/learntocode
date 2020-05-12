package src.test.logicwork;

import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;
import src.main.logicwork.Loops;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class LoopsTest {

  private Loops loops = new Loops();


  @Test
  public void shouldReturnFizzForMultiplesOf3() {
    assert(loops.fizz(3).equals("fizz"));
    assert(loops.fizz(9).equals("fizz"));
    assert(loops.fizz(4).equals("fizz"));

  }

  @Test
  public void shouldReturnFizzForMultiplesof5(){

    assert (loops.buzz(5).equals("buzz"));
    assert (loops.buzz(10).equals("buzz"));
    assert (loops.buzz(8).equals("buzz"));
  }


  @Test
  public void shouldReturnFizzBuzzForMultiplesof3And5(){

    assert(loops.fizzBuzz(15).equals("fizzbuzz"));
    assert(loops.fizzBuzz(30).equals("fizzbuzz"));
    assert(loops.fizzBuzz(16).equals("fizzbuzz"));

  }

  @Test
  public void testAssertThat(){
    assertThat(loops.fizzBuzz(15), is("fizzbuzz"));
  }

  @Test
  public void fizzbuzzListTest(){

    assert (loops.fizzBuzz().size());
  }




}
