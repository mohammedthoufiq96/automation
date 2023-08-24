package steps;

import net.thucydides.core.annotations.Step;

public class MbrowsePageSteps {

  pages.HomePage home;

  @Step("Click on Mplay or Mlive")
  public void clickonMplayorMlive() {
    home.clickonMplayorMlive();
  }

  @Step("Search any video")
  public void searchVideo() {
    home.searchVideo();
  }

  @Step("Validate list of videos")
  public void validateListOfVideos() {
    home.validateListOfVideos();
  }

  @Step("Click on About button")
  public void clickonAbout() {
    home.clickonAbout();
  }

  @Step("Click on AD Banner")
  public void clickonADBanner() {
    home.clickonADBanner();
  }

  @Step("Click on AD Mplay or Mlive or Mseed")
  public void clickonMplayorMliveorMseed() {
    home.clickonMplayorMliveorMseed();
  }

  @Step("Validate Homepage options")
  public void validateHomepageOptions() {
    home.validateHomepageOptions();
  }
}
