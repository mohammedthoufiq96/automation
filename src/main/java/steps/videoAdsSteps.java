package steps;

import net.thucydides.core.annotations.Step;

public class videoAdsSteps {

  pages.HomePage home;

  @Step("validate stream Ads")
  public void validatein_sreamAds() {
    home.validatein_sreamAds();
  }

  @Step("validate Reverse Timer")
  public void validateReverseTimer() {
    home.validateReverseTimer();
  }

  @Step("click forward buffer bar")
  public void forwardBufferBar() {
    home.forwardBufferBar();
  }

  @Step("click forward buffer bar while video is playing")
  public void forwardBufferBarWhikeVideoIsPlaying() {
    home.forwardBufferBarWhikeVideoIsPlaying();
  }

  @Step("validate stream Video Buffer Bar")
  public void validatesstreamVideoBufferBar() {
    home.validatesstreamVideoBufferBar();
  }

  @Step("click on Play button")
  public void playBtn() {
    home.playBtn();
  }

  @Step("click on Pause button")
  public void pauseBtn() {
    home.pauseBtn();
  }

  @Step("click on mute button")
  public void muteBtn() {
    home.muteBtn();
  }

  @Step("click on unmute button")
  public void unmuteBtn() {
    home.unmuteBtn();
  }

  @Step("validate alert")
  public void validatealert() {
    home.validatealert();
  }

  @Step("validate Play button")
  public void validateplayBtn() {
    home.validateplayBtn();
  }

  @Step("validate pause button")
  public void validatepauseBtn() {
    home.validatepauseBtn();
  }

  @Step("validate mute button")
  public void validatemuteBtn() {
    home.validatemuteBtn();
  }

  @Step("validate unmute button")
  public void validateunmuteBtn() {
    home.validateunmuteBtn();
  }
}
