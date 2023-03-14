@triSoft1
Feature: verify the careers feature
   Scenario: search a clinical vacancy available  in london
    Given User are on HomePage
    When user click on careers link
    Then user are on careers page contains url as "https://careers.optimahealth.co.uk/jobs/"
    And user verify the company logo is displayed on career page
    Given user click on view all Jobs
    And user enter "Clinical" in search bar
    And user select a location is "London"
#    When user click on search button
#    Then user should see the job available in london is displayed in page
#    And user verify the total available job is 15
#    And user print the all job title