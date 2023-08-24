#Author: Abdalla
#Total 10 Scenarios


Feature: Home Page Functionality
      As a user I want to view the functionalities on home page

  Background:
     Given user navigate to the website


  #1 Categories And Banners T68-MPD-46
	#@ignore
  @Regression1 @Sanity
  Scenario: Verify the Default categories for Home page
   	Then verify default categories include Recommended vidoes
    Then verify default categories include  Top Trending vidoes
    Then verify default categories include New release vidoes
    Then verify default categories include Most watched vidoes


  #2 Categories And Banners T73-MPD-46
	#@ignore
  @Regression @Sanity
  Scenario:  Verify the Default categories for Home page registered user
    When registered user access the application
   	Then verify registered user default categories include Most watched vidoes
    Then verify registered user default categories include  Top Trending vidoes
    Then verify registered user default categories include  New release vidoes
    Then verify registered user default categories include Reccommended videos



  #3 TC22-TC18-MPD-52
	#@ignore
  @Regression @Sanity
  Scenario: Verify the like and dislike video functionality
    When user clicks on a video and clicks on like and dislike
   	Then verify signin popup after clicking signin popup
    When registered user access the application
    And  registered user clicks on a video and clicks on like and dislike
    Then verify the like and dislike symbol is highligted seperately


	#4 T6-MPD-53
	#@ignore
	@Regression @Sanity
	Scenario: Verify Adding comment functionality to a video
	When user clicks on a video
	Then verify comment section for a guest user
	When user clicks on signin to add comments
	Then signs in
	When user begins commenting including emojis
	Then Comment should be displayed
	When user clicks on reply to comment
	Then user begins commenting again using emojis
	Then user comments on reply but submits
	Then comment should be displayed underneath the first


	#5 T300-MPD-53
	#@ignore
	@Regression
	Scenario: Verify post button functionality
	When user clicks on a video
	Then user clicks on signin to add comments
	When signs in as user
	Then user adds a comment and clicks post many times
	Then verify the comment was only posted once
	When user clicks on reply to comment under comment
	Then user adds a reply comment and clicks post many times
	Then verify the reply comment was only posted once


	#6 T301-MPD-53
	#@ignore
	@Regression
	Scenario: Verify added comments display for a different user
	When user adds a comment including emojis
	Then user signs out and another user signs in
	Then verify the first users comment is visible



	#7 T9-MPD-290
	@Regression @Sanity
	Scenario: Verify delete comment functionality
  When registered user access the application
	When user clicks on a video
	Then user begins commenting using emojis
	When user clicks on the three dots next to the comment
	Then the delete option should be displayed
	When user clicks on the delete option
	When user clicks cancel on the delete comment pop-up
	Then verify the delete comment pop-up is removed
	When user clicks on the three dots next to the comment
	Then user clicks on the delete option
	When user clicks delete
	Then verify the comment is deleted
	Then Delete reply comment and verify






	#8 T154-MPD-290
	@Regression @Sanity @test2
	Scenario: Verify the user and video report functionality
  When registered user access the application
	When user clicks on a video
	Then user clicks on the three dots of the video
#	When user clicks on the report user option
#	Then verify the correct options are displayed for user
	Then user clicks on the three dots of the video
	When user clicks on the report video option
	Then verify the correct options are displayed for video
	When user reports video multiple times
#	Then user should be able to report many times
	When user navigates to MyPlay on homepage and user clicks on a video
	Then verify no three dots are displayed by the video






	#9 T272-MPD-1069
	#@ignore
	@Regression @Sanity
	Scenario: Verify the mobile app download links displayed on the web application
	Then verify the download icons are displayed in the top right corner
	When user clicks on the ios icon
	Then user is redirected to the respective ios page
	When user clicks on the android icon
	Then user is redirected to the respective android page



	#10 T132-MPD-1069
	#@ignore
	@Regression
	Scenario: Verify the footer links for social media
	When user navigates to the footer
	Then verify the socialmedia links on the footer

	#11 T287

	@Regression
	Scenario: Report comment functionality
	When login the app and access your video
	When Click on the three dots of the comment posted by the other users
	Then Select report option from dropdown
	Then validate the content of report popup
	Then Select the reason for report and click submit

	@Regression
	Scenario: verify details of functionality
	When navigate to myplay section and click view all
	Then Verify the myplay videos details
	When Click on search icon and search my play video
	Then Verify the myplay videos details
	Then Access the myplay video displayed on other section like new release and trending
	Then Verify the myplay videos details
	Then Login to application as user
	Then Access my play video displayed Myplay and other sections like new release, continue watch, Trending, suggested videos
	Then Play a Myplay video and verify the player user options and verify the video details displayed



