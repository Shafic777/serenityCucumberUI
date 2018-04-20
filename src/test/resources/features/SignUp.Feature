Feature: Singup in to imdb account
  In order to encourage buyers to make a purchase
  As a seller
  I want buyers to be able to see details about a product

  Scenario Outline:: Register for new account
    Given I have user details for sign up <Email> <Password> <Name>
    When I input the user details and submit
    Then I should be able to see my account page
#    And I should be able to relogin to my account adn logout
  Examples:
      | Email             | Password | Name |
      | Shaficemail       | test1234 | Shafic |
