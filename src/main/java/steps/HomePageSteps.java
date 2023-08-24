package steps;

import net.thucydides.core.annotations.Step;

public class HomePageSteps {

  pages.HomePage home;

  @Step("Navigate to Home Page")
  public HomePageSteps navigate() {

    home.open();
    return this;
  }

  @Step("verify default categories include Recommended vidoes")
  public void validaterecommendedatgeory() throws InterruptedException {
    home.validaterecommendedatgeory();
  }

//  @Step("verify default categories include  Top Trending vidoes")
//  public void validatetoptrendingcategory() {
//    home.validatetoptrendingcategory();
//  }

//  @Step("verify default categories include New release vidoes")
//  public void validatenewreleasescategory() {
//    home.validatenewreleasescategory();
//  }
  @Step("verify default categories include New release vidoes")
  public void validatenewreleasescategory() {
    home.validatenewreleasescategory();
  }

//  @Step("verify default categories include Most watched vidoes")
//  public void validatemostwatchedcategory() {
//    home.validatemostwatchedcategory();
//  }

//  @Step("user clicks on a video and clicks on like and dislike")
//  public void guestClicksOnLikeAndDislike() throws InterruptedException {
//    home.clickOnFirstVideo();
//    home.clickOnLike();
//  }
//
//  @Step("verify like and dislike buttons are disabled or grayed out")
//  public void verifyLikeAndDislike() throws InterruptedException {
//    home.verifyDislikeButton();
//  }
//
//  @Step("registered user access the application")
//  public void registereduserlogin() throws InterruptedException {
//
//    home.RegisteredUserLogin("stgithub001@gmail.com", "Qwaszx@123");
//  }
  @Step("verify default categories include Most watched vidoes")
  public void validatemostwatchedcategory() {
    home.validatemostwatchedcategory();
  }

  @Step("user clicks on a video and clicks on like and dislike")
  public void guestClicksOnLikeAndDislike() throws InterruptedException {
    home.clickOnFirstVideo();
    home.clickOnLike();
  }

  @Step("verify like and dislike buttons are disabled or grayed out")
  public void verifyLikeAndDislike() throws InterruptedException {
    home.verifyDislikeButton();
  }

  @Step("registered user access the application")
  public void registereduserlogin() throws InterruptedException {

    home.RegisteredUserLogin("stgithub001@gmail.com", "Qwaszx@123");
  }

  @Step("registered user clicks on a video and clicks on like and dislike")
  public void registeredUserLikesAndDislikesVideo() {
    home.registeredUserLikesAndDislikes();
  }
//  @Step("registered user clicks on a video and clicks on like and dislike")
//  public void registeredUserLikesAndDislikesVideo() {
//    home.registeredUserLikesAndDislikes();
//  }

  @Step("verify the like and dislike symbol is highligted seperately")
  public void verifyRegisteredLikeDislike() {
    home.verifyLikeDisLikeUI();
  }

//  @Step("user clicks on a video")
//  public void clickOnVideo() throws InterruptedException {
//    home.clickOnFirstVideo();
//  }

//  @Step("verify comment section for a guest user")
//  public void verifyCommentSection() {
//    home.verifyCommentSection();
//  }
//  @Step("verify the like and dislike symbol is highligted seperately")
//  public void verifyRegisteredLikeDislike() {
//    home.verifyLikeDisLikeUI();
//  }

  @Step("user clicks on a video")
  public void clickOnVideo() throws InterruptedException {
    home.clickOnFirstVideo();
  }

  @Step("verify comment section for a guest user")
  public void verifyCommentSection() {
    home.verifyCommentSection();
  }

  @Step("user clicks on signin to add comments")
  public void clickSignInToAddComment() {
    home.clickSignInFromComments();
  }

  @Step("signs in")
  public void signsIn() throws InterruptedException {
    home.signInComments();
  }
//  @Step("user clicks on signin to add comments")
//  public void clickSignInToAddComment() {
//    home.clickSignInFromComments();
//  }

//  @Step("signs in")
//  public void signsIn() throws InterruptedException {
//    home.signInComments();
//  }

//  @Step("user begins commenting including emojis")
//  public void commentUsingEmojis() {
//    home.commentUsingEmojis();
//  }

//  @Step("clicks cancel")
//  public void clickCancel() {
//    home.cancelComment();
//  }

//  @Step("user comments again but submits")
//  public void commentAndPost() {
//    home.commentUsingEmojis();
//    home.postButton();
//  }
  @Step("user begins commenting including emojis")
  public void commentUsingEmojis() {
    home.commentUsingEmojis();
  }

  @Step("clicks cancel")
  public void clickCancel() {
    home.cancelComment();
  }

  @Step("user comments again but submits")
  public void commentAndPost() {
    home.commentUsingEmojis();
    home.postButton();
  }

//  @Step("Comment should be displayed")
//  public void verifyComment() throws InterruptedException {
//    home.verifyComment();
//  }

//  @Step("user clicks on reply to comment")
//  public void clickReplyToComment() {
//    home.clickReply();
//  }

//  @Step("user begins commenting again using emojis")
//  public void commentOnReply() {
//    home.commentWithoutEmojis();
//  }
//
//  @Step("user clicks cancel")
//  public void cancelReply() {
//    home.cancelComment();
//  }

//  @Step("user clicks on the reply button again")
//  public void clickReplyAgain() throws InterruptedException {
//    home.clickReply();
//    home.clickReply();
//    Thread.sleep(3000);
//  }

//  @Step("user comments on reply but submits")
//  public void commentAndSubmit() {
//    home.commentWithoutEmojis();
//    home.postButton();
//  }
  @Step("Comment should be displayed")
  public void verifyComment() throws InterruptedException {
    home.verifyComment();
  }

  @Step("user clicks on reply to comment")
  public void clickReplyToComment() {
    home.clickReply();
  }

  @Step("user begins commenting again using emojis")
  public void commentOnReply() {
    home.commentWithoutEmojis();
  }

  @Step("user clicks cancel")
  public void cancelReply() {
    home.cancelComment();
  }

  @Step("user clicks on the reply button again")
  public void clickReplyAgain() throws InterruptedException {
    home.clickReply();
    home.clickReply();
    Thread.sleep(3000);
  }

  @Step("user comments on reply but submits")
  public void commentAndSubmit() {
    home.commentWithoutEmojis();
    home.postButton();
  }

//  public void clickPost() {
//    home.postButton();
//  }
  public void clickPost() {
    home.postButton();
  }

//  public void signsInAsAnotherUser() {
//    home.signInAsAnotherUser();
//  }
  public void signsInAsAnotherUser() {
    home.signInAsAnotherUser();
  }

//  public void registeredUserLogin() throws InterruptedException {
//
//    home.RegisteredUserLogin("testuser04", "MyPassword123$");
//  }
  public void registeredUserLogin() throws InterruptedException {

    home.RegisteredUserLogin("testuser04", "MyPassword123$");
  }

//  public void clickOnCommentDots() throws InterruptedException {
//    Thread.sleep(2000);
//    home.clickOnCommentDots();
//  }
  public void clickOnCommentDots() throws InterruptedException {
    Thread.sleep(2000);
    home.clickOnCommentDots();
  }

//  public void isDeleteOptionDisplayed() {
//    home.isDeleteOptionDisplayed();
//  }
  public void isDeleteOptionDisplayed() {
    home.isDeleteOptionDisplayed();
  }

//  public void clickDeleteButton() throws InterruptedException {
//    home.clickDeleteButton();
//  }
  public void clickDeleteButton() throws InterruptedException {
    home.clickDeleteButton();
  }

//  public void cancelDeleteCommentPopUp() {
//    home.cancelDeleteCommentPopUp();
//  }
  public void cancelDeleteCommentPopUp() {
    home.cancelDeleteCommentPopUp();
  }

//  public void verifyDeleteCommentPopUpIsClosed() {
//    home.verifyDeleteCommentPopUpIsClosed();
//  }
  public void verifyDeleteCommentPopUpIsClosed() {
    home.verifyDeleteCommentPopUpIsClosed();
  }

//  public void deleteComment() {
//    home.deleteComment();
//  }
  public void deleteComment() {
    home.deleteComment();
  }

//  public void verifyCommentIsRemoved() {
//    home.verifyCommentIsRemoved();
//  }
  public void verifyCommentIsRemoved() {
    home.verifyCommentIsRemoved();
  }

//  public void commentUsingEmojisSubmit() {
//    home.commentUsingEmojis();
//    home.postButton();
//  }

  //	public void clickOnThreeDotsReply() throws InterruptedException {
  //		home.clickOnThreeDotsReply();
  //
  //	}
  //
  //
//  public void signsOut() {
//    home.signOut();
//  }

//  @Step("comment should be displayed underneath the first")
//  public void verifyReply() {
//    home.verifyReply();
//  }
  public void commentUsingEmojisSubmit() {
    home.commentUsingEmojis();
    home.postButton();
  }

  //	public void clickOnThreeDotsReply() throws InterruptedException {
  //		home.clickOnThreeDotsReply();
  //
  //	}
  //
  //
  public void signsOut() {
    home.signOut();
  }

  @Step("comment should be displayed underneath the first")
  public void verifyReply() {
    home.verifyReply();
  }

//  public void clickUserThreeDots() {
//    home.clickUserThreeDots();
//  }
  public void clickUserThreeDots() {
    home.clickUserThreeDots();
  }

//  public void clickReportVideo() {
//    home.clickReportVideo();
//  }
  public void clickReportVideo() {
    home.clickReportVideo();
  }

//  public void verifyVideoReportOptions() {
//    home.verifyVideoReportOptions();
//  }
  public void verifyVideoReportOptions() {
    home.verifyVideoReportOptions();
  }

//  public void clickReportUser() {
//    home.clickReportUser();
//  }
  public void clickReportUser() {
    home.clickReportUser();
  }

//  public void verifyReportUserOptions() {
//    home.verifyUserReportOptions();
//  }
  public void verifyReportUserOptions() {
    home.verifyUserReportOptions();
  }

//  public void moveToEnd() {
  public void moveToEnd() {

    home.scrolltoEnd();
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
//    home.scrolltoEnd();
//    try {
//      Thread.sleep(10000);
//    } catch (InterruptedException e) {
//      e.printStackTrace();
//    }
//  }

//  public void validateFooter() {
//    home.footericons();
//  }
  public void validateFooter() {
    home.footericons();
  }

//  public void verifyDownloadIcons() {
//    home.verifyDownloadIcons();
//  }
  public void verifyDownloadIcons() {
    home.verifyDownloadIcons();
  }

//  public void clickIosIcon() {
//    home.clickIosIcon();
//  }
  public void clickIosIcon() {
    home.clickIosIcon();
  }

//  public void clickAndriodIcon() {
//    home.clickAndroidIcon();
//  }
  public void clickAndriodIcon() {
    home.clickAndroidIcon();
  }
}
