package steps;

import net.thucydides.core.annotations.Step;

public class videoCategoriesSteps {

  pages.HomePage home;

  @Step("Click on Mplay or Mlive")
  public void clickonMplayorMlive() {
    home.clickonMplayorMlive();
  }

  @Step("Validate default categories list ")
  public void validatedefaultcategorieslist() {
    home.validatedefaultcategorieslist();
  }

  @Step("Displayed default categories list ")
  public void dispalyeddefaultcategorieslist() {
    home.dispalyeddefaultcategorieslist();
  }

//  @Step("Validate page title")
//  public void verifypageTitle() {
//    home.verifypageTitle();
//  }

  @Step("Validate top trending video")
  public void validatetoptrendingvideos() {
    home.validatetoptrendingvideos();
  }

  @Step("Displayed top trending videos")
  public void displaytoptrendingvideos() {
    home.displaytoptrendingvideos();
  }

  @Step("validate most watched videos")
  public void validatemostwatchedvideos() {
    home.validatemostwatchedvideos();
  }

  @Step("validate popular videos")
  public void validatedepopularvideos() {
    home.validatedepopularvideos();
  }

  @Step("validate new releases videos")
  public void validatenewreleasesvideos() {
    home.validatenewreleasesvideos();
  }

  @Step("validate All countries popular Videos")
  public void validateAllcountriespopularVideos() {
    home.validatedepopularvideos();
  }

  @Step("validate default categories list Recommended")
  public void validatedefaultcategorieslistRecommended() {
    home.validatedefaultcategorieslistRecommended();
  }

  @Step("display default categories list Recommended")
  public void displayedefaultcategorieslistRecommended() {
    home.displayedefaultcategorieslistRecommended();
  }

  @Step("validate Myco Category")
  public void validateMycoCategory() {
    home.validateMycoCategory();
  }

  @Step("validate Popular Videos Across Countries")
  public void validatePopularVideosAcrossCountries() {
    home.validatePopularVideosAcrossCountries();
  }

  @Step("validate Popular videos Across Regio")
  public void validatePopularAcrossRegion() {
    home.validatePopularAcrossRegion();
  }

  @Step("validate default category User Page")
  public void validatedefaultcategoryUserPage() {
    home.validatedefaultcategoryUserPage();
  }

  @Step("validate default category User Page Top Trending Videos")
  public void validatedefaultcategoryUserPageTopTrendingVideos() {
    home.validatedefaultcategoryUserPageTopTrendingVideos();
  }

  @Step("validate default category User Page New Release Videos")
  public void validatedefaultcategoryUserPageNewReleaseVideos() {
    home.validatedefaultcategoryUserPageNewReleaseVideos();
  }

  @Step("validate default category User Page New Release Video")
  public void validatedefaultcategoryUserPageNewReleaseVideo() {
    home.validatedefaultcategoryUserPageNewReleaseVideo();
  }

  @Step("validate default category User Page Popular myco")
  public void validatedefaultcategoryUserPagePopularmyco() {
    home.validatedefaultcategoryUserPagePopularmyco();
  }

  @Step("validate default category User Page Only for Myco")
  public void validatedefaultcategoryUserPageOnlyforMyco() {
    home.validatedefaultcategoryUserPageOnlyforMyco();
  }
}
