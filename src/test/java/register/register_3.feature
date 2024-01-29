Feature: Register multiple users

  Background:
    * url baseUrl
    * path '/api/register'

  Scenario Outline:
    Given header content-type = 'application/json'
    And request <request>
    When method post
    Then status 200
    And match response == <response>

    Examples:
      | request |response |
      | {firstName: 'Henry', lastName: 'Johnson', birthYear: 1992}  |{"id": 1, "fullName": "Henry Johnson", "birthYear": 1992}   |
      | {firstName: 'Dung', lastName: 'Nguyen', birthYear: 1993}    |{"id": 1, "fullName": "Dung Nguyen", "birthYear": 1993}   |