package utils;

import org.openqa.selenium.By;

public class Locators {

    public static final String url = "https://telefonvertrag.de";
    String email = "testuser@tutusmedia.com";


    public static final By contactFooterLink = By.xpath("//footer//a[text()='Kontakt & Support']");

    public static final By cookieAcceptButton = By.xpath("//button[@aria-label='Akzeptiere alle']");
    //Contact Form locators
    public static final By nameContactFormInput = By.xpath("//label[text()='Name']//following-sibling::input");
    public static final By emailContactFormInput = By.xpath("//label[text()='E-Mail Adresse']//following-sibling::input");
    public static final By subjectContactFormInput = By.xpath("//label[text()='Betreff']//following-sibling::input");
    public static final By newsContactFormTextarea = By.xpath("//label[text()='Deine Nachricht an uns']//following-sibling::textarea");
    public static final By acceptContactFormCheckbox = By.cssSelector(".custom-checkbox.custom-control");
    public static final By submitContactForm = By.cssSelector("button[type='button']");

    public static final By errorNotifications = By.cssSelector(".srv-validation-message");
    public static final By alertSuccess = By.cssSelector("div[role='alert']");

    // Newsletter input
    public static final By newsletterEmailRegistrationInput = By.xpath("//input[@type='email']");
    public static final By newsletterEmailRegistrationButton= By.cssSelector("button[class$='button']");
    public static final By newsletterEmailUnRegistrationLink= By.xpath("//a[@title='Newsletter wieder abmelden']");

    // Blog page
    public static final By vorUndNachnamescroll = By.xpath("//label[text()='Vor- und Nachname']");
    public static final By vorUndNachname = By.xpath("(//input[@class='form-control'])[1]");
    public static final By emailAdresse = By.xpath("(//input[@class='form-control'])[2]");
    public static final By kommentar = By.xpath("//textarea[@rows='10']");
    public static final By ratingstars4 = By.xpath("//div[@class='rating']//i[4]");
    public static final By ratingstars3 = By.xpath("//div[@class='rating']//i[3]");
    public static final By ratingstars2 = By.xpath("//div[@class='rating']//i[2]");
    public static final By ratingstars1 = By.xpath("//div[@class='rating']//i[1]");
    public static final By bewertungSendenButton = By.cssSelector("button[type='button']");
    public static final By succesfullyMessage = By.xpath("//div[text()='Vielen Dank für Ihren Kommentar.']");
    public static final By ErrorMessage = By.cssSelector(".srv-validation-message");







}
