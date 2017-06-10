package training.bdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CircleTest {

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForNegativeRadius() {
        new Circle(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionForZeroRadius() {
        new Circle(0);
    }

    @Test
    public void shouldCalculateArea() {
        Circle circle = new Circle(10);
        assertThat(circle.getArea(), is(314));
    }
}