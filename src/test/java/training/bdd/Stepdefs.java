package training.bdd;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class Stepdefs {

    private Board board;

    @Given("^the board has no objects on it$")
    public void the_board_has_no_objects_on_it() throws Throwable {
        board = new Board();
    }

    @When("^no objects are added to the board$")
    public void no_objects_are_added_to_the_board() throws Throwable {
    }


    @When("^a square is added to the board$")
    public void a_square_is_added_to_the_board() throws Throwable {
        a_square_with_sides_length_is_added_to_the_board(2);
    }

    @When("^a square with sides length (\\d+) is added to the board$")
    public void a_square_with_sides_length_is_added_to_the_board(int arg1) throws Throwable {
        Shape shape = new Square(2);
        board.add(shape);
    }

    @When("^a circle with radius (\\d+) is added to the board$")
    public void aCircleWithRadiusIsAddedToTheBoard(int radius) throws Throwable {
        Circle circle = new Circle(radius);
        board.add(circle);
    }

    @Then("^the board object count is (\\d+)$")
    public void the_board_object_count_is(int objectCount) throws Throwable {
        assertThat(board.count(), is(objectCount));
    }

    @Then("^the total area of objects on the board is (\\d+)$")
    public void the_total_area_of_objects_on_the_board_is(int areaOfObjects) throws Throwable {
        assertThat(board.calculateAreaOfObjects(), is(areaOfObjects));
    }

}
