package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){

        // Localizando o driver a ser utilizado
        System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
        // abrindo o navegador
        WebDriver navegador = new ChromeDriver();
        // espera implícita
        navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // maximizar o navegador
        navegador.manage().window().maximize();

        return navegador;
    }
}
