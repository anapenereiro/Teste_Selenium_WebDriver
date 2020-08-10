package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PesquisaPages {
    private WebDriver navegador;
    public PesquisaPages(WebDriver navegador){
        this.navegador = navegador;
    }

    public PesquisaPages preencherCampoPesquisar(String pesquisa){

        //digitar no campo a busca
        navegador.findElement(By.name("q")).sendKeys(pesquisa);

        return this;
    }

    public ResultadoPesquisaPages realizarPesquisa(){

        //Clicar em pesquisa google
        navegador.findElement(By.className("gNO89b")).click();
        return new ResultadoPesquisaPages(navegador);

    }
}
