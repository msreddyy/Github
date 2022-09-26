Feature: Post feature of facebook
  This will test the functionality at the user wall


  Scenario: Post a message on the user wall
    Given User should be logged in and should be present at its own wall
    When I type the message in the text box
    And Click on post button
    Then the message should get posted