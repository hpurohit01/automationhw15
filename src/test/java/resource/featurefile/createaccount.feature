Feature: Create account page
  As a user i can create account successfully

@
  Scenario Outline: verify that user should create account successfully
    Given I am on home page
    When I click on sign in link
    And I enter email for create account "<email>"
    And I click on create new account button
    And I enter first name "<name>"
    And I enter last name "<surname>"
    And I enter register password "<password>"
    And I enter address "<add>"
    And I enter city "<city>"
    And I select state "<state>"
    And I enter postal code "<postal>"
    And I select country "<country>"
    And I enter phone number "<phone>"
    And I click on register button





    Examples:
      | email                | name   | surname | password  | add          | city       | state | postal | country | phone      |
      | prime@gmail.com      | Prime  | tester  | 123456    | 35 walmart   | watford    | 44    | 54123  | 44      | 07901236565 |
