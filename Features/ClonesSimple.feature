#Author: ramp
###
## The features here are annotated functions in ClonesSimpleSteps.java
###
@tag
Feature: Do Something With CLONES
  Try out Cucumber and Selenium with CLONES website.

  Scenario: Surf to commonlanguage website and look at training material.
    Given I browse to CLONES website
    And I check for "Training" link
    When User clicks on the "Training" Link
    Then User clicks on the "Business Optimization Service" Link
