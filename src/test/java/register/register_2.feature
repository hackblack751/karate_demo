Feature: Register User

  Background:
    * url baseUrl
    * path '/api/register'

  Scenario:
    Given header content-type = 'application/json'
    And request {firstName: 'Henry', lastName: 'Johnson', birthYear: 1992}
    When method post
    Then status 200
    And match response == {id: 1, fullName: 'Henry Johnson', birthYear: 1992}