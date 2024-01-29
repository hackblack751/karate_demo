Feature: Register user

  Background:
    * url baseUrl
    * path '/api/register'


  Scenario:
    Given header Content-type = 'application/json'
    And request read('registerUserReq.json')
    When method POST
    Then status 200
    And match response == read('registerUserRes.json')

