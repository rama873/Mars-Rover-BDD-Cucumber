Feature: Mars Rovers testcases

  @Write-a-test-for-Rover-direction-facing-and-positioning-initialisation
  Scenario: Test Rover Direction Facing and Positioning Initialization
    Given a rover is initialized at position 1 2 "N"
    Then the final position of the rover should be 1 2 "N"

  @Write-A-test-for-moving-the-rover-x-and-y-position-and-location
  Scenario: Test Rover Moving X and Y Position
    Given a rover is initialized at position 0 0 "N"
    When the rover moves with the command "MMM"
    Then the final position of the rover should be 0 3 "N"


  @Write-a-test-to-move-the-rover-as-per-the-given-scenario-problem
  Scenario: Test Rover Direction Facing as per given Position
    Given a rover is initialized at position 1 2 "N"
    When the rover moves with the command "LMLMLMLMM"
    Then the final position of the rover should be 1 3 "N"

    Given a rover is initialized at position 3 3 "E"
    When the rover moves with the command "MMRMMRMRRM"
    Then the final position of the rover should be 5 1 "E"

