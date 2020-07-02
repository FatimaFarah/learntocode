package main.logicwork;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;
import main.logicwork.Loops;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class LoopsTest {

  private Loops loops = new Loops();

  //fizz should return blank for 4

  @Test
  public void shouldReturnFizzBuzzForMultiplesOf3() {
    assert(loops.fizzBuzz(3).equals("fizz"));
    assert(loops.fizzBuzz(9).equals("fizz"));
    assert (loops.fizzBuzz(15)).equals("fizzbuzz");
    assert(loops.fizzBuzz(4).equals(""));
  }


  @Test
  public void testAssertThat(){
    assertThat(loops.fizzBuzz(15), is("fizzbuzz"));
  }

  ////////

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
