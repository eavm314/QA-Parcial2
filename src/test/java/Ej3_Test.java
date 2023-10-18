import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import webUITemplate.testSuite.TodoistBaseTest;

import java.util.Random;

public class Ej3_Test extends TodoistBaseTest {
    //    3) 20% Web UI > Crear un usuario, ingresar con este a la aplicación y crear un proyecto
    //            (Todoist)
    private final Random rnd = new Random();

    @Test
    public void testing() throws InterruptedException {
        createUser();
        createProject();
    }

    private void createUser() throws InterruptedException {
        String randomEmail = "enrique" + rnd.nextInt() + "@gmail.com";
        String randomPassword = "pwd" + rnd.nextInt();

        landingPage.startForFreeButton.click();

        signUpPage.emailInput.setText(randomEmail);
        signUpPage.passwordInput.setText(randomPassword);
        signUpPage.signInButton.click();

        signUpPage.nameInput.setText("Enrique");
        signUpPage.continueButton.click();

        signUpPage.personalAccountButton.click();
        Thread.sleep(1000);
        signUpPage.launchButton.click();

        Assertions.assertTrue(appPage.profileButton.isControlDisplayed(),
                "Error: No se pudo crear la cuenta");
    }

    private void createProject(){

    }
}
