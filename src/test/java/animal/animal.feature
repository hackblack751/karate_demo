Feature: Search for a animal

  Background:
    * url baseUrl
    * path '/api/animal'

  Scenario:
    Given params { name: 'dog' }
    When method get
    Then status 200
    And match response == {animal: 'dog'}
