import org.example.LogOut;
import org.example.LoginClass;
import org.example.MainClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsers extends MainClass {
    @DataProvider(name = "Users")
    public static String[][] Users () {
        return new String[][]{
                {"mkhaled", "P@ssw0rd"},
                {"DH", "P@ssw0rd"},
                {"EM", "P@ssw0rd"},
                {"BP", "P@ssw0rd"},
                {"IC", "P@ssw0rd"},
                {"ML", "P@ssw0rd"},
                {"WF", "P@ssw0rd"},
                {"HR", "P@ssw0rd"},
                {"Head", "P@ssw0rd"}
        };
    }

    @Test(dataProvider = "Users")
    public void Test (String UserName, String PassWord) throws InterruptedException {

        var L = new LoginClass ();
        L.Login (UserName, PassWord);

        switch (UserName) {
            case "mkhaled", "DH", "EM", "BP", "IC", "ML", "WF", "HR", "Head" -> {
                var LO = new LogOut ();
                LO.CLogOut ();
            }
        }
    }
}
