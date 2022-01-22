package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPageElements extends PageInit {

    @FindBy(className = "product_sort_container")
    public WebElement productsFilters;
}
