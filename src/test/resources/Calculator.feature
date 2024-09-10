Feature: Calculator

  Scenario Outline: Do math
    Given the user opens the system calculator
    When the user enters first number "<first>"
    And the user presses on the "<sign>" sign
    And the user enters second number "<second>"
    Then the result is as expected
    Examples:
      | first | second | sign |
      | -10   | 3      | /    |
      | -22   | -30    | -    |
      | -11   | -5     | *    |
      | 13    | -5     | +    |