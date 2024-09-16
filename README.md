# Test automation framework using Java, Windows Application Driver, Cucumber (including PicoContainer)

# Cucumber test case:
* Given the user opens the system calculator
* When the user enters number 1
* And the user enters number 2
* When the user presses on the <operation> sign
* Then The result is as expected

 ## Constraints:

- Each step needs to be created in a separate class
- Step needs to call a helper method, which is going to take two integers and an operation enum, helper method shall return the expected result, double 2 digits rounded.
- Step shall press on the equal sign on the calculator an obtain the result from the calculator, also needs to call the helper method and assert that the both results are equal. Make sure the result obtained on the calculator is also a double 2 digits rounded.
- Consider that you can enter positive/negative values and operation can be +-*/
- Extend the test to be a cucumber "Scenario Outline" add several tests, with several operations and results with multiple digits 
