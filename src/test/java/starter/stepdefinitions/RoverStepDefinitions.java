package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

public class RoverStepDefinitions {
    public static final Integer N = 1;
    public static final Integer E = 2;
    public static final Integer S = 3;
    public static final Integer W = 4;
    private String command;
    private Integer x = 0;
    private Integer y = 0;
    private Integer facing = N;


    @Given("a rover is initialized at position {int} {int} {string}")
    public void initializeRover(Integer x, Integer y, String direction) {
        this.x = x;
        this.y = y;
        if (direction.equals("N")) {
            this.facing = 1;
        } else if (direction.equals("E")) {
            this.facing = 2;
        } else if (direction.equals("S")) {
            this.facing = 3;
        } else if (direction.equals("W")) {
            this.facing = 4;
        }

    }

    @When("the rover moves with the command {string}")
    public void roverMoves(String command) {
        for (int i = 0; i< command.length(); i++ ) {
            process(command.charAt(i));
        }
    }

    @Then("the final position of the rover should be {int} {int} {string}")
    public void verifyFinalPosition(Integer expectedX, Integer expectedY, String ExpectedDir) {
        String dir = "N";
        assertEquals(x, expectedX);
        assertEquals(y, expectedY);
        if (facing == 1) {
            dir = "N";
        } else if (facing == 2) {
            dir = "E";
        } else if (facing == 3) {
            dir = "S";
        } else if (facing == 4) {
            dir = "W";
        }
        assertEquals(dir, ExpectedDir);
        System.out.println(x +" "+ y +" " +dir);
    }

    public void process(Character command) {
        if (command.equals('L')) {
            turnLeft();
        } else if (command.equals('R')) {
            turnRight();
        } else if (command.equals('M')) {
            move();
        } else {
            throw new IllegalArgumentException("Speak in Mars language, please");
        }
    }
    private void turnLeft() {
        facing = (facing - 1) < N ? W : facing - 1;
    }
    private void turnRight() {
        facing = (facing + 1) > W ? N : facing + 1;
    }
    public void move() {
        if (facing == N) {
            this.y++;
        } else if (facing == E) {
            this.x++ ;
        } else if (facing == S) {
            this.y--;
        } else if (facing == W) {
            this.x--;
        }
    }


}
