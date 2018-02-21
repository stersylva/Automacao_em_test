package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChome(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Meu Robo\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Nagegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit/");

        return navegador;
    }
}
