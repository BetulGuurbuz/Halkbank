Feature: HalkBank Search Branch
  Scenario: Going to branch page from homepage
    Given User at home page
    When Accept cookies
    Then Click Sube ve ATM Arama
    Given Write city textbox Ankara
    Given Write district textbox Golbasi
    When Branch is select branch
    Then Click search button
