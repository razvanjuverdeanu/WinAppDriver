Feature: Calculator

  Scenario Outline: Do math
    Given the user opens the system calculator
    When the user enters number "<first>"
    And the user enters number "<second>"
    When the user presses on the + sign
    Then the result is as expected
    Examples:
      | first | second |
      | 1     | 2      |