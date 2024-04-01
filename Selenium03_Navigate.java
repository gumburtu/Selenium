package selenuim;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class Selenium03_Navigate {
    @Test
    public void name() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://parabank.parasoft.com/parabank/index.htm"); //1. sayfa
        String expectedUrlParabank = "https://parabank.parasoft.com/parabank/index.htm";
        String actualUrlParabank = driver.getCurrentUrl();
        assertEquals(expectedUrlParabank, actualUrlParabank);

        Thread.sleep(2000);
        driver.navigate().to("https://demo.applitools.com/"); //2. sayfa. yukaridaki sayfadan sonra bu sayfaya gitme komutu
        String expectedUrlDemo = "https://demo.applitools.com/";
        String actualUrlDemo = driver.getCurrentUrl();
        assertEquals(expectedUrlDemo, actualUrlDemo);

        Thread.sleep(2000); //2 sayfa arasinda gecisleri gormek icin bekleme kodu. Normalde olmaz. Gozle gormek icin koyduk.
        driver.navigate().back(); // 1. sayfaya donme, geri donme komutu
        actualUrlParabank = driver.getCurrentUrl();
        assertEquals(expectedUrlParabank, actualUrlParabank);

        Thread.sleep(2000);
        driver.navigate().forward(); //2. sayfaya gitme, ileri git komutu
        actualUrlDemo = driver.getCurrentUrl();
        assertEquals(expectedUrlDemo, actualUrlDemo);

        Thread.sleep(2000);
        driver.navigate().refresh(); //sayfayi yeniler.
        actualUrlDemo = driver.getCurrentUrl();
        assertEquals(expectedUrlDemo, actualUrlDemo);
    }
}
