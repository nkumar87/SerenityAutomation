package steps;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import pages.MainWikiPage;

public class UserSteps {

	private MainWikiPage mainPage;
	private static final String validationText = "Main page";

	@Step
	public void visitWiki() {
		mainPage.open();
	}

	@Step
	public void selectEnglish() {
		mainPage.selectEnglish();
	}

	@Step
	public void verifyEnglishText() {
		assertThat(mainPage.getTextById(validationText));
	}
}
