package webUITemplate.pages.todoist;

import org.openqa.selenium.By;
import webUITemplate.controls.Button;
import webUITemplate.controls.TextBox;

public class SignUpPage {
    public TextBox emailInput = new TextBox(By.xpath("//input[@type='email']"));
    public TextBox passwordInput = new TextBox(By.xpath("//input[@type='password']"));
    public Button signInButton = new Button(By.xpath("//button[@type='submit']"));

    public TextBox nameInput = new TextBox(By.xpath("//input[@type='text']"));
    public Button logInButton = new Button(By.xpath("//button[@type='submit']"));

}
