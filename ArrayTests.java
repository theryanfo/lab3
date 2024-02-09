import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input2 = {0, 1};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{1, 0}, input2);
	}

  @Test
  public void testReversed1() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

@Test
  public void testReversed2() {
    int[] input2 = {0, 2};
    assertArrayEquals(new int[]{2, 0}, ArrayExamples.reversed(input2));
  }
}