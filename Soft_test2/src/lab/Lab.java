package lab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//用于实验如何用webdriver打开浏览器
public class Lab {
    public static void main(String[] args) {
        //初始化一个chrome浏览器实例driver    
        WebDriver driver = new FirefoxDriver();            
        // get(url)打开一个网站    
        driver.get("https://www.baidu.com");    
        //getTitle()获取当前页面标题 
        System.out.println("当前打开页面的标题是： "+ driver.getTitle()); 
        //关闭并退出浏览器    
        driver.quit(); 
    }
}