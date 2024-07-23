package regclient.pages.french;


import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import regclient.page.ConsentPage;
import regclient.page.UpdateUINPage;

public class UpdateUINPageFrench extends UpdateUINPage{
	
	@AndroidFindBy(accessibility = "Mettre à jour l'UIN")
	private WebElement updateUINTitle;
	
	@AndroidFindBy(xpath = "//android.widget.EditText")
	private WebElement UINNumberTextBox;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Consentement\")")
	private WebElement consentButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"langue préférée\")")
	private WebElement preferredLanguageButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Nom complet\")")
	private WebElement fullNameButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Date de naissance\")")
	private WebElement DOBButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Genre\")")
	private WebElement genderButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Adresse\")")
	private WebElement addressButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"État civil\")")
	private WebElement maritalStatusButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Langue du candidat\")")
	private WebElement applicantLanguageButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Statut de résidence\")")
	private WebElement residenceStatusButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Emplacement\")")
	private WebElement locationButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Téléphone\")")
	private WebElement phoneButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"E-mail\")")
	private WebElement emailButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Détails de l'introducteur\")")
	private WebElement introducerDetailsButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Biométrie\")")
	private WebElement biometricsButton;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Documents\")")
	private WebElement documentsButton;
	
	@AndroidFindBy(accessibility = "CONTINUER")
	private WebElement continueButton;

	public UpdateUINPageFrench(AppiumDriver driver) {
		super(driver);
	}
	
	public boolean isUpdateMyUINTitleDisplayed() {
		return isElementDisplayed(updateUINTitle);
	}
	
	public  void enterUIN(String UIN) {
		clickAndsendKeysToTextBox(UINNumberTextBox,UIN);
	}
	
	public  void clickOnConsentButton() {
		if(!isElementDisplayedOnScreen(consentButton)) {
			swipeOrScroll();
		}
		clickOnElement(consentButton);
	}
	
	public boolean isConsentTitleDisplayed() {
		if(!isElementDisplayedOnScreen(consentButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(consentButton);
	}
	
	public  void clickOnPreferredLanguageButton() {
		if(!isElementDisplayedOnScreen(preferredLanguageButton)) {
			swipeOrScroll();
		}
		clickOnElement(preferredLanguageButton);
	}
	
	public boolean isPreferredLanguageTitleDisplayed() {
		if(!isElementDisplayedOnScreen(preferredLanguageButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(preferredLanguageButton);
	}
		
	public  void clickOnFullNameButton() {
		if(!isElementDisplayedOnScreen(fullNameButton)) {
			swipeOrScroll();
		}
		clickOnElement(fullNameButton);
	}
	
	public boolean isFullNameTitleDisplayed() {
		if(!isElementDisplayedOnScreen(fullNameButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(fullNameButton);
	}
	
	
	public  void clickOnDOBButton() {
		if(!isElementDisplayedOnScreen(DOBButton)) {
			swipeOrScroll();
		}
		clickOnElement(DOBButton);
	}
	
	public boolean isDOBTitleDisplayed() {
		if(!isElementDisplayedOnScreen(DOBButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(DOBButton);
	}
	
	public  void clickOnGenderButton() {
		if(!isElementDisplayedOnScreen(genderButton)) {
			swipeOrScroll();
		}
		clickOnElement(genderButton);
	}
	
	public boolean isnGenderTitleDisplayed() {
		if(!isElementDisplayedOnScreen(genderButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(genderButton);
	}
	
	public  void clickOnAddressButton() {
		if(!isElementDisplayedOnScreen(addressButton)) {
			swipeOrScroll();
		}
		clickOnElement(addressButton);
	}
	
	public boolean isAddressTitleDisplayed() {
		if(!isElementDisplayedOnScreen(addressButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(addressButton);
	}
	
	public  void clickOnMaritalStatusButton() {
		if(!isElementDisplayedOnScreen(maritalStatusButton)) {
			swipeOrScroll();
		}
		clickOnElement(maritalStatusButton);
	}
	
	public boolean isMaritalStatusTitleDisplayed() {
		if(!isElementDisplayedOnScreen(maritalStatusButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(maritalStatusButton);
	}
	
	public  void clickOnApplicantLanguageButton() {
		if(!isElementDisplayedOnScreen(applicantLanguageButton)) {
			swipeOrScroll();
		}
		clickOnElement(applicantLanguageButton);
	}
	
	public boolean isApplicantLanguageTitleDisplayed() {
		if(!isElementDisplayedOnScreen(applicantLanguageButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(applicantLanguageButton);
	}
	
	public  void clickOnResidenceStatusButton() {
		if(!isElementDisplayedOnScreen(residenceStatusButton)) {
			swipeOrScroll();
		}
		clickOnElement(residenceStatusButton);
	}
	
	public boolean isResidenceStatusTitleDisplayed() {
		if(!isElementDisplayedOnScreen(residenceStatusButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(residenceStatusButton);
	}
	
	public  void clickOnLocationButton() {
		if(!isElementDisplayedOnScreen(locationButton)) {
			swipeOrScroll();
		}
		clickOnElement(locationButton);
	}
	
	public boolean isLocationTitleDisplayed() {
		if(!isElementDisplayedOnScreen(locationButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(locationButton);
	}
	
	public  void clickOnPhoneButton() {
		if(!isElementDisplayedOnScreen(phoneButton)) {
			swipeOrScroll();
		}
		clickOnElement(phoneButton);
	}
	
	public boolean isPhoneTitleDisplayed() {
		if(!isElementDisplayedOnScreen(phoneButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(phoneButton);
	}
	
	public  void clickOnEmailButton() {
		if(!isElementDisplayedOnScreen(emailButton)) {
			swipeOrScroll();
		}
		clickOnElement(emailButton);
	}
	
	public boolean isEmailTitleDisplayed() {
		if(!isElementDisplayedOnScreen(emailButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(emailButton);
	}
	
	public  void clickOnIntroducerDetailsButton() {
		if(!isElementDisplayedOnScreen(introducerDetailsButton)) {
			swipeOrScroll();
		}
		clickOnElement(introducerDetailsButton);
	}
	
	public boolean isIntroducerDetailsTitleDisplayed() {
		if(!isElementDisplayedOnScreen(introducerDetailsButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(introducerDetailsButton);
	}
	
	public  void clickOnBiometricsButton() {
		if(!isElementDisplayedOnScreen(biometricsButton)) {
			swipeOrScroll();
		}
		clickOnElement(biometricsButton);
	}
	
	public boolean isnBiometricsTitleDisplayed() {
		if(!isElementDisplayedOnScreen(biometricsButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(biometricsButton);
	}
	
	public  void clickOnDocumentsButton() {
		if(!isElementDisplayedOnScreen(documentsButton)) {
			swipeOrScroll();
		}
		clickOnElement(documentsButton);
	}
	
	public boolean isDocumentsTitleDisplayed() {
		if(!isElementDisplayedOnScreen(documentsButton)) {
			swipeOrScroll();
		}
		return isElementDisplayed(documentsButton);
	}

	public  ConsentPage clickOnContinueButton() {
		clickOnElement(continueButton);
		return new ConsentPageFrench(driver);
	}
}
