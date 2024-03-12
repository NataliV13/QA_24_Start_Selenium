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
        WebElement body2 = wd.findElement(By.xpath("//body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));
        WebElement div2 = wd.findElement(By.xpath("//div"));

       WebElement el = wd.findElement(By.tagName("h1"));
       WebElement el1 = wd.findElement(By.cssSelector("h1"));
        WebElement h1_3 = wd.findElement(By.xpath("//h1"));

       WebElement el2 = wd.findElement(By.tagName("a"));
       WebElement el3 = wd.findElement(By.cssSelector("a"));
       WebElement a_2 = wd.findElement(By.xpath("//a"));

       WebElement el4 = wd.findElement(By.tagName("form"));
       WebElement el5 = wd.findElement(By.cssSelector("form"));
        WebElement form2 = wd.findElement(By.xpath("//form"));

       WebElement el6 = wd.findElement(By.tagName("input"));
       WebElement el7 = wd.findElement(By.cssSelector("input"));
        WebElement input2 = wd.findElement(By.xpath("//input"));

       WebElement el8 = wd.findElement(By.tagName("button"));
       WebElement el9 = wd.findElement(By.cssSelector("button"));
        WebElement button2 = wd.findElement(By.xpath("//button"));

       List<WebElement> list = wd.findElements(By.tagName("a"));
       List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
       List<WebElement> list3 = wd.findElements(By.xpath("//a"));

        //by class

        WebElement el_1 = wd.findElement(By.className("container"));
        WebElement el1_11 = wd.findElement(By.cssSelector(".container"));
        WebElement el17 = wd.findElement(By.xpath("//*[@class='container']"));

        WebElement el10 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el11 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el3_1 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el12 = wd.findElement(By.className("active"));
        WebElement el13 = wd.findElement(By.cssSelector(".active"));
        WebElement el3_18 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el14 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el15 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el5_1 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //by id

        WebElement el16 = wd.findElement(By.id("root"));
        WebElement el17_1 = wd.findElement(By.cssSelector("#root"));
        WebElement el19 = wd.findElement(By.xpath("//div[@id='root']"));

        //by attribute

        WebElement el8_1 = wd.findElement(By.cssSelector("[id='root']"));
        WebElement el20 = wd.findElement(By.xpath("//*[@id='root']"));
        WebElement aEl = wd.findElement(By.cssSelector("[class = 'active']"));
        WebElement divEl = wd.findElement(By.cssSelector("[class='login_login__3EHKB']"));
        WebElement divEl1 = wd.findElement(By.cssSelector("[class ='navbar-component_nav__1X_4m']"));
        WebElement inpEl = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inpEl2 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement hrEl = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement hrEl1 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement el10_1 = wd.findElement(By.xpath("//*[@href='/about']"));
        WebElement butEl = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement el11_1 = wd.findElement(By.cssSelector("[name='email']"));
        WebElement el12_1 = wd.findElement(By.xpath("//*[@name='email']"));
        WebElement el12_11 = wd.findElement(By.name("email"));


        //one of elements find by attribute ==> start & end & contains value

        WebElement divEl2 = wd.findElement(By.cssSelector("[class ^='navbar']"));
        WebElement tp = wd.findElement(By.cssSelector("[type$='submit']"));
        WebElement tp1 = wd.findElement(By.cssSelector("[name*='registration']"));
        WebElement el21 = wd.findElement(By.xpath("//input[@placeholder='Email']"));

        //start
        WebElement el14_1 = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement el22 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        //end
        WebElement el15_1 = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement el23 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        //contains
        WebElement el16_1 = wd.findElement(By.cssSelector("[placeholder *='ma']"));
        WebElement el24 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));

        //by text
        WebElement el25 = wd.findElement(By.xpath("//a[text()='ABOUT']"));
    }

    @Test
    public void classwork(){

        //parent

        WebElement el = wd.findElement(By.xpath("//h1/.."));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el2 = wd.findElement(By.xpath("//h1/parent::*"));

        //ancestor

        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[1]"));//one option

        //ancestor-or-self

        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling

        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling

        WebElement el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::h1"));
        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::h1"));

    }

    @Test
    public void classwork2(){

        WebElement button = wd.findElement(By.cssSelector("[name='login']"));
        String text = button.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.tagName("form"));
        String text1 = form.getText();
        System.out.println(text1);

        WebElement html = wd.findElement(By.cssSelector("html"));
         String text2 = html.getText();
        System.out.println(text2);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br--->"+ br.getText());

        }

        }








