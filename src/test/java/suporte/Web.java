package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        // Espera 1 segundo até que todos os elementos da página estejam carregados para serem encontrados pelo script
        navegador.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        //Navegando para a página do taskit
        navegador.get("http://www.juliodelima.com.br/taskit");

        return navegador;
    }
}
