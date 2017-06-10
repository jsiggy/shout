package training.bdd;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TriangleTest {
    @Test
    public void shouldCalculateArea() {
        assertThat(new Triangle(4, 7).getArea(), is(14));
    }
}
