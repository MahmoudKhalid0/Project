import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.example.MainClass.getDriver;

public class returnonlyNumbers {

    public void getOnlyNumbers (){

        WebElement element = getDriver().findElement(By.xpath ("//*[@id=\"ec-main\"]/article/div[2]/table/tbody/tr[1]/td[1]"));
        // Extract only the numbers using regex
        String text = element.getText();
        // Use regular expressions to extract only the numbers if the text contains numbers
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        matcher.find();
        int number = Integer.parseInt (matcher.group());

        System.out.println("Extracted number: " + number);


    }


    public void goToNewTap () {


        String originalWindowHandle = getDriver ().getWindowHandle();
        Set<String> windowHandles = getDriver ().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(originalWindowHandle)) {
                getDriver ().switchTo().window(windowHandle);
                break;
            }
        }
        WebElement elementInNewTab = getDriver ().findElement(By.id("elementId"));
        String text = elementInNewTab.getText();


    }


}
