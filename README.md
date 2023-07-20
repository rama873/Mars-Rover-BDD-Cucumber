
## The Mars-Rover project
Automation Repostory build with Serenity and Cucumber is to clone or download the starter project on Github ([]()). 
This project gives you a basic project setup, along with some sample tests and supporting classes. 

### The project directory structure
The project has build scripts for Maven, and follows the standard directory structure used in most Cucumber - Serenity projects:
```Gherkin
src
  + main
  + test
    + java                        Test runners and supporting code
    + resources
      + features                  Feature files
          Rover.feature
```

### The sample scenario

```Gherkin
Scenario: Test Rover Direction Facing as per given Position
  
Given a rover is initialized at position 1 2 "N"
When the rover moves with the command "LMLMLMLMM"
Then the final position of the rover should be 1 3 "N"
```


### Executing the tests
To run the sample project, you can either just run the `CucumberTestSuite` test runner class, or run `mvn verify` 

```json
$ mvn clean verify 
```

### Generating the reports
The test results will be recorded in the `target/site/serenity` directory.
Below is the sample report with list of the tests.


