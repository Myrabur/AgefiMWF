package NewsletterForm;

import NewsletterForm.BaseTest;
import NewsletterForm.Form;
import NewsletterForm.Homepage;
import NewsletterForm.UserInfo;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SubmitNewsletterFormTest extends BaseTest {


    Form form = new Form();
    Homepage homepage = new Homepage();



    @Test

    public void userSubmitNewsletterFormFR() {

        UserInfo defaultUserInfo = new UserInfo();

        form.openFR();
        form.SubmitNewsletterFormFR(defaultUserInfo.getUserNome(),defaultUserInfo.getUserPrenom(),
                defaultUserInfo.getUserEmail(),defaultUserInfo.getUserSociété(),
                defaultUserInfo.getUserTéléphone(), defaultUserInfo.getUserAdresse(),
                defaultUserInfo.getUserVille(), defaultUserInfo.getUserCodePostal());
        homepage.checkConfirmMessageFR(defaultUserInfo.getConfirmationMessageFR());

    }


    @Test

    public void userSubmitNewsletterFormEN() {

        UserInfo defaultUserInfo = new UserInfo();

        form.openEN();
        form.SubmitNewsletterFormEN(defaultUserInfo.getUserNome(),defaultUserInfo.getUserPrenom(),
                defaultUserInfo.getUserEmail(),defaultUserInfo.getUserSociété(),
                defaultUserInfo.getUserTéléphone(), defaultUserInfo.getUserAdresse(),
                defaultUserInfo.getUserVille(), defaultUserInfo.getUserCodePostal());
        homepage.checkConfirmMessageEN(defaultUserInfo.getConfirmationMessageEN());

    }

}

