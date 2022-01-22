package steps;

import elements.LoginPageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.WebDriverUtils;

import static utils.WaitUtils.waitForElementToBeVisible;

public class LoginPageSteps extends Steps {

    private LoginPageElements lp;

    public LoginPageSteps() {
        logger.info("Login page Steps constructor.");
        lp = new LoginPageElements();
    }

    @Given("user go to {string} page")
    public void userGoToPage(String url) {
        WebDriver driver = WebDriverUtils.getWebDriver();
        driver.get(url);
    }

    @And("user enter {string} user name")
    public void userEnterUserName(String userName) {
        waitForElementToBeVisible(lp.userNameField).sendKeys(userName);
    }

    @And("user enter {string} password")
    public void userEnterPassword(String password) {
        lp.passwordField.sendKeys(password);
    }

    @When("user click on Log in button")
    public void userClickOnLogInButton() {
        lp.loginButton.click();
    }
}
