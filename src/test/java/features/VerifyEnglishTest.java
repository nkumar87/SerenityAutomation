package features;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.UserSteps;

@Narrative(text = { "By selecting English on Main Wikipedia page", "As a user",
		"I should be redirected to a wikipedia page which contains english text" })
@RunWith(SerenityRunner.class)
public class VerifyEnglishTest {

	@Managed(driver = "firefox")
	WebDriver driver;

	@Steps
	UserSteps user;

	@Test
	@Title("On selecting english as an option, user should be redirected to a page which contains text in english")
	public void verifyEnglishText() {
		// GIVEN - > user visits wikipedia home page
		user.visitWiki();

		// WHEN - > user selects english
		user.selectEnglish();

		// THEN -> verify that the text is english
		user.verifyEnglishText();
	}
}
