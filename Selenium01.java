package selenuim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.costco.co.uk");

        String title = driver.getTitle(); //Sayfanin Title'ini gosterir
        System.out.println("Title = " + title); //Title"i consola yazdirir


        String url = driver.getCurrentUrl(); //Sayfanin URL adresini alir.
        System.out.println("Costco'nun adresi : " + url); //Sayfanin URL adresini consola yazdirir.

        driver.close(); //actigi tarayici ekranini kapatir.
    }
}
