Feature: feature to test loading of the Homepage

  Scenario: Check the ui elements of the homepage Navigation

    Given user is on home page
    When home page loads
    And user clicks on tab home
    Then user is redirected to the current page of the web application

