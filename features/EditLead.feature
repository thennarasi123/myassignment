Feature: EditLead functionality of leaftaps application
#Background:
#Given Lauch the browser
#And load the url
@sanity
Scenario Outline: EditLead with multiple data
Given enter the username as 'demosalesmanager' and password as 'crmsfa'
When click on the login button
Then Homepage should be displayed
When click on crmsfa link
And click on Leads link
And click on find leads link
And enter the phonenumber <phonenumber>
And click on find leads link1
And click on first resulting leadID
When click on edit link
And updateleadform the companyname<companyname>
Then click on submit button

Examples:
|phonenumber||companyname|
|88||Infosys|





