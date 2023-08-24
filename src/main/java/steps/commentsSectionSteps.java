package steps;

import net.thucydides.core.annotations.Step;

public class commentsSectionSteps {

  pages.HomePage home;

  @Step("Navigate to Home Page")
  public commentsSectionSteps navigate() {

    home.open();
    return this;
  }

  @Step("Element is Displayed")
  public void eledisplay() {

    home.isDisplayed("//*[@id = 'username']");
  }

//  pages.HomePage home;

//  @Step("Navigate to Home Page")
//  public commentsSectionSteps navigate() {
//
//    home.open();
//    return this;
//  }

//  @Step("Element is Displayed")
//  public void eledisplay() {
//
//    home.isDisplayed("//*[@id = 'username']");
//  }

  @Step("Click On dislike Button")
  public void clickondislikebutton() throws InterruptedException {

    // home.ClickOnDislikeButton();

  }

  @Step("Validate Search")
  public void ValidateSearch() throws InterruptedException {

    home.validateSearch();
  }

  @Step("Validate Delete option")
  public void validateDeleteOption() throws InterruptedException {

    home.validateDeleteOption();
  }

//  @Step("Validate comment button is grey out")
//  public void validateCommenbtnt() throws InterruptedException {
//
//    home.validateCommentbtn();
//  }

  @Step("Validate other users comment")
  public void validateOtherUsersComment() throws InterruptedException {

    home.validateOtherUsersComment();
  }

  @Step("Validate Mbrowse and Mlive videos comment")
  public void validateMbrowsesMlive() throws InterruptedException {

    home.validateMbrowsesMlive();
  }

  @Step("Validate Mplay")
  public void validateMplay() throws InterruptedException {

    home.validateMplay();
  }
}
