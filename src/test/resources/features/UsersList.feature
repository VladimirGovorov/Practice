Feature: Viewing the List of Employees in the PIM Module

Scenario: User can view the list of employees in the PIM module
  
Given The user is logged in to the OrangeHRM demo application
And The user is on the Dashboard page
When The user clicks on the "PIM" tab in the main navigation menu
And Selects the "Employee List" option from the dropdown menu
And Waits for the Employee List page to load
Then The user should be able to view the list of employees


