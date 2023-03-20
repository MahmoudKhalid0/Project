import org.example.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class ApprovedR extends MainClass {

    @DataProvider(name = "Users")
    public static Object[][] Users () {
        return new Object[][]{
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
            case "mkhaled" -> {
                var CMI = new HomePageClass ();
                CMI.ClickMyInbox ();

                var ClickNewRequest = new MyInboxClass ();
                ClickNewRequest.CreateNewRequest ();

                var CNR = new CreateRequestClassMIT ();
                CNR.ServiceInfoPage ();

                CNR.StatementListPage ();
                CNR.RequesterInfoPage ();
                CNR.RequestInfoPage ();
                CNR.AttachmentsPage ();
                CNR.SummaryPage ();

                var LO = new LogOut ();
                LO.CLogOut ();
            }
            case "DH", "EM", "BP", "IC", "ML", "WF", "HR", "Head" -> {
                var AR = new ApproveRequestClass ();
                AR.ApproveForReq ();

                var LO = new LogOut ();
                LO.CLogOut ();
            }
        }
    }
}