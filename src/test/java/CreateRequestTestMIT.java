import org.example.*;
import org.testng.annotations.Test;

public class CreateRequestTestMIT extends MainClass {

    @Test
    public void TestCreateNewRequest() throws InterruptedException {

        var L = new LoginClass();
        L.Login("mkhaled", "P@ssw0rd");

        var CMI = new HomePageClass();
        CMI.ClickMyInbox();

        var ClickNewRequest = new MyInboxClass();
        ClickNewRequest.CreateNewRequest();

        var CNR = new CreateRequestClassMIT();
        CNR.ServiceInfoPage();
        CNR.StatementListPage();
        CNR.RequesterInfoPage();
        CNR.RequestInfoPage();
        CNR.AttachmentsPage();
        CNR.SummaryPage();

    }

}
