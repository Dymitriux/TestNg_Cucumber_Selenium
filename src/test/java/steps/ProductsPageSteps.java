package steps;

import elements.ProductsPageElements;
import io.cucumber.java.en.Then;

import static utils.WaitUtils.waitForElementToBeVisible;

public class ProductsPageSteps extends Steps {

    private ProductsPageElements pp;

    public ProductsPageSteps() {
        logger.info("Login page Steps constructor.");
        pp = new ProductsPageElements();
    }

    @Then("page with products is displayed")
    public void pageWithProductsIsDisplayed() {
        waitForElementToBeVisible(pp.productsFilters);
    }
}
