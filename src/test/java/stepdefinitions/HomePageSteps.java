package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HomePageSteps {

	@Steps
	steps.MContentSteps content;
	steps.commentsSectionSteps comment;
	steps.videosSteps videos;
	steps.MbrowsePageSteps mbrowserpage;
	steps.videoCategoriesSteps videocategories;
	steps.videoAdsSteps videoAdsSteps;

  @Given("user navigate to the website")
  public void user_navigate_to_the_website() {

    content.navigate();
  }
//    content.navigate();
//  }

//  @When("guest user access the application")
//  public void guest_user_access_the_application() {

	@When("guest user access the application")
	public void guest_user_access_the_application() throws IOException {

		content.guestuserlogin();

	}

	@And("guest user access the application and clicks on signup")
	public void guest_user_access_the_application_and_clicks_on_signup() {
		try {
			content.guestusersignup();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@And("guest user Registers")
	public void guest_user_registers() {

		try {
			content.guestuserregistration();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	@And("verifies About and privacy policy")
//	public void verifies_about_and_privacy_policy() {
//
//	}

	@When("user navigates to bottom of the page")
	public void user_navigates_to_bottom_of_the_page() throws InterruptedException {

		content.movetoEnd();
	}

	@When("user validates that the footer icons are present")
	public void user_validates_that_the_footer_icons_are_present() throws InterruptedException {

		content.footervisible();

	}

	@When("user navigates to home page")
	public void user_navigates_to_home_page() throws InterruptedException {

		content.navtigateToHomepage();

	}

//  @When("user clicks on the video to perform dislike operation")
//  public void user_clicks_on_the_video_to_perform_dislike_operation() throws InterruptedException {
//
//		content.clickonvideo();
//	}

//	@And("user navigates Dashboard page")
//	public void user_navigates_dashboard_page() throws InterruptedException {
//
//		content.clickonDashboard();
//
//	}

//	@Then("user validates reward buttons and open the pages")
//	public void user_validates_reward_buttons_and_open_the_pages() {
//
//		content.verifyMyRewards();
//		content.uploadVideo();
//		content.manageUploads();
//
//	}

//	@Then("user validates that dislike button should be disabled or grayed out")
//	public void user_validates_that_dislike_button_should_be_disabled_or_grayed_out() throws Exception {
//
//		content.dislikegreyedout();
//	}

//	@When("user clicks on like button on the video")
//	public void user_clicks_on_like_button_on_the_video() throws InterruptedException {
//
//		content.clickonlikebutton();
//
//	}

//	@Then("user validates that like button should be disabled or grayed out")
//	public void user_validates_that_like_button_should_be_disabled_or_grayed_out() {
//
//		content.likegreyedout();
//
//	}

//	@Then("user click on share button on the video")
//	public void user_click_on_share_button_on_the_video() throws InterruptedException {
//
//		content.clickonsharebtn();
//
//	}

//  @Then("user validates that share button should be disabled or grayed out")
//  public void user_validates_that_share_button_should_be_disabled_or_grayed_out() {
//    content.validateSharebtn();
//  }

//	@When("registered user access the application")
//	public void registered_user_access_the_application() throws InterruptedException, IOException {
//		content.registereduserlogin();
//	}
//
//	@When("registered non admin user access the application")
//	public void registered_non_admin_user_access_the_application() throws InterruptedException {
//		content.nonadminregistereduserlogin();
//	}

//  @When("user click on like button on the video")
//  public void user_click_on_like_button_on_the_video() throws InterruptedException {
//    content.clickonlikebutton();
//  }

//  @Then("user validates that like button should be displayed")
//  public void user_validates_that_like_button_should_be_displayed() {
//    content.validatelikeebtn();
//  }

//  @Then("user clicks on share button on the video")
//  public void user_clicks_on_share_button_on_the_video() throws InterruptedException {
//    content.clickonsharebtn();
//  }

//  @Then("user validates that share button should be displayed")
//  public void user_validates_that_share_button_should_be_displayed() {
//    content.validateSharebtn();
//  }

//  @When("user clicks on share button on the whatsapp icon")
//  public void user_clicks_on_share_button_on_the_whatsapp_icon() throws InterruptedException {
//    content.clickonsharebtn();
//  }

//	@Then("user validates that share button should be displayed and user is redirected to login page for signin")
//	public void user_validates_that_share_button_should_be_displayed_and_user_is_redirected_to_login_page_for_signin()
//			throws Exception {
//
//		content.clickonsharebtn();
//		content.clickonwhatsapp();
//
//	}

//	@Then("user validates that sharing option list along with the respective icons should be visible \\(horizontally) to users")
//	public void user_validates_that_sharing_option_list_along_with_the_respective_icons_should_be_visible_horizontally_to_users()
//			throws InterruptedException {
//
//		content.validateIcons();
//	}

//	@Then("user validates that after selecting share mode on each icons user should be able to share.")
//	public void user_validates_that_after_selecting_share_mode_on_each_icons_user_should_be_able_to_share()
//			throws InterruptedException {
//
//		content.clickonwhatsapp();
//
//	}

//  @Then("user validates that like symbol is highligted")
//  public void user_validates_that_like_symbol_is_highligted() {
//    content.validatelikeebtn();
//  }

//  @When("user clicks on undo button to dislike the video")
//  public void user_clicks_on_undo_button_to_dislike_the_video() throws InterruptedException {
//    content.clickdislikeebtn();
//  }

//	@Then("user validates that dislike symbol is highligted")
//	public void user_validates_that_dislike_symbol_is_highligted() {
//		content.validatedislikeebtn();
//	}

//	@Then("user validates comment box is visible on the screen")
//	public void user_validates_comment_box_is_visible_on_the_screen() throws InterruptedException {
//		content.validateComment();
//	}

//	@Then("user click on add comment button")
//	public void user_click_on_add_comment_button() throws Exception {
//		comment.clickondislikebutton();
//	}

//	@Then("user add comment in comment box and validatess UI of the comment box")
//	public void user_add_comment_in_comment_box_and_validatess_ui_of_the_comment_box() throws Exception {
//		content.validateComment();
//		content.clickoncommentsection();
//	}
//
//	@And("user clicks on the add comment section")
//	public void user_clicks_on_the_add_comment_section() throws Exception {
//
//		content.clickonCommentsection();
//	}

//  @Then("user validates comment should be display on screen and visible to others")
//  public void user_validates_comment_should_be_display_on_screen_and_visible_to_others()
//      throws Exception {
//    content.validateComment();
//  }

//  @Then("user is not able to add comment in comment box")
//  public void user_is_not_able_to_add_comment_in_comment_box() throws Exception {
//    content.addcommentnotvisible();
//  }

//  @Then("user redirect to Sign in\\/register option in order to comment")
//  public void user_redirect_to_sign_in_register_option_in_order_to_comment() throws Exception {
//    content.validateSignIn();
//  }
//
//  @Then("user validates the text box to comments along with Comment and Cancel buttons")
//  public void user_validates_the_text_box_to_comments_along_with_comment_and_cancel_buttons()
//      throws Exception {
//    content.validateComment();
//    content.validateCancelbtn();
//    content.validateCommentbtn();
//  }
//
//	@Then("user click on own comment")
//	public void user_click_on_own_comment() throws Exception {
//		content.cickonOwnComment();
//
//	}
//
//	@Then("user able to see Delete option for the respective comment")
//	public void user_able_to_see_delete_option_for_the_respective_comment() throws Exception {
//		content.validateDeleteOption();
//	}
//
//	@Then("user Try to delete the comment by clicking on delete option")
//	public void user_try_to_delete_the_comment_by_clicking_on_delete_option() throws Exception {
//		content.clickDeletebtn();
//	}
//
//	@Then("user validates comment deleted successfully")
//	public void user_validates_comment_deleted_successfully() throws Exception {
//		content.validateDeletedcomment();
//
//	}
//
//	@Then("user validates the comment button is greyed out, unless user types in the comments section")
//	public void user_validates_the_comment_button_is_greyed_out_unless_user_types_in_the_comments_section()
//			throws Exception {
//		content.validateCommentbtn();
//	}
//
//	@Then("user click on other users comment")
//	public void user_click_on_other_users_comment() throws Exception {
//
//		content.clickOtherUsersComment();
//
//	}
//
//	@Then("user able to see the reply option")
//	public void user_able_to_see_the_reply_option() throws Exception {
//		content.validateReply();
//
//	}
//
//	/*
//	 * Comment option should applicable only for Mbrowse and Mlive videos. No
//	 * commenting option should available for Mplay videos.
//	 */
//	@Then("user validates the comment option for the vMbrowser, Mlive, and Mplay videos")
//	public void user_validates_the_comment_option_for_the_v_mbrowser_mlive_and_mplay_videos() throws Exception {
//		comment.validateMbrowsesMlive();
//
//	}
//
//  @Then("user validates the comment option is applicable only for  Mbrowse and Mlive videos")
//  public void user_validates_the_comment_option_is_applicable_only_for_mbrowse_and_mlive_videos()
//      throws Exception {
//    comment.validateMbrowsesMlive();
//  }
//
//	@Then("user validates no commenting option should available for Mplay videos")
//	public void user_validates_no_commenting_option_should_available_for_mplay_videos() throws Exception {
//		comment.validateMplay();
//	}
//
//	@When("user accesses the application - registered or guest")
//	public void user_accesses_the_application_registered_or_guest() throws InterruptedException, IOException {
//		content.registereduserlogin();
//
//	}
//
////	@When("An admin user access the application")
////	public void an_admin_user_access_the_application() {
////		content.adminUserLogin();
////
////	}
////
////	@Then("validate user promoted videos at the top of the home page & user home page")
////	public void validate_user_promoted_videos_at_the_top_of_the_home_page_user_home_page() throws Exception {
////		videos.validateUserPromotedVideos();
////
////	}
////
////  @Then("user validate the Hero Banner - Home page with videos Ads and Banner ads")
////  public void user_validate_the_hero_banner_home_page_with_videos_ads_and_banner_ads()
////      throws Exception {
////    videos.validateHeroBanner();
////  }
////
////	@Then("user click on video ads")
////	public void user_click_on_video_ads() throws Exception {
////		videos.clickVideoAds();
////
////	}
//
//	@Then("user navigate to the login screen in order to register or login to watch the video")
//	public void user_navigate_to_the_login_screen_in_order_to_register_or_login_to_watch_the_video()
//			throws InterruptedException, IOException {
//		content.registereduserlogin();
//	}
//
//	@Then("user start watching the video")
//	public void user_start_watching_the_video() throws Exception {
//		videos.clickPlayVideobtn();
//	}
//
//	@And("user will search the content from the Mbrowser search")
//	public void user_will_search_the_content_from_the_mbrowser_search() throws Exception {
//		// searchoperation.enterSearch();
//		content.enterSearch();
//	}
//
//	@Then("validate search field search symbol")
//	public void validate_search_field_search_symbol() throws Exception {
//		content.validatesearchfield();
//	}
//
//	@When("user click on Mplay\\/Mlive")
//	public void user_click_on_mplay_mlive() {
//		mbrowserpage.clickonMplayorMlive();
//	}
//
//	@When("user will search any video")
//	public void user_will_search_any_video() {
//		mbrowserpage.searchVideo();
//
//	}
//
//  @When("user should be able to see the list of videos displayed as per the search criteria.")
//  public void user_should_be_able_to_see_the_list_of_videos_displayed_as_per_the_search_criteria() {
//    mbrowserpage.validateListOfVideos();
//  }
//
//	@When("click on About")
//	public void click_on_about() {
//		mbrowserpage.clickonAbout();
//	}
//
//	@When("user should be routed to Sign in or register option.")
//	public void user_should_be_routed_to_sign_in_or_register_option() {
//
//	}
//
//	@When("user clicks on any ad banner")
//	public void user_clicks_on_any_ad_banner() {
//		mbrowserpage.clickonADBanner();
//	}
//
//  @When("click on Myplay\\/Mlive\\/Mseed")
//  public void click_on_myplay_mlive_mseed() {
//    mbrowserpage.clickonMplayorMliveorMseed();
//  }
//
//	@When("user should be routed to the home page of my profile and should see home options")
//	public void user_should_be_routed_to_the_home_page_of_my_profile_and_should_see_home_options() {
//		mbrowserpage.validateHomepageOptions();
//	}
//
//	@Then("the default categories video list should contain a category of Recommended vidoes")
//	public void the_default_categories_video_list_should_contain_a_category_of_Recommended_vidoes()
//			throws InterruptedException {
//		content.validaterecommendedatgeory();
//
//	}
//
//	@Then("the default categories video list should contain a category of Top Trending vidoes")
//	public void the_default_categories_video_list_should_contain_a_category_of_Trending_vidoes()
//			throws InterruptedException {
//		content.validatetoptrendingcategory();
//
//	}
//
//	@Then("the default categories video list should contain a category of New release vidoes")
//	public void the_default_categories_video_list_should_contain_a_category_of_Top_Trending_vidoes()
//			throws InterruptedException {
//		content.validatenewreleasescategory();
//
//	}
//
//	@Then("the default categories video list should contain a category of Most watched vidoes")
//	public void the_default_categories_video_list_should_contain_a_category_of_Most_watched_vidoes()
//			throws InterruptedException {
//		content.validatenewreleasescategory();
//
//	}
//
//	@Then("User is able to access the application successfully")
//	public void user_is_able_to_access_the_application_successfully() {
//		videocategories.verifypageTitle();
//
//	}
//
//	@When("Guest User look for the default categories list available on Myco page \\(Landing page)")
//	public void guest_user_look_for_the_default_categories_list_available_on_myco_page_landing_page() throws IOException {
//		content.guestuserlogin();
//		videocategories.validatedefaultcategorieslist();
//
//	}
//
//	@Then("the default categories video list should be available on the Myco page \\(Landing page)")
//	public void the_default_categories_video_list_should_be_available_on_the_myco_page_landing_page() {
//		videocategories.validatedefaultcategorieslist();
//
//	}
//
//  @Then("User should login to the application successfully.")
//  public void user_should_login_to_the_application_successfully() {
//    videocategories.verifypageTitle();
//  }
//
//  @When(
//      "User look for the default categories list available once the user enters Myco page"
//          + " \\(Landing page)")
//  public void
//      user_look_for_the_default_categories_list_available_once_the_user_enters_myco_page_landing_page() {
//    videocategories.validatedefaultcategorieslist();
//  }
//
//	@When("User enter the application with valid credentials")
//	public void user_enter_the_application_with_valid_credentials() throws InterruptedException, IOException {
//		content.registereduserlogin();
//
//	}
//
//	@Then("User should log into the successfully")
//	public void user_should_log_into_the_successfully() {
//		videocategories.verifypageTitle();
//
//	}
//
//  @When("User looks for the default categories Home page for top trending videos")
//  public void user_looks_for_the_default_categories_home_page_for_top_trending_videos() {
//    videocategories.validatetoptrendingvideos();
//  }
//
//  @Then("The videos should reflect in the Top trending category basis on the video")
//  public void the_videos_should_reflect_in_the_top_trending_category_basis_on_the_video() {
//    videocategories.displaytoptrendingvideos();
//  }
//
//	@When("User looks for the default categories Home page for most watched videos")
//	public void user_looks_for_the_default_categories_home_page_for_most_watched_videos() {
//		videocategories.validatemostwatchedvideos();
//
//	}
//
//	@Then("only those videos should reflect in the Most watched category where the number of views \\({int} views) in the last {int} days of a particular video")
//	public void only_those_videos_should_reflect_in_the_most_watched_category_where_the_number_of_views_views_in_the_last_days_of_a_particular_video(
//			Integer int1, Integer int2) {
//		videocategories.validatemostwatchedvideos();
//		// write logic displayed view>50m
//	}
//
//  @When("User Look for the default categories Home page for popular on Myco – Mplay contents")
//  public void user_look_for_the_default_categories_home_page_for_popular_on_myco_mplay_contents() {
//    videocategories.verifypageTitle();
//    videocategories.validatedefaultcategorieslist();
//  }
//
//	@Then("the videos should reflect in the Popular on Myco category, as soon as the")
//	public void the_videos_should_reflect_in_the_popular_on_myco_category_as_soon_as_the() {
//		videocategories.validatedepopularvideos();
//
//	}
//
//  @When("User looks for the default categories Home page for new released videos")
//  public void user_looks_for_the_default_categories_home_page_for_new_released_videos() {
//    videocategories.validatenewreleasesvideos();
//  }
//
//	@Then("the videos should reflect in the New released category basis on the date of upload videos {double} last {int} days")
//	public void the_videos_should_reflect_in_the_new_released_category_basis_on_the_date_of_upload_videos_last_days(
//			Double double1, Integer int1) {
//		videocategories.validatenewreleasesvideos();
//	}
//
//  @When("User looks for the default categories Home page for Only on Myco videos")
//  public void user_looks_for_the_default_categories_home_page_for_only_on_myco_videos() {
//    videocategories.validatedefaultcategorieslist();
//  }
//
//	@Then("The videos should reflect in the Only on Myco category basis on the videos that comes from the in-house.")
//	public void the_videos_should_reflect_in_the_only_on_myco_category_basis_on_the_videos_that_comes_from_the_in_house() {
//		videocategories.validatedefaultcategorieslist();
//		// validate in-house videos too
//	}
//
//	@When("User looks for the default categories Home page for Top {int} global videos")
//	public void user_looks_for_the_default_categories_home_page_for_top_global_videos(Integer int1) {
//		videocategories.validatedefaultcategorieslist();
//
//	}
//
//	@Then("The videos should reflect in the Top {int} Global category basis on the videos that are popular across all the countries. Top {int} videos from each country displayed in this category.")
//	public void the_videos_should_reflect_in_the_top_global_category_basis_on_the_videos_that_are_popular_across_all_the_countries_top_videos_from_each_country_displayed_in_this_category(
//			Integer int1, Integer int2) {
//		videocategories.validateAllcountriespopularVideos();
//	}
//
//	@When("User looks for the Default categories User page for Recommended videos")
//	public void user_looks_for_the_default_categories_user_page_for_recommended_videos() {
//		videocategories.validatedefaultcategorieslistRecommended();
//
//	}
//
//	@Then("The videos should reflect in the Recommended videos category basis on the")
//	public void the_videos_should_reflect_in_the_recommended_videos_category_basis_on_the() {
//		videocategories.displayedefaultcategorieslistRecommended();
//
//	}
//
//  @When("User looks for the Default categories User page for Continue watching videos")
//  public void user_looks_for_the_default_categories_user_page_for_continue_watching_videos() {
//    videocategories.validatedefaultcategoryUserPage();
//  }
//
//  @Then("User’s videos that are not watched entirely should be displayed in this category")
//  public void user_s_videos_that_are_not_watched_entirely_should_be_displayed_in_this_category() {
//    videocategories.validatedefaultcategoryUserPage();
//  }
//
//  @When(
//      "User looks for the Default categories User page for Top trending videos (No. of views and"
//          + " Engagements)")
//  public void
//      user_looks_for_the_default_categories_user_page_for_top_trending_videos_no_of_views_and_engagements() {
//    videocategories.validatedefaultcategoryUserPageTopTrendingVideos();
//  }
//
//  @When("User looks for the Default categories User page for New releases videos")
//  public void user_looks_for_the_default_categories_user_page_for_new_releases_videos() {
//    videocategories.validatedefaultcategoryUserPageNewReleaseVideos();
//  }
//
//	@Then("the videos should reflect in the New releases category basis on the date of upload videos {double} last {int} days")
//	public void the_videos_should_reflect_in_the_new_releases_category_basis_on_the_date_of_upload_videos_last_days(
//			Double double1, Integer int1) {
//		videocategories.validatedefaultcategoryUserPageNewReleaseVideo();
//	}
//
//	@When("User looks for the Default categories User page for Popular on Myco videos \\(Mplay Content)")
//	public void user_looks_for_the_default_categories_user_page_for_popular_on_myco_videos_mplay_content() {
//		videocategories.validatedefaultcategoryUserPagePopularmyco();
//	}
//
//	@When("User looks for the Default categories User page for Only on Myco videos")
//	public void user_looks_for_the_default_categories_user_page_for_only_on_myco_videos() {
//		videocategories.validatedefaultcategoryUserPageOnlyforMyco();
//
//	}
//
//  @Then("The videos should reflect only in Myco category basis on the videos")
//  public void the_videos_should_reflect_only_in_myco_category_basis_on_the_videos() {
//    videocategories.validateMycoCategory();
//  }
//
//  @When("User looks for the Default categories User page for Top {int} Global videos")
//  public void user_looks_for_the_default_categories_user_page_for_top_global_videos(Integer int1) {
//    videocategories.validateMycoCategory();
//  }
//
//	@Then("the videos should reflect in the Top {int} Global category basis on the videos that are popular across all the countries. Top {int} videos from each countries are displayed in this category.")
//	public void the_videos_should_reflect_in_the_top_global_category_basis_on_the_videos_that_are_popular_across_all_the_countries_top_videos_from_each_countries_are_displayed_in_this_category(
//			Integer int1, Integer int2) {
//		videocategories.validatePopularVideosAcrossCountries();
//	}
//
//  @When("User looks for the Default categories User page for Top {int} Local - User")
//  public void user_looks_for_the_default_categories_user_page_for_top_local_user(Integer int1) {
//    videocategories.validatedefaultcategoryUserPage();
//  }
//
//	@Then("the videos should reflect in the Top {int} Local category basis on the videos that are popular across the respective region. \\(I think this might incorrect – need to discuss)")
//	public void the_videos_should_reflect_in_the_top_local_category_basis_on_the_videos_that_are_popular_across_the_respective_region_i_think_this_might_incorrect_need_to_discuss(
//			Integer int1) {
//		videocategories.validatePopularAcrossRegion();
//	}
//
//	@When("user clicks on the video")
//	public void user_clicks_on_the_video() {
//		// play button click
//	}
//
//  @Then(
//      "user validates that in-stream ads will be played at the start, middle and end of the video"
//          + " and are non-skippable")
//  public void
//      user_validates_that_in_stream_ads_will_be_played_at_the_start_middle_and_end_of_the_video_and_are_non_skippable() {
//    videoAdsSteps.validatein_sreamAds();
//  }
//
//	@Then("user Waits till Ad will play")
//	public void user_waits_till_ad_will_play() {
//		// Implement wait function
//
//	}
//
//  @Then("user validates while playing Ads, reverse timer clock should be displayed over the video.")
//  public void
//      user_validates_while_playing_ads_reverse_timer_clock_should_be_displayed_over_the_video() {
//    videoAdsSteps.validateReverseTimer();
//  }
//
//	@Then("user will verify that user can forward the main video buffer bar")
//	public void user_will_verify_that_user_can_forward_the_main_video_buffer_bar() {
//		videoAdsSteps.forwardBufferBar();
//
//	}
//
//	@Then("user forward the main video buffer bar, but cannot be able to move when In-stream video is playing.")
//	public void user_forward_the_main_video_buffer_bar_but_cannot_be_able_to_move_when_in_stream_video_is_playing() {
//		videoAdsSteps.forwardBufferBar();
//		videoAdsSteps.forwardBufferBarWhikeVideoIsPlaying();
//
//	}
//
//	@Then("user validates in -stream video buffer bar and Main video buffer bar UI")
//	public void user_validates_in_stream_video_buffer_bar_and_main_video_buffer_bar_ui() {
//		videoAdsSteps.validatesstreamVideoBufferBar();
//		videoAdsSteps.validatesstreamVideoBufferBar();
//
//	}
//
//	@Then("user should perform play, pause, mute\\/unmute, and alert operations while Ad is playing")
//	public void user_should_perform_play_pause_mute_unmute_and_alert_operations_while_ad_is_playing() {
//		videoAdsSteps.playBtn();
//		videoAdsSteps.pauseBtn();
//		videoAdsSteps.muteBtn();
//		videoAdsSteps.unmuteBtn();
//		// Wait for 5 seconds
//		videoAdsSteps.validatealert();
//
//	}
//
//	@Then("user should validate options {double} Play {double} :arrow_forward, Pause-:pause_button, Mute\\/Unmute {double} :mute, and get the ad alert on the screen before 5s")
//	public void user_should_validate_options_play_arrow_forward_pause_pause_button_mute_unmute_mute_and_get_the_ad_alert_on_the_screen_before_5s(
//			Double double1, Double double2, Double double3) {
//		videoAdsSteps.validateplayBtn();
//		videoAdsSteps.validatepauseBtn();
//		videoAdsSteps.validatemuteBtn();
//		videoAdsSteps.validateunmuteBtn();
//		// Wait for 5 seconds
//		videoAdsSteps.validatealert();
//	}
//
//	@When("user clicks on three dots and report link")
//	public void user_clicks_on_three_dots_and_report_link() throws InterruptedException {
//
//		content.clickonlikebutton();
//
//	}
//
//	@When("user selects the options for report")
//	public void user_selects_the_options_for_report() throws InterruptedException {
//
//		content.clickonlikebutton();
//
//	}
//
//	@When("user clicks on submit button")
//	public void user_clicks_on_submit_button() throws InterruptedException {
//
//		content.clickonlikebutton();
//
//	}
//
//	@Then("user validates that report is submitted")
//	public void user_validates_that_report_is_submitted() {
//		videocategories.validatePopularAcrossRegion();
//	}
//
//	@And("user clicks on About link")
//	public void user_clicks_on_About_link() {
//		content.clickaboutlink();
//
//	}
//
//	@Then("user is redirected to older website link for about us")
//	public void user_is_redirected_to_older_website_link_for_about_us() {
//		content.aboutuslink();
//	}
//
//	@And("user scrolls down to the footer section")
//	public void user_scrolls_down_to_the_footer_section() {
//		content.footersection();
//
//	}
//
//	@And("user clicks on Privacy Policy link")
//	public void user_clicks_on_Privacy_Policy_link() {
//		content.clickprivacypolicylink();
//
//	}
//
//	@Then("user is redirected to older website link for about Private policy")
//	public void user_is_redirected_to_older_website_link_for_about_Private_policy() {
//		content.privacypolicylink();
//	}
//
//	@And("user clicks on Contact us link")
//	public void user_clicks_on_Contact_us_link() {
//		content.clickcontactus();
//
//	}
//
//	@Then("user is redirected to older website link for about Contact Us")
//	public void user_is_redirected_to_older_website_link_for_about_Contact_Us() {
//		content.contactuslink();
//	}
//
//	@When("user navigates to manage videos section")
//	public void user_navigates_to_manage_videos_section() throws InterruptedException {
//		content.manageVideos();
//
//	}
//
//	@When("user deletes the first video and verifies it")
//	public void user_deletes_the_first_video_and_verifies_it() throws Exception {
//
//		String text = content.deleteFirstVideo();
//		content.validateDelete(text);
//
//	}
//
//	@Then("verify default categories include Recommended vidoes")
//	public void verify_default_categories_include_recommmended_videos() throws InterruptedException {
//		content.Recommendedcategory();
//	}
//
//	@Then("verify default categories include  Top Trending vidoes")
//	public void verify_default_categories_include_top_trending_videos() throws InterruptedException {
//		content.validatetoptrendingcategory();
//	}
//
//	@Then("verify default categories include New release vidoes")
//	public void verify_default_categories_include_New_release_videos() throws InterruptedException {
//		content.validatenewreleasescategory();
//	}
//
//	@Then("verify default categories include Most watched vidoes")
//	public void verify_default_categories_include_most_watched_videos() throws InterruptedException {
//		content.validatemostwatchedcategory();
//	}
//
//  @When("user navigates to home page")
//  public void user_navigates_to_home_page() throws InterruptedException {
//
//    content.navtigateToHomepage();
//  }

  @When("user clicks on the video to perform dislike operation")
  public void user_clicks_on_the_video_to_perform_dislike_operation() throws InterruptedException {

    content.clickonvideo();
  }

  @And("user navigates Dashboard page")
  public void user_navigates_dashboard_page() throws InterruptedException {

    content.clickonDashboard();
  }

  @Then("user validates reward buttons and open the pages")
  public void user_validates_reward_buttons_and_open_the_pages() {

    content.verifyMyRewards();
    content.uploadVideo();
    content.manageUploads();
  }

  @Then("user validates that dislike button should be disabled or grayed out")
  public void user_validates_that_dislike_button_should_be_disabled_or_grayed_out()
      throws Exception {

    content.dislikegreyedout();
  }

  @When("user clicks on like button on the video")
  public void user_clicks_on_like_button_on_the_video() throws InterruptedException {

    content.clickonlikebutton();
  }

  @Then("user validates that like button should be disabled or grayed out")
  public void user_validates_that_like_button_should_be_disabled_or_grayed_out() {

    content.likegreyedout();
  }

  @Then("user click on share button on the video")
  public void user_click_on_share_button_on_the_video() throws InterruptedException {

    content.clickonsharebtn();
  }

  @Then("user validates that share button should be disabled or grayed out")
  public void user_validates_that_share_button_should_be_disabled_or_grayed_out() {
    content.validateSharebtn();
  }

  @When("registered user access the application")
  public void registered_user_access_the_application() throws InterruptedException, IOException {
    content.registereduserlogin();
  }

  @When("registered non admin user access the application")
  public void registered_non_admin_user_access_the_application() throws InterruptedException {
    content.nonadminregistereduserlogin();
  }

  @When("user click on like button on the video")
  public void user_click_on_like_button_on_the_video() throws InterruptedException {
    content.clickonlikebutton();
  }

  @Then("user validates that like button should be displayed")
  public void user_validates_that_like_button_should_be_displayed() {
    content.validatelikeebtn();
  }

  @Then("user clicks on share button on the video")
  public void user_clicks_on_share_button_on_the_video() throws InterruptedException {
    content.clickonsharebtn();
  }

  @Then("user validates that share button should be displayed")
  public void user_validates_that_share_button_should_be_displayed() {
    content.validateSharebtn();
  }

  @When("user clicks on share button on the whatsapp icon")
  public void user_clicks_on_share_button_on_the_whatsapp_icon() throws InterruptedException {
    content.clickonsharebtn();
  }

  @Then(
      "user validates that share button should be displayed and user is redirected to login page"
          + " for signin")
  public void
      user_validates_that_share_button_should_be_displayed_and_user_is_redirected_to_login_page_for_signin()
          throws Exception {

    content.clickonsharebtn();
    content.clickonwhatsapp();
  }

  @Then(
      "user validates that sharing option list along with the respective icons should be visible"
          + " \\(horizontally) to users")
  public void
      user_validates_that_sharing_option_list_along_with_the_respective_icons_should_be_visible_horizontally_to_users()
          throws InterruptedException {

    content.validateIcons();
  }

  @Then(
      "user validates that after selecting share mode on each icons user should be able to share.")
  public void
      user_validates_that_after_selecting_share_mode_on_each_icons_user_should_be_able_to_share()
          throws InterruptedException {

    content.clickonwhatsapp();
  }

  @Then("user validates that like symbol is highligted")
  public void user_validates_that_like_symbol_is_highligted() {
    content.validatelikeebtn();
  }

  @When("user clicks on undo button to dislike the video")
  public void user_clicks_on_undo_button_to_dislike_the_video() throws InterruptedException {
    content.clickdislikeebtn();
  }

  @Then("user validates that dislike symbol is highligted")
  public void user_validates_that_dislike_symbol_is_highligted() {
    content.validatedislikeebtn();
  }

  @Then("user validates comment box is visible on the screen")
  public void user_validates_comment_box_is_visible_on_the_screen() throws InterruptedException {
    content.validateComment();
  }

  @Then("user click on add comment button")
  public void user_click_on_add_comment_button() throws Exception {
    comment.clickondislikebutton();
  }

  @Then("user add comment in comment box and validatess UI of the comment box")
  public void user_add_comment_in_comment_box_and_validatess_ui_of_the_comment_box()
      throws Exception {
    content.validateComment();
    content.clickoncommentsection();
  }

  @And("user clicks on the add comment section")
  public void user_clicks_on_the_add_comment_section() throws Exception {

    content.clickonCommentsection();
  }

  @Then("user validates comment should be display on screen and visible to others")
  public void user_validates_comment_should_be_display_on_screen_and_visible_to_others()
      throws Exception {
    content.validateComment();
  }

  @Then("user is not able to add comment in comment box")
  public void user_is_not_able_to_add_comment_in_comment_box() throws Exception {
    content.addcommentnotvisible();
  }

  @Then("user redirect to Sign in\\/register option in order to comment")
  public void user_redirect_to_sign_in_register_option_in_order_to_comment() throws Exception {
    content.validateSignIn();
  }

  @Then("user validates the text box to comments along with Comment and Cancel buttons")
  public void user_validates_the_text_box_to_comments_along_with_comment_and_cancel_buttons()
      throws Exception {
    content.validateComment();
    content.validateCancelbtn();
    content.validateCommentbtn();
  }

  @Then("user click on own comment")
  public void user_click_on_own_comment() throws Exception {
    content.cickonOwnComment();
  }

  @Then("user able to see Delete option for the respective comment")
  public void user_able_to_see_delete_option_for_the_respective_comment() throws Exception {
    content.validateDeleteOption();
  }

  @Then("user Try to delete the comment by clicking on delete option")
  public void user_try_to_delete_the_comment_by_clicking_on_delete_option() throws Exception {
    content.clickDeletebtn();
  }

  @Then("user validates comment deleted successfully")
  public void user_validates_comment_deleted_successfully() throws Exception {
    content.validateDeletedcomment();
  }

  @Then(
      "user validates the comment button is greyed out, unless user types in the comments section")
  public void
      user_validates_the_comment_button_is_greyed_out_unless_user_types_in_the_comments_section()
          throws Exception {
    content.validateCommentbtn();
  }

  @Then("user click on other users comment")
  public void user_click_on_other_users_comment() throws Exception {

    content.clickOtherUsersComment();
  }

  @Then("user able to see the reply option")
  public void user_able_to_see_the_reply_option() throws Exception {
    content.validateReply();
  }

  /*
   * Comment option should applicable only for Mbrowse and Mlive videos. No
   * commenting option should available for Mplay videos.
   */
  @Then("user validates the comment option for the vMbrowser, Mlive, and Mplay videos")
  public void user_validates_the_comment_option_for_the_v_mbrowser_mlive_and_mplay_videos()
      throws Exception {
    comment.validateMbrowsesMlive();
  }

  @Then("user validates the comment option is applicable only for  Mbrowse and Mlive videos")
  public void user_validates_the_comment_option_is_applicable_only_for_mbrowse_and_mlive_videos()
      throws Exception {
    comment.validateMbrowsesMlive();
  }

  @Then("user validates no commenting option should available for Mplay videos")
  public void user_validates_no_commenting_option_should_available_for_mplay_videos()
      throws Exception {
    comment.validateMplay();
  }

  @When("user accesses the application - registered or guest")
  public void user_accesses_the_application_registered_or_guest() throws InterruptedException, IOException {
    content.registereduserlogin();
  }

  @When("An admin user access the application")
  public void an_admin_user_access_the_application() {
    content.adminUserLogin();
  }

  @Then("validate user promoted videos at the top of the home page & user home page")
  public void validate_user_promoted_videos_at_the_top_of_the_home_page_user_home_page()
      throws Exception {
    videos.validateUserPromotedVideos();
  }

  @Then("user validate the Hero Banner - Home page with videos Ads and Banner ads")
  public void user_validate_the_hero_banner_home_page_with_videos_ads_and_banner_ads()
      throws Exception {
    videos.validateHeroBanner();
  }

  @Then("user click on video ads")
  public void user_click_on_video_ads() throws Exception {
    videos.clickVideoAds();
  }

  @Then("user navigate to the login screen in order to register or login to watch the video")
  public void user_navigate_to_the_login_screen_in_order_to_register_or_login_to_watch_the_video()
      throws InterruptedException, IOException {
    content.registereduserlogin();
  }

//  @Then("user start watching the video")
//  public void user_start_watching_the_video() throws Exception {
//    videos.clickPlayVideobtn();
//  }

  @And("user will search the content from the Mbrowser search")
  public void user_will_search_the_content_from_the_mbrowser_search() throws Exception {
    // searchoperation.enterSearch();
    content.enterSearch();
  }

  @Then("validate search field search symbol")
  public void validate_search_field_search_symbol() throws Exception {
    content.validatesearchfield();
  }

  @When("user click on Mplay\\/Mlive")
  public void user_click_on_mplay_mlive() {
    mbrowserpage.clickonMplayorMlive();
  }

  @When("user will search any video")
  public void user_will_search_any_video() {
    mbrowserpage.searchVideo();
  }

  @When("user should be able to see the list of videos displayed as per the search criteria.")
  public void user_should_be_able_to_see_the_list_of_videos_displayed_as_per_the_search_criteria() {
    mbrowserpage.validateListOfVideos();
  }

  @When("click on About")
  public void click_on_about() {
    mbrowserpage.clickonAbout();
  }

  @When("user should be routed to Sign in or register option.")
  public void user_should_be_routed_to_sign_in_or_register_option() {}

  @When("user clicks on any ad banner")
  public void user_clicks_on_any_ad_banner() {
    mbrowserpage.clickonADBanner();
  }

  @When("click on Myplay\\/Mlive\\/Mseed")
  public void click_on_myplay_mlive_mseed() {
    mbrowserpage.clickonMplayorMliveorMseed();
  }

  @When("user should be routed to the home page of my profile and should see home options")
  public void user_should_be_routed_to_the_home_page_of_my_profile_and_should_see_home_options() {
    mbrowserpage.validateHomepageOptions();
  }

  @Then("the default categories video list should contain a category of Recommended vidoes")
  public void the_default_categories_video_list_should_contain_a_category_of_Recommended_vidoes()
      throws InterruptedException {
    content.validaterecommendedatgeory();
  }

  @Then("the default categories video list should contain a category of Top Trending vidoes")
  public void the_default_categories_video_list_should_contain_a_category_of_Trending_vidoes()
      throws InterruptedException {
    content.validatetoptrendingcategory();
  }

  @Then("the default categories video list should contain a category of New release vidoes")
  public void the_default_categories_video_list_should_contain_a_category_of_Top_Trending_vidoes()
      throws InterruptedException {
    content.validatenewreleasescategory();
  }

  @Then("the default categories video list should contain a category of Most watched vidoes")
  public void the_default_categories_video_list_should_contain_a_category_of_Most_watched_vidoes()
      throws InterruptedException {
    content.validatenewreleasescategory();
  }

//  @Then("User is able to access the application successfully")
//  public void user_is_able_to_access_the_application_successfully() {
//    videocategories.verifypageTitle();
//  }

  @When("Guest User look for the default categories list available on Myco page \\(Landing page)")
  public void
      guest_user_look_for_the_default_categories_list_available_on_myco_page_landing_page() throws IOException {
    content.guestuserlogin();
    videocategories.validatedefaultcategorieslist();
  }

  @Then("the default categories video list should be available on the Myco page \\(Landing page)")
  public void
      the_default_categories_video_list_should_be_available_on_the_myco_page_landing_page() {
    videocategories.validatedefaultcategorieslist();
  }

//  @Then("User should login to the application successfully.")
//  public void user_should_login_to_the_application_successfully() {
//    videocategories.verifypageTitle();
//  }

  @When(
      "User look for the default categories list available once the user enters Myco page"
          + " \\(Landing page)")
  public void
      user_look_for_the_default_categories_list_available_once_the_user_enters_myco_page_landing_page() {
    videocategories.validatedefaultcategorieslist();
  }

  @When("User enter the application with valid credentials")
  public void user_enter_the_application_with_valid_credentials() throws InterruptedException, IOException {
    content.registereduserlogin();
  }

//  @Then("User should log into the successfully")
//  public void user_should_log_into_the_successfully() {
//    videocategories.verifypageTitle();
//  }

  @When("User looks for the default categories Home page for top trending videos")
  public void user_looks_for_the_default_categories_home_page_for_top_trending_videos() {
    videocategories.validatetoptrendingvideos();
  }

  @Then("The videos should reflect in the Top trending category basis on the video")
  public void the_videos_should_reflect_in_the_top_trending_category_basis_on_the_video() {
    videocategories.displaytoptrendingvideos();
  }

  @When("User looks for the default categories Home page for most watched videos")
  public void user_looks_for_the_default_categories_home_page_for_most_watched_videos() {
    videocategories.validatemostwatchedvideos();
  }

  @Then(
      "only those videos should reflect in the Most watched category where the number of views"
          + " \\({int} views) in the last {int} days of a particular video")
  public void
      only_those_videos_should_reflect_in_the_most_watched_category_where_the_number_of_views_views_in_the_last_days_of_a_particular_video(
          Integer int1, Integer int2) {
    videocategories.validatemostwatchedvideos();
    // write logic displayed view>50m
  }

//  @When("User Look for the default categories Home page for popular on Myco – Mplay contents")
//  public void user_look_for_the_default_categories_home_page_for_popular_on_myco_mplay_contents() {
//    videocategories.verifypageTitle();
//    videocategories.validatedefaultcategorieslist();
//  }

  @Then("the videos should reflect in the Popular on Myco category, as soon as the")
  public void the_videos_should_reflect_in_the_popular_on_myco_category_as_soon_as_the() {
    videocategories.validatedepopularvideos();
  }

  @When("User looks for the default categories Home page for new released videos")
  public void user_looks_for_the_default_categories_home_page_for_new_released_videos() {
    videocategories.validatenewreleasesvideos();
  }

  @Then(
      "the videos should reflect in the New released category basis on the date of upload videos"
          + " {double} last {int} days")
  public void
      the_videos_should_reflect_in_the_new_released_category_basis_on_the_date_of_upload_videos_last_days(
          Double double1, Integer int1) {
    videocategories.validatenewreleasesvideos();
  }

  @When("User looks for the default categories Home page for Only on Myco videos")
  public void user_looks_for_the_default_categories_home_page_for_only_on_myco_videos() {
    videocategories.validatedefaultcategorieslist();
  }

  @Then(
      "The videos should reflect in the Only on Myco category basis on the videos that comes from"
          + " the in-house.")
  public void
      the_videos_should_reflect_in_the_only_on_myco_category_basis_on_the_videos_that_comes_from_the_in_house() {
    videocategories.validatedefaultcategorieslist();
    // validate in-house videos too
  }

  @When("User looks for the default categories Home page for Top {int} global videos")
  public void user_looks_for_the_default_categories_home_page_for_top_global_videos(Integer int1) {
    videocategories.validatedefaultcategorieslist();
  }

  @Then(
      "The videos should reflect in the Top {int} Global category basis on the videos that are"
          + " popular across all the countries. Top {int} videos from each country displayed in"
          + " this category.")
  public void
      the_videos_should_reflect_in_the_top_global_category_basis_on_the_videos_that_are_popular_across_all_the_countries_top_videos_from_each_country_displayed_in_this_category(
          Integer int1, Integer int2) {
    videocategories.validateAllcountriespopularVideos();
  }

  @When("User looks for the Default categories User page for Recommended videos")
  public void user_looks_for_the_default_categories_user_page_for_recommended_videos() {
    videocategories.validatedefaultcategorieslistRecommended();
  }

  @Then("The videos should reflect in the Recommended videos category basis on the")
  public void the_videos_should_reflect_in_the_recommended_videos_category_basis_on_the() {
    videocategories.displayedefaultcategorieslistRecommended();
  }

  @When("User looks for the Default categories User page for Continue watching videos")
  public void user_looks_for_the_default_categories_user_page_for_continue_watching_videos() {
    videocategories.validatedefaultcategoryUserPage();
  }

  @Then("User’s videos that are not watched entirely should be displayed in this category")
  public void user_s_videos_that_are_not_watched_entirely_should_be_displayed_in_this_category() {
    videocategories.validatedefaultcategoryUserPage();
  }

  @When(
      "User looks for the Default categories User page for Top trending videos (No. of views and"
          + " Engagements)")
  public void
      user_looks_for_the_default_categories_user_page_for_top_trending_videos_no_of_views_and_engagements() {
    videocategories.validatedefaultcategoryUserPageTopTrendingVideos();
  }

  @When("User looks for the Default categories User page for New releases videos")
  public void user_looks_for_the_default_categories_user_page_for_new_releases_videos() {
    videocategories.validatedefaultcategoryUserPageNewReleaseVideos();
  }

//  @Then(
//      "the videos should reflect in the New releases category basis on the date of upload videos"
//          + " {double} last {int} days")
//  public void
//      the_videos_should_reflect_in_the_new_releases_category_basis_on_the_date_of_upload_videos_last_days(
//          Double double1, Integer int1) {
//    videocategories.validatedefaultcategoryUserPageNewReleaseVideo();
//  }
  @Then(
      "the videos should reflect in the New releases category basis on the date of upload videos"
          + " {double} last {int} days")
  public void
      the_videos_should_reflect_in_the_new_releases_category_basis_on_the_date_of_upload_videos_last_days(
          Double double1, Integer int1) {
    videocategories.validatedefaultcategoryUserPageNewReleaseVideo();
  }

//  @When(
//      "User looks for the Default categories User page for Popular on Myco videos \\(Mplay"
//          + " Content)")
//  public void
//      user_looks_for_the_default_categories_user_page_for_popular_on_myco_videos_mplay_content() {
//    videocategories.validatedefaultcategoryUserPagePopularmyco();
//  }
  @When(
      "User looks for the Default categories User page for Popular on Myco videos \\(Mplay"
          + " Content)")
  public void
      user_looks_for_the_default_categories_user_page_for_popular_on_myco_videos_mplay_content() {
    videocategories.validatedefaultcategoryUserPagePopularmyco();
  }

//  @When("User looks for the Default categories User page for Only on Myco videos")
//  public void user_looks_for_the_default_categories_user_page_for_only_on_myco_videos() {
//    videocategories.validatedefaultcategoryUserPageOnlyforMyco();
//  }
  @When("User looks for the Default categories User page for Only on Myco videos")
  public void user_looks_for_the_default_categories_user_page_for_only_on_myco_videos() {
    videocategories.validatedefaultcategoryUserPageOnlyforMyco();
  }

//  @Then("The videos should reflect only in Myco category basis on the videos")
//  public void the_videos_should_reflect_only_in_myco_category_basis_on_the_videos() {
//    videocategories.validateMycoCategory();
//  }
  @Then("The videos should reflect only in Myco category basis on the videos")
  public void the_videos_should_reflect_only_in_myco_category_basis_on_the_videos() {
    videocategories.validateMycoCategory();
  }

//  @When("User looks for the Default categories User page for Top {int} Global videos")
//  public void user_looks_for_the_default_categories_user_page_for_top_global_videos(Integer int1) {
//    videocategories.validateMycoCategory();
//  }
  @When("User looks for the Default categories User page for Top {int} Global videos")
  public void user_looks_for_the_default_categories_user_page_for_top_global_videos(Integer int1) {
    videocategories.validateMycoCategory();
  }

//  @Then(
//      "the videos should reflect in the Top {int} Global category basis on the videos that are"
//          + " popular across all the countries. Top {int} videos from each countries are displayed"
//          + " in this category.")
//  public void
//      the_videos_should_reflect_in_the_top_global_category_basis_on_the_videos_that_are_popular_across_all_the_countries_top_videos_from_each_countries_are_displayed_in_this_category(
//          Integer int1, Integer int2) {
//    videocategories.validatePopularVideosAcrossCountries();
//  }
  @Then(
      "the videos should reflect in the Top {int} Global category basis on the videos that are"
          + " popular across all the countries. Top {int} videos from each countries are displayed"
          + " in this category.")
  public void
      the_videos_should_reflect_in_the_top_global_category_basis_on_the_videos_that_are_popular_across_all_the_countries_top_videos_from_each_countries_are_displayed_in_this_category(
          Integer int1, Integer int2) {
    videocategories.validatePopularVideosAcrossCountries();
  }

//  @When("User looks for the Default categories User page for Top {int} Local - User")
//  public void user_looks_for_the_default_categories_user_page_for_top_local_user(Integer int1) {
//    videocategories.validatedefaultcategoryUserPage();
//  }
  @When("User looks for the Default categories User page for Top {int} Local - User")
  public void user_looks_for_the_default_categories_user_page_for_top_local_user(Integer int1) {
    videocategories.validatedefaultcategoryUserPage();
  }

//  @Then(
//      "the videos should reflect in the Top {int} Local category basis on the videos that are"
//          + " popular across the respective region. \\(I think this might incorrect – need to"
//          + " discuss)")
//  public void
//      the_videos_should_reflect_in_the_top_local_category_basis_on_the_videos_that_are_popular_across_the_respective_region_i_think_this_might_incorrect_need_to_discuss(
//          Integer int1) {
//    videocategories.validatePopularAcrossRegion();
//  }

  @When("user clicks on the video")
  public void user_clicks_on_the_video() {
    // play button click
  }
  @Then(
      "the videos should reflect in the Top {int} Local category basis on the videos that are"
          + " popular across the respective region. \\(I think this might incorrect – need to"
          + " discuss)")
  public void
      the_videos_should_reflect_in_the_top_local_category_basis_on_the_videos_that_are_popular_across_the_respective_region_i_think_this_might_incorrect_need_to_discuss(
          Integer int1) {
    videocategories.validatePopularAcrossRegion();
  }

//  @When("user clicks on the video")
//  public void user_clicks_on_the_video() {
//    // play button click
//  }

//  @Then(
//      "user validates that in-stream ads will be played at the start, middle and end of the video"
//          + " and are non-skippable")
//  public void
//      user_validates_that_in_stream_ads_will_be_played_at_the_start_middle_and_end_of_the_video_and_are_non_skippable() {
//    videoAdsSteps.validatein_sreamAds();
//  }
  @Then(
      "user validates that in-stream ads will be played at the start, middle and end of the video"
          + " and are non-skippable")
  public void
      user_validates_that_in_stream_ads_will_be_played_at_the_start_middle_and_end_of_the_video_and_are_non_skippable() {
    videoAdsSteps.validatein_sreamAds();
  }

//  @Then("user Waits till Ad will play")
//  public void user_waits_till_ad_will_play() {
//    // Implement wait function
//
//  }
  @Then("user Waits till Ad will play")
  public void user_waits_till_ad_will_play() {
    // Implement wait function

  }

//  @Then("user validates while playing Ads, reverse timer clock should be displayed over the video.")
//  public void
//      user_validates_while_playing_ads_reverse_timer_clock_should_be_displayed_over_the_video() {
//    videoAdsSteps.validateReverseTimer();
//  }
  @Then("user validates while playing Ads, reverse timer clock should be displayed over the video.")
  public void
      user_validates_while_playing_ads_reverse_timer_clock_should_be_displayed_over_the_video() {
    videoAdsSteps.validateReverseTimer();
  }

//  @Then("user will verify that user can forward the main video buffer bar")
//  public void user_will_verify_that_user_can_forward_the_main_video_buffer_bar() {
//    videoAdsSteps.forwardBufferBar();
//  }
  @Then("user will verify that user can forward the main video buffer bar")
  public void user_will_verify_that_user_can_forward_the_main_video_buffer_bar() {
    videoAdsSteps.forwardBufferBar();
  }

//  @Then(
//      "user forward the main video buffer bar, but cannot be able to move when In-stream video is"
//          + " playing.")
//  public void
//      user_forward_the_main_video_buffer_bar_but_cannot_be_able_to_move_when_in_stream_video_is_playing() {
//    videoAdsSteps.forwardBufferBar();
//    videoAdsSteps.forwardBufferBarWhikeVideoIsPlaying();
//  }
  @Then(
      "user forward the main video buffer bar, but cannot be able to move when In-stream video is"
          + " playing.")
  public void
      user_forward_the_main_video_buffer_bar_but_cannot_be_able_to_move_when_in_stream_video_is_playing() {
    videoAdsSteps.forwardBufferBar();
    videoAdsSteps.forwardBufferBarWhikeVideoIsPlaying();
  }

//  @Then("user validates in -stream video buffer bar and Main video buffer bar UI")
//  public void user_validates_in_stream_video_buffer_bar_and_main_video_buffer_bar_ui() {
//    videoAdsSteps.validatesstreamVideoBufferBar();
//    videoAdsSteps.validatesstreamVideoBufferBar();
//  }
  @Then("user validates in -stream video buffer bar and Main video buffer bar UI")
  public void user_validates_in_stream_video_buffer_bar_and_main_video_buffer_bar_ui() {
    videoAdsSteps.validatesstreamVideoBufferBar();
    videoAdsSteps.validatesstreamVideoBufferBar();
  }

//  @Then("user should perform play, pause, mute\\/unmute, and alert operations while Ad is playing")
//  public void
//      user_should_perform_play_pause_mute_unmute_and_alert_operations_while_ad_is_playing() {
//    videoAdsSteps.playBtn();
//    videoAdsSteps.pauseBtn();
//    videoAdsSteps.muteBtn();
//    videoAdsSteps.unmuteBtn();
//    // Wait for 5 seconds
//    videoAdsSteps.validatealert();
//  }
  @Then("user should perform play, pause, mute\\/unmute, and alert operations while Ad is playing")
  public void
      user_should_perform_play_pause_mute_unmute_and_alert_operations_while_ad_is_playing() {
    videoAdsSteps.playBtn();
    videoAdsSteps.pauseBtn();
    videoAdsSteps.muteBtn();
    videoAdsSteps.unmuteBtn();
    // Wait for 5 seconds
    videoAdsSteps.validatealert();
  }

//  @Then(
//      "user should validate options {double} Play {double} :arrow_forward, Pause-:pause_button,"
//          + " Mute\\/Unmute {double} :mute, and get the ad alert on the screen before 5s")
//  public void
//      user_should_validate_options_play_arrow_forward_pause_pause_button_mute_unmute_mute_and_get_the_ad_alert_on_the_screen_before_5s(
//          Double double1, Double double2, Double double3) {
//    videoAdsSteps.validateplayBtn();
//    videoAdsSteps.validatepauseBtn();
//    videoAdsSteps.validatemuteBtn();
//    videoAdsSteps.validateunmuteBtn();
//    // Wait for 5 seconds
//    videoAdsSteps.validatealert();
//  }
  @Then(
      "user should validate options {double} Play {double} :arrow_forward, Pause-:pause_button,"
          + " Mute\\/Unmute {double} :mute, and get the ad alert on the screen before 5s")
  public void
      user_should_validate_options_play_arrow_forward_pause_pause_button_mute_unmute_mute_and_get_the_ad_alert_on_the_screen_before_5s(
          Double double1, Double double2, Double double3) {
    videoAdsSteps.validateplayBtn();
    videoAdsSteps.validatepauseBtn();
    videoAdsSteps.validatemuteBtn();
    videoAdsSteps.validateunmuteBtn();
    // Wait for 5 seconds
    videoAdsSteps.validatealert();
  }

//  @When("user clicks on three dots and report link")
//  public void user_clicks_on_three_dots_and_report_link() throws InterruptedException {
//
//    content.clickonlikebutton();
//  }

//  @When("user selects the options for report")
//  public void user_selects_the_options_for_report() throws InterruptedException {
//
//    content.clickonlikebutton();
//  }

//  @When("user clicks on submit button")
//  public void user_clicks_on_submit_button() throws InterruptedException {
//
//    content.clickonlikebutton();
//  }

//  @Then("user validates that report is submitted")
//  public void user_validates_that_report_is_submitted() {
//    videocategories.validatePopularAcrossRegion();
//  }

//  @And("user clicks on About link")
//  public void user_clicks_on_About_link() {
//    content.clickaboutlink();
//  }

//  @Then("user is redirected to older website link for about us")
//  public void user_is_redirected_to_older_website_link_for_about_us() {
//    content.aboutuslink();
//  }

//  @And("user scrolls down to the footer section")
//  public void user_scrolls_down_to_the_footer_section() {
//    content.footersection();
//  }

//  @And("user clicks on Privacy Policy link")
//  public void user_clicks_on_Privacy_Policy_link() {
//    content.clickprivacypolicylink();
//  }
//
//  @Then("user is redirected to older website link for about Private policy")
//  public void user_is_redirected_to_older_website_link_for_about_Private_policy() {
//    content.privacypolicylink();
//  }
  @When("user clicks on three dots and report link")
  public void user_clicks_on_three_dots_and_report_link() throws InterruptedException {

    content.clickonlikebutton();
  }

  @When("user selects the options for report")
  public void user_selects_the_options_for_report() throws InterruptedException {

    content.clickonlikebutton();
  }

  @When("user clicks on submit button")
  public void user_clicks_on_submit_button() throws InterruptedException {

    content.clickonlikebutton();
  }

  @Then("user validates that report is submitted")
  public void user_validates_that_report_is_submitted() {
    videocategories.validatePopularAcrossRegion();
  }

  @And("user clicks on About link")
  public void user_clicks_on_About_link() {
    content.clickaboutlink();
  }

  @Then("user is redirected to older website link for about us")
  public void user_is_redirected_to_older_website_link_for_about_us() {
    content.aboutuslink();
  }

  @And("user scrolls down to the footer section")
  public void user_scrolls_down_to_the_footer_section() {
    content.footersection();
  }

  @And("user clicks on Privacy Policy link")
  public void user_clicks_on_Privacy_Policy_link() {
    content.clickprivacypolicylink();
  }

  @Then("user is redirected to older website link for about Private policy")
  public void user_is_redirected_to_older_website_link_for_about_Private_policy() {
    content.privacypolicylink();
  }

//  @And("user clicks on Contact us link")
//  public void user_clicks_on_Contact_us_link() {
//    content.clickcontactus();
//  }

//  @Then("user is redirected to older website link for about Contact Us")
//  public void user_is_redirected_to_older_website_link_for_about_Contact_Us() {
//    content.contactuslink();
//  }
  @And("user clicks on Contact us link")
  public void user_clicks_on_Contact_us_link() {
    content.clickcontactus();
  }

  @Then("user is redirected to older website link for about Contact Us")
  public void user_is_redirected_to_older_website_link_for_about_Contact_Us() {
    content.contactuslink();
  }
//
//  @When("user navigates to manage videos section")
//  public void user_navigates_to_manage_videos_section() throws InterruptedException {
//    content.manageVideos();
//  }

//  @When("user deletes the first video and verifies it")
//  public void user_deletes_the_first_video_and_verifies_it() throws Exception {
//
//    String text = content.deleteFirstVideo();
//    content.validateDelete(text);
//  }

//  @Then("verify default categories include Recommended vidoes")
//  public void verify_default_categories_include_recommmended_videos() throws InterruptedException {
//    content.Recommendedcategory();
//  }

//  @Then("verify default categories include  Top Trending vidoes")
//  public void verify_default_categories_include_top_trending_videos() throws InterruptedException {
//    content.validatetoptrendingcategory();
//  }
  @When("user navigates to manage videos section")
  public void user_navigates_to_manage_videos_section() throws InterruptedException {
    content.manageVideos();
  }

  @When("user deletes the first video and verifies it")
  public void user_deletes_the_first_video_and_verifies_it() throws Exception {

    String text = content.deleteFirstVideo();
    content.validateDelete(text);
  }

  @Then("verify default categories include Recommended vidoes")
  public void verify_default_categories_include_recommmended_videos() throws InterruptedException {
    content.Recommendedcategory();
  }

  @Then("verify default categories include  Top Trending vidoes")
  public void verify_default_categories_include_top_trending_videos() throws InterruptedException {
    content.validatetoptrendingcategory();
  }
//
//  @Then("verify default categories include New release vidoes")
//  public void verify_default_categories_include_New_release_videos() throws InterruptedException {
//    content.validatenewreleasescategory();
//  }
  @Then("verify default categories include New release vidoes")
  public void verify_default_categories_include_New_release_videos() throws InterruptedException {
    content.validatenewreleasescategory();
  }

  @Then("verify default categories include Most watched vidoes")
  public void verify_default_categories_include_most_watched_videos() throws InterruptedException {
    content.validatemostwatchedcategory();
  }
  @Then("verify registered user default categories include Reccommended videos")
  public void verify_registereduser_default_categories_include_recommmended_videos() throws InterruptedException {
    content.Recommendedcategory();
  }

  @Then("verify registered user default categories include  Top Trending vidoes")
  public void verify_registereduser_default_categories_include_top_trending_videos() throws InterruptedException {
    content.validatetoptrendingcategory();
  }

  @Then("verify registered user default categories include  New release vidoes")
  public void verify_registereduser_default_categories_include_New_release_videos() throws InterruptedException {
    content.validatenewreleasescategory();
  }

  @Then("verify registered user default categories include Most watched vidoes")
  public void verify_registereduser_default_categories_include_most_watched_videos() throws InterruptedException {
    content.validatemostwatchedcategory();
  }
  @Then("user clicks on the ios icon")
  public void userclickonicon() {
	  content.userclickonicon();
  }
  @Then("user is redirected to the respective ios page")
  public void user_is_redirected_to_respective_ios_page() {
	  content.user_is_redirected_to_respective_ios_page();
  }
  @Then("user clicks on the android icon")
  public void userClickonandroidicon() {
	  content.userClickonandroidicon();
  }
  @Then("user is redirected to the respective android page")
  public void user_rediected_android_page() {
	  content.user_rediected_android_page();
  }
  @Then("verify the download icons are displayed in the top right corner")
  public void validatedownloadicons() {
	  content.validatedownloadicon();
  }
  @Then("user clicks on a video")
  public void userClickonavideo() {
	  content.userclickonavideo();
  }
  @Then("user clicks on the three dots of the video")
  public void userclickonthreedots() throws InterruptedException {
	  content.userclickonthreedots();
  }
  @Then("user clicks on the report video option")
  public void userclickonreportuseroption() {
	  content.userclickonreportuseroption();
  }
  @Then("verify the correct options are displayed for video")
  public void verifycorrectoptions() {
	  content.verifycorrectoptions();
  }
  @Then("user reports video multiple times")
  public void reportthevideo() {
	  content.reportthevideo();
  }
  @Then("user navigates to MyPlay on homepage and user clicks on a video")
  public void navigatetomyplayonhomepage() {
	  content.navigatetomyplayonhomepage();
  }
  @Then("verify no three dots are displayed by the video")
  public void verifythreedotsformyplay() {
	  content.verifythreedotsformyplay();
  }
  @When("user adds a comment including emojis")
  public void useraddacomment() throws InterruptedException, IOException {
	  content.useraddacomment();
  }
  
  @Then("user signs out and another user signs in")
  public void usersignsoutandsignin() throws InterruptedException, IOException {
	  content.usersignsoutandsignin();
  }
  @Then("verify the first users comment is visible")
  public void usercommentvisisble() {
	  content.usercommentvisisble();
  }
  @Then("user begins commenting using emojis")
  public void userbeginscommentingemoji() {
	  content.userbeginscommentingemoji();
  }
  @Then("Click on the three dots of the comment posted by the other users")
  @Then("user clicks on the three dots next to the comment")
  public void userclickonthreedotsoncomment() {
	  content.userclickonthreedotsoncomment();
  }
  @Then("the delete option should be displayed")
  public void validatedeleteoption() throws InterruptedException {
	  content.validateDeletedcomment();
  }
  @Then("user clicks on the delete option")
  public void userclickdeleteoption()
  {
	  content.userclickdeleteoption();
  }
  @Then("user clicks cancel on the delete comment pop-up")
  public void userclickondeletecancel() {
	  content.userclickondeletecancel();
  }
  @Then("verify the delete comment pop-up is removed")
  public void verifythecmnt() {
	  content.verifythecmnt();
  }
  @Then("user clicks delete")
  public void userclickdeletecmnt() {
	  content.userclickdeletecmnt();
  }
  @Then("verify the comment is deleted")
  public void verifydeletedcomment() {
	  content.verifydeletedcomment();
  }
  @Then("Delete reply comment and verify")
  public void deletereplycomment() {
	  content.deletereplycomment();
  }
  @Then("verify comment section for a guest user")
  public void verifycommentsectionofguest() {
	  content.verifycommentsectionofguest();
  }
  @Then("user clicks on signin to add comments")
  public void userclickonsignincmnt() {
	  content.userclickonsignincmnt();
  }
  @Then("signs in as user")
  @Then("signs in")
  public void signincmnt() throws IOException, InterruptedException {
	  content.signincmnt();
  }
  @Then("user begins commenting including emojis")
  public void usercmntinemojins() {
	  content.usercmntinemojins();
  }
  @Then("clicks cancel")
  public void clickcanceloncomment() {
	  content.clickcanceloncomment();
  }
  @Then("user comments again but submits")
  public void usercommentsagainandclicksubmits() {
	  content.usercommentsagainandclicksubmits();
  }
  @Then("Comment should be displayed")
  public void commentshouldbedisplayed() {
	  content.commentshouldbedisplayed();
  }
  @Then("user clicks on reply to comment under comment")
  @Then("user clicks on reply to comment")
  public void userclickreply() {
	  content.userclickreply();
  }
  @Then("user begins commenting again using emojis")
  public void userreplyemoji() {
	  content.userreplyemoji();
  }
  @Then("user comments on reply but submits")
  public void userclicksubmitonreply() {
	  content.userclicksubmitonreply();
  }
  @Then("comment should be displayed underneath the first")
  public void commentshouldbedisplayedudernaththefirst() {
	  content.commentshouldbedisplayedudernaththefirst();
  }
  @Then("user clicks on a video and clicks on like and dislike")
  public void userclicklikeanddislike() throws InterruptedException {
	  content.userclickonavideo();
	  content.userclicklikeanddislike();
  }
  @Then("verify signin popup after clicking signin popup")
  public void verifysigninpopup() {
	  content.verifysigninpopup();
  }
  @Then("registered user clicks on a video and clicks on like and dislike")
  public void registereuserclicklikeanddislike() throws InterruptedException {
	  
	  content.registereuserclicklikeanddislike();
  }
  @Then("verify the like and dislike symbol is highligted seperately")
  public void verifylikeanddislike() {
	  content.verifylikeanddislike();
  }
  @Then("user adds a comment and clicks post many times")
  public void useraddcommemtsandclickpost() {
	  content.useraddcommemtsandclickpost();
  }
  @Then("verify the reply comment was only posted once")
  @Then("verify the comment was only posted once")
  public void verifythecomntonlypostedonce() {
	  content.verifythecomntonlypostedonce();
  }
  @Then("user adds a reply comment and clicks post many times")
  public void useraddcmntandclickpostmanytimes() {
	  content.useraddcmntandclickpostmanytimes();
  }
  @Then("user navigates to the footer")
  public void navigatestofooter() throws InterruptedException {
	  content.navigatestofooter();
  }
  @Then("verify the socialmedia links on the footer")
  public void verifythesocialmedialinksoffooter() {
	  content.verifythesocialmedialinksoffooter();
  }
  @Then("Select report option from dropdown")
  public void selectreportoption() {
	content.selectreportcommentoption();
  }
  @When("login the app and access your video")
  public void acessyourvideo() throws InterruptedException, IOException {
	  content.accessyourvideo();
  }
  @Then("Select report option from comment report popup")
  public void selectaoptionfrompopup() {
	  content.selectaoption();
  }
  @Then("validate the content of report popup")
  public void validatethecontentinpopup() {
	  content.validatethecontentinpopup();
  }
  @Then("Select the reason for report and click submit")
  public void selectandsubmitreportcmnt() {
	  content.selectandsubmitreportcmnt();
  }
  @Then("navigate to myplay section and click view all")
  public void navigatetomyplayandclickviewall() throws InterruptedException {
	  content.navigatetomyplayandclickviewall();
  }
  @Then("Verify the myplay videos details")
  public void verifydetailsmyplayvideo() {
	  content.verifydetailsmyplayvideo();
  }
  @Then("Click on search icon and search my play video")
  public void clickonsearchiconandsearchmyplayvideo() throws InterruptedException {
	  content.clickonsearchiconandsearchmyplayvideo();
  }
  @Then("Access the myplay video displayed on other section like new release and trending")
  public void accessmyplayvideoinother() {
	  content.accessmyplayvideoinother();
  }
  @Then("Login to application as user")
  public void logintoapplicationasuser() throws InterruptedException, IOException {
	  content.logintoapplicationasuser();
  }
  @Then("Access my play video displayed Myplay and other sections like new release, continue watch, Trending, suggested videos")
  public void accessmyplayvideoinothercategories() {
	  content.accessmyplayvideoinothercategories();
  }
  @Then("Play a Myplay video and verify the player user options and verify the video details displayed")
  public void playmyplayvideoandverifydetails() throws InterruptedException {
	  content.playmyplayvideoandverifydetails();
  }
}

