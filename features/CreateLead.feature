Feature: CreateLead functionality of leaftaps application

#Background:
#Given Launch the browser
#And Load the url
@regression @smoke
Scenario Outline: Createlead with multiple data
Given enter the username as 'demosalesmanager' and password as 'crmsfa'
When click on the login button
Then Homepage should be displayed
When click on the crmsfa link
And click on leads link
And click on CreateLead link
And enter the company as <companyname>
And enter the firstname as <firstname>
And enter the lastname as <lastname>
When click on the submit button
Then viewleads page should be displayed as <companyname>

Examples:
|companyname||firstname||lastname|
|testleaf||thennarasi||N|
|qeagle||vidhya||S|


