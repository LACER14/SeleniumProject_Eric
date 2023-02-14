import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_iFrame {
    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();         /* remplace la ligne précédente  */
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        // frame 1
//        driver.switchTo().frame("packageListFrame");                          /*  on a basculé vers le iFrame  */
//        driver.switchTo().frame(2);                                           /*  2e méthode                   */
        WebElement MyFrame= driver.findElement(By.name("packageListFrame"));    /*  3e méthode                   */
        driver.switchTo().frame(MyFrame);                                       /*  3e méthode (suite)           */
        Thread.sleep(4000);
        driver.findElement(By.linkText("org.openqa.selenium")).click();


        // frame 2
//        Si imbriqué : il faut revenir au iFrame parent
//        driver.switchTo().parentFrame();

//        Ici, ils sont au même niveau (frères)    (c'est le body)
        driver.switchTo().defaultContent();

        WebElement MyFrame2= driver.findElement(By.name("packageFrame"));
        driver.switchTo().frame(MyFrame2);
        Thread.sleep(4000);
        driver.findElement(By.linkText("WebDriver")).click();

        // frame 3
        driver.switchTo().defaultContent();
        WebElement MyFrame3= driver.findElement(By.name("classFrame"));
        driver.switchTo().frame(MyFrame3);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[text()='Help']")).click();

        Thread.sleep(4000);
        driver.close();


    }
}
