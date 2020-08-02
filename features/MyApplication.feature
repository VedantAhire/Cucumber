Feature: Test Facebook smoke scenario

Scenario: Test login with valid credentials

 Given Open firefox and start application
When I enter valid "9422735655" and valid "selenium123"
Then user should be able to login successfully 