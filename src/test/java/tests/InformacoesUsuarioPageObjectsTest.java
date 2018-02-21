package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import suporte.Web;

public class InformacoesUsuarioPageObjectsTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChome();
    }
    @Test
    public void testAdicionarUmaInformacaoAdcionalDoUsusario(){
        new LoginPage(navegador)
                .clickSignIn()
                .typeLogin("ster");
    }
    @After
    public void tearDown(){
        navegador.quit();
    }

}
