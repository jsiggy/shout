Feature:

  Scenario: an empty board has no objects
    Given the board has no objects on it
    When  no objects are added to the board
    Then the board object count is 0
    And the total area of objects on the board is 0

  Scenario: can add an object to a board
    Given the board has no objects on it
    When a square is added to the board
    Then the board object count is 1

  Scenario:  can calculate area for 1 object
    Given the board has no objects on it
    When a square with sides length 2 is added to the board
    Then the total area of objects on the board is 4

  Scenario: can add more than one type of shape
    Given the board has no objects on it
    When a square is added to the board
    And a circle is added to the board
    Then the board object count is 2

  Scenario: can calculate area for multiple types of shapes
    Given the board has no objects on it
    When a square with sides length 2 is added to the board
    And a circle with radius 4 is added to the board
    Then the total area of objects on the board is 54
