Feature: Retrieving information and performing search in amazon
  As a user I get information about what I want to lookfor in amazon
  then I type in the browser and show all the results in the console.

  @test
  Scenario: amazon_mobile_phone
    Given I retrieve information from the API
    When I lookfor these terms in amazon
#    Then I should see at least 1 result

