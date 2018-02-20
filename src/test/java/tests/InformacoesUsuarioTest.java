package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    private WebDriver navegador;

    @Before
    public void setUp(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Meu Robo\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void testAdicionarUmaInformacaoAdcionalDoUsusario(){
              //Nagegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit/");

        //Clicar no link que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

       //Identificar o formulario de login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que está dentro do formulario de id "signinbox" o texto "ster"
        formularioSignInBox.findElement(By.name("login")).sendKeys("ster");

        //Digitar no campo com name "password" que está dentro do formulario de id "signinbox" o texto "12345"
        formularioSignInBox.findElement(By.name("password")).sendKeys("12345");

        //Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com class "me" está o texto "Hi, Ster"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, teste", textoNoElementoMe);


    }

    @Test
    public void testAdicionarUmaInformacaoAdcionalDoUsusario02(){
        //Nagegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit/");

        //Clicar no link que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

        //Identificar o formulario de login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que está dentro do formulario de id "signinbox" o texto "ster"
        formularioSignInBox.findElement(By.name("login")).sendKeys("ster02");

        //Digitar no campo com name "password" que está dentro do formulario de id "signinbox" o texto "12345"
        formularioSignInBox.findElement(By.name("password")).sendKeys("123456");

        //Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com class "me" está o texto "Hi, Ster"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, teste", textoNoElementoMe);


    }

    @After
    public void tearDown(){
        //Fechar o nagegador
        navegador.quit();
    }
}
