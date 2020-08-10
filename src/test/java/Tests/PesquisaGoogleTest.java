package Tests;
import Pages.PesquisaPages;
import Suporte.LerArquivo;
import Suporte.Web;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class PesquisaGoogleTest {
    private LerArquivo lerarquivo;
    private WebDriver navegador;

    @Before

    public void setUp(){

        //Chama a classe creatChrome
        navegador = Web.createChrome();

        // navegar para a página do google
        navegador.get("http://google.com.br");

    }

    @Test
    public void testRealizarPesquisa(){

        String resultadoPesquisa = new PesquisaPages(navegador)
                .preencherCampoPesquisar(lerarquivo.LerArquivoJson("name"))
                .realizarPesquisa().
                 resultadoPesquisa();

        Assert.assertEquals(lerarquivo.LerArquivoJson("url"), resultadoPesquisa);
    }

    @After

    public void tearDown(){
        //fechar o navegador
        navegador.quit();

    }

}
