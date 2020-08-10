package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultadoPesquisaPages {

    private WebDriver navegador;

    public ResultadoPesquisaPages(WebDriver navegador) {
        this.navegador = navegador;

    }

    public String resultadoPesquisa(){
        //Verifica se o primeiro href é o site pesquisado
      return navegador.findElement(By.xpath("//link[@href ='https://www.dealertrack.com.br/']")).getAttribute("href");
    }
}
