package training.bdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegativeSideLengths() {
        new Square(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnZeroSideLengths() {
        new Square(-1);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(new Square(2).getArea(), 4);
    }
}