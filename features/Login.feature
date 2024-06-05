Feature: Login functionality of leaftaps application

#Background:
#Given Launch the browser
#And Load the url
@regression
Scenario: Login with positive credentials and verify
Given enter the username as 'demosalesmanager' and password as 'crmsfa'
When click on the login button
Then Homepage should be displayed

@functional
Scenario: Login with invalid credentials
Given enter the username as 'demosale' and password as 'crms'
When click on the login button
But errormessage should be displayed