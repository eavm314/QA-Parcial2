package webUITemplate.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webUITemplate.pages.todoist.AppPage;
import webUITemplate.pages.todoist.LoginPage;
import webUITemplate.session.Session;

public class TodoistBaseTest {
    LoginPage loginPage = new LoginPage();
    AppPage appPage = new AppPage();

    @AfterEach
    public void close(){
        Session.getInstance().closeSession();
    }
    @BeforeEach
    public void open(){
        Session.getInstance().getBrowser().get("https://todoist.com/app/");
    }

    @Test
    public void login(){
        loginPage.emailInput.setText("eavm2021@gmail.com");
        loginPage.passwordInput.setText("eavm1234");

        loginPage.logInButton.click();

        Assertions.assertTrue(appPage.todayTitle.isControlDisplayed(),
                "ERROR no se pudo iniciar sesion");

    }
}
