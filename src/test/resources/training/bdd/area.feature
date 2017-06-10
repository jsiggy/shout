Feature:

  Scenario:
    Given the board has no objects on it
    When  no objects are added to the board
    Then the board object count is 0

  Scenario:
    Given the board has no objects on it
    When  no objects are added to the board
    Then the total area of objects on the board is 0

  Scenario:
    Given the board has no objects on it
    When a square is added to the board
    Then the board object count is 1

  Scenario:
    Given the board has no objects on it
    When a square with sides length 2 is added to the board
    Then the total area of objects on the board is 4

  Scenario:
    Given the board has no objects on it
    When a square with sides length 2 is added to the board
    And a circle with radius 4 is added to the board
    Then the total area of objects on the board is 54
