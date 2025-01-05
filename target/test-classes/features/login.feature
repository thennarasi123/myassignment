Feature: Login functionality of orangeHRM application

#Background:
#Given Launch the browser
#And Load the url
Scenario: login with the credential details
Given enter the username as "Admin" and password as "admin123"
When click on the login button
Then mydashboardpage should be displayed


