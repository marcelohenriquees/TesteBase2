package tests;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NovaOcorrenciaTest {
    @Test
    public void testCadastrarNovaOcorrencia (){
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://mantis-prova.base2.com.br/login_page.php");

        //Identificando o formulário de username
        navegador.findElement(By.name("username")).click();

        // Digitar o username marcelo.henrique
        navegador.findElement(By.name("username")).sendKeys("marcelo.henrique");

        // Clicar no password
        navegador.findElement(By.name("password")).click();

        // Digitar o password "mh1234"
        navegador.findElement(By.name("password")).sendKeys("mh1234");

        // Clicar no botão com o texto "Login"
        navegador.findElement(By.xpath("//input[@value='Login']")).click();

        //Clicar em "Report Issue"
        navegador.findElement(By.linkText("Report Issue")).click();

        //Seleciona Projeto
        navegador.findElement(By.xpath("//tr[@class='row-1']//option[@value='25']")).click();

        //Clicar para selecionar o projeto
        navegador.findElement(By.xpath("//input[@value='Select Project']")).click();

        //Seleciona "Category"
        navegador.findElement(By.xpath("//select[@name='category_id']/option[@value='59']")).click();

        //Selecionar "Reproducibility"
        navegador.findElement(By.xpath("//select[@name='reproducibility']/option[@value='10']")).click();

        //Selecionar "Severity"
        navegador.findElement(By.xpath("//select[@name='severity']/option[@value='60']")).click();

        // Selecionar "Priority"
        navegador.findElement(By.xpath("//select[@name='priority']/option[@value='40']")).click();

        // Preencher "Sumary"
        navegador.findElement(By.name("summary")).sendKeys("teste Base2");

        // Preencher "Description"
        navegador.findElement(By.name("description")).sendKeys("teste Base2");

        // Preencher "Steps To Reproduce"
        navegador.findElement(By.name("steps_to_reproduce")).sendKeys("teste Base2");

        // Clicar em "Submity Report"
        navegador.findElement(By.xpath("//input[@value='Submit Report']")).click();

        // Fechar o navegador
        navegador.quit();
    }

}
