package day54;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutomatingWebDriver {
    public static void main(String[] args) {
        WebDriver w1 = new ChromeDriver();
        WebDriver w2 = new SafariDriver();
        WebDriver w3 = new FirefoxDriver();
        WebDriver w4 = new ChromeDriver();

        List<WebDriver> webList = new ArrayList<>(Arrays.asList(w1,w2,w3,w4));

        for(WebDriver each: webList){
            System.out.println(each.getClass().getSimpleName());
        }

     

    }


}
