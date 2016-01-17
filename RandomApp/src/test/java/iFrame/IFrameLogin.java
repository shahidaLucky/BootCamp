package iFrame;

import CommonApi.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Shahida Lucky on 1/13/2016.
 */
public class IFrameLogin extends Base {

    @Test
    public void logIn() throws InterruptedException {
        clickOnCss(".user_buttons .login_btn.link_button");
        sleepFor(2);
        WebElement element1 = getWebElementByCss("#surf-xdm iframe:nth-child(1)");
        iframeHandle(element1);
        WebElement element2 = getWebElementByCss("#display-frame");
        iframeHandle(element2);
        typeByCss("input#input_username", "cat3");
        sleepFor(1);
        typeByCss("input#input_password", "1234...");
        sleepFor(1);
        clickOnCss("#button_submit");
        sleepFor(2);
        goBackToHomeWindows();


    }
}
