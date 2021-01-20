Feature: IFrame Test

  @smoke
  Scenario: Checking Frame 1 Text Happy Path
    Given User clicks AlertsFramesWindowsPage element
    And go to Frame page
    And user switch to frameOne and check the presence of the "This is a sample page"

  @smoke
  Scenario: Checking Frame 1 Text Negative Scenario
    Given User clicks AlertsFramesWindowsPage element
    And go to Frame page
    And user switch to frameOne and check not equal the presence of the "This is not a correct answer"