package pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;

@DefaultUrl("https://www.wikipedia.org")
public class MainWikiPage extends PageObject {

	@FindBy(id = "js-link-box-en")
	WebElementFacade englishLink;

	@FindBy(id = "n-mainpage-description")
	WebElementFacade mainPageLink;

	public void selectEnglish() {
		System.out.println(englishLink.getText());
		englishLink.click();
	}

	public boolean getTextById(String value) {
		waitForAnyRenderedElementOf(By.id("n-mainpage-description"));
		return mainPageLink.containsOnlyText(value);
	}

	@WhenPageOpens
	public void waitUntilEnglishAppears() {
		element(englishLink).waitUntilVisible();
	}
}
