import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public  void setUp(){

        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test
    public void  cssLocators(){

        //by tag name

        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

       WebElement el = wd.findElement(By.tagName("h1"));
       WebElement el1 = wd.findElement(By.cssSelector("h1"));

       WebElement el2 = wd.findElement(By.tagName("a"));
       WebElement el3 = wd.findElement(By.cssSelector("a"));

       WebElement el4 = wd.findElement(By.tagName("form"));
       WebElement el5 = wd.findElement(By.cssSelector("form"));

       WebElement el6 = wd.findElement(By.tagName("input"));
       WebElement el7 = wd.findElement(By.cssSelector("input"));

       WebElement el8 = wd.findElement(By.tagName("button"));
       WebElement el9 = wd.findElement(By.cssSelector("button"));

       List<WebElement> list = wd.findElements(By.tagName("a"));
       List<WebElement> list1 = wd.findElements(By.cssSelector("a"));

        //by class

        WebElement el_1 = wd.findElement(By.className("container"));
        WebElement el1_11 = wd.findElement(By.cssSelector(".container"));

        WebElement el10 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el11 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement el12 = wd.findElement(By.className("active"));
        WebElement el13 = wd.findElement(By.cssSelector(".active"));

        WebElement el14 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el15 = wd.findElement(By.cssSelector(".login_login__3EHKB"));

        //by id

        WebElement el16 = wd.findElement(By.id("root"));
        WebElement el17 = wd.findElement(By.cssSelector("#root"));

        //by attribute

        WebElement el8_1 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement aEl = wd.findElement(By.cssSelector("[class = 'active']"));
        WebElement divEl = wd.findElement(By.cssSelector("[class='login_login__3EHKB']"));
        WebElement divEl1 = wd.findElement(By.cssSelector("[class ='navbar-component_nav__1X_4m']"));
        WebElement inpEl = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inpEl2 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement hrEl = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement hrEl1 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement butEl = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement el11_1 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el12_11 = wd.findElement(By.name("email"));

        //one of elements find by attribute ==> start & end & contains value

        WebElement divEl2 = wd.findElement(By.cssSelector("[class ^='navbar']"));
        WebElement tp = wd.findElement(By.cssSelector("[type$='submit']"));
        WebElement tp1 = wd.findElement(By.cssSelector("[name*='registration']"));



    }
}





