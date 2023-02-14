import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gerer_iFrame {

    public static void main(String[] args) throws InterruptedException {
//        System.out.println("Hello world");
//        Test T1=new Test();
//        T1.add(5,10);
            System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.canadiantire.ca/fr.html");
            Thread.sleep(4000);
            driver.close();


    }
}
