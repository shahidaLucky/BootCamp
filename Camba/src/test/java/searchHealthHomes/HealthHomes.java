package searchHealthHomes;

import CommonApi.Base;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 1/15/2016.
 */
public class HealthHomes extends Base {
    @Test
    public void test1() throws InterruptedException {

        System.out.println("Test has started");
        typeByCss("#ctl00_ctl43_csr_sbox", "Health homes");
        sleepFor(3);
        clickOnCss("#searchImg");
        sleepFor(4);
        /*clickOnCss(".js-flyout-toggle.dropdown");
        typeByCss("#search", "baby dolls");
        clickOnCss(".searchbar-submit.js-searchbar-submit");
        sleepFor(5);
        navigateBack();
        clickOnCss(".dropdown-link.js-flyout-toggle.flyout-toggle");
        sleepFor(3);
        clickOnCss(".js-account-flyout-logged-out.active>li>a");
        sleepFor(4);*/
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test has ended");
    }
}
