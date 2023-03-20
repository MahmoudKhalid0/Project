import org.example.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginUsersFromExcel extends MainClass {

    @DataProvider(name = "Users")
    public Object[][] testData () throws Exception {
        return UsersFromExcel.getExcelData ();
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