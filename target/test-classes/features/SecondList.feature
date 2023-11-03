Feature: Approve leave of absence request 

@ApproveLeave
Scenario: User can successfully approve leave of absence request
  
Given The user is logged into Orange HRM Demo application
When User has navigated to the "Dashboard" Page
And User clicks on the Leave tab
And User makes the necessary changes
Then Successfully updated Pop Up should appear

 
 