import org.example.AddNewEvent;
import org.example.MainClass;
import org.testng.annotations.Test;

public class TestAddEvent extends MainClass {

    @Test
    public void TestAddEvent(){
        AddNewEvent TAE = new AddNewEvent ();
        TAE.Login ();
        TAE.add_event ();
    }
}
