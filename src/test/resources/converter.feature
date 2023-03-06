Feature:Cuke

Scenario: 1 Get a numeral
Given I want a Roman Numeral for 50
When I get the numeral
Then I get "L"