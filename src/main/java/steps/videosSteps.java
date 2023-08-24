package steps;

import net.thucydides.core.annotations.Step;

public class videosSteps {
  pages.HomePage home;

  @Step("Validate User Promoted Videos")
  public void validateUserPromotedVideos() throws InterruptedException {
    home.validateUserPromotedVideos();
  }

  @Step("Validate Hero Banner")
  public void validateHeroBanner() throws InterruptedException {
    home.HeroBanner();
  }

  @Step("Click Video Ads")
  public void clickVideoAds() throws InterruptedException {
    home.clickVideoAds();
  }

//  @Step("Click on Play Video ")
//  public void clickPlayVideobtn() throws InterruptedException {
//    home.clickPlayVideobtn();
//  }
}
