Feature: Cuke testing

Scenario: Get a numeral
Given I want a Roman Numeral for 50
When I get the numeral
Then I get "L"