package training.bdd;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BoardTest {
    @Test
    public void shouldBeEmptyInitially() {
        assertThat(new Board().count(), is(0));
    }

    @Test
    public void shouldAllowAnObjectToBeAdded() {
        Board board = new Board();
        board.add(new Square(1));
        assertThat(board.count(), is(1));
    }

    @Test
    public void shouldAllowMultipleObjectsToBeAdded() {
        Board board = new Board();
        board.add(new Square(1));
        board.add(new Circle(5));
        assertThat(board.count(), is(2));
    }

    @Test
    public void shouldCalculateObjectArea() {
        Board board = new Board();
        board.add(new Square(4));
        assertThat(board.calculateAreaOfObjects(), is(16));
    }

    @Test
    public void shouldCalculateObjectAreaForMultipleObjects() {
        Board board = new Board();
        board.add(new Square(6));
        board.add(new Circle(10));
        assertThat(board.calculateAreaOfObjects(), is(350));
    }
}