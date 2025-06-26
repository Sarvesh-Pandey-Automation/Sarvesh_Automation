
@tag
Feature: Create Campaign
  I want to use this template for my feature file


  @tag2
  Scenario Outline: Create Onsite Notification with Existing Template
    Given I Navigate to "On-site Notifications" page via "Web Personalization"
    Then I clicked on create notification button
    Then I added the new campaign tile name as <title> 
    Then I selected the audience type as show to Unknown user 
    Then I clicked on save&continue button
    Then I applied template type filter "GLOBAL"
    Then I Searched and Selected the template with name "Just Arrived"
    Then I clicked on save&continue button
    Then I clicked on save&continue button
    Then I clicked on launchCamapign button

    Examples: 
      |title 				|templateName 										|
      |Updated-13	  |Personalisation_Test							| 
  
  
  
  
  @tag3
  Scenario Outline: Create Onsite Notification with Existing Template
     Given I Navigate to "On-site Notifications" page via "Web Personalization"
    Then I clicked on create notification button
    Then I added the new campaign tile name as <title> 
    Then I selected the audience type as show to Unknown user 
    Then I clicked on save&continue button
    Then I Searched and Selected the template with name "Recommendation"
    #Then I Searched and Selected the template with name "Exit Intent - Unknown to known"
    Then I clicked on save&continue button
    Then I clicked on save&continue button
    Then I clicked on launchCamapign button

    Examples: 
      |title 				|templateName 										|
      |Updated-13	  |Personalisation_Test							| 
  
  
  @tag4
  Scenario Outline: Create Onsite Notification with Existing Template
    Given I Navigate to "On-site Notifications" page via "Web Personalization"
    Then I clicked on create notification button
    Then I added the new campaign tile name as <title> 
    Then I selected the audience type as show to Unknown user 
    Then I clicked on save&continue button
    Then I applied template type filter "GLOBAL"
    Then I Searched and Selected the template with name "Just rArrived"
    Then I clicked on save&continue button
    Then I clicked on save&continue button
    Then I clicked on launchCamapign button

    Examples: 
      |title 				|templateName 										|
      |Updated-13	  |Personalisation_Test							| 
  