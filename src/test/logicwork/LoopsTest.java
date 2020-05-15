package src.test.logicwork;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;
import src.main.logicwork.Loops;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class LoopsTest {

  private Loops loops = new Loops();

  //fizz should return blank for 4
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

  //looks like you were having trouble setting up this test
  //the test is now right
  @Test
  public void fizzbuzzListTest(){
    List input = Arrays.asList(3,15,10, 4);
    assert (loops.fizzBuzz(input).equals(Arrays.asList("fizz", "fizzbuzz","buzz", "")));
  }

  //same test but with assertThat
  @Test
  public void fizzbuzzListAssertThatTest(){
    List input = Arrays.asList(3,15,10, 4);
    assertThat (loops.fizzBuzz(input), is(Arrays.asList("fizz", "fizzbuzz","buzz", "")));
  }

  @Test
  public void shouldAddUpAllEvenNumbers() {
    List input = Arrays.asList(3,15,10, 4, 8, 22, 5);
    assertThat(loops.sumOfEvens(input), is(44));
  }

  @Test
  public void shouldAddUpAllEvenAndOddNumbers() {
    List input = Arrays.asList(3,15,10, 4, 8, 22, 5);
    assertThat(loops.sumOfEvensAndOdds(input).get("even"), is(44));
    assertThat(loops.sumOfEvensAndOdds(input).get("odd"), is(23));
  }

}
