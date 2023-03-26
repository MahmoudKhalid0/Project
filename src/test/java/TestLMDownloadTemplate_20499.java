import org.example.LMDownloadTemplate_20499;
import org.example.MainClass;
import org.testng.annotations.Test;

public class TestLMDownloadTemplate_20499 extends MainClass {


        @Test(priority = 1)
        public void LookupManagementScreenDisplay () {
            var LMSD = new LMDownloadTemplate_20499 ();
            LMSD.HrLogin ();
            LMSD.LookupManagementScreenDisplay ();
        }


        @Test(priority = 2)
        public void LookupScreenAsGridWithColumns () {
            var LSAGWC = new LMDownloadTemplate_20499 ();
            LSAGWC.LookupScreenAsGridWithColumns ();
        }


        @Test(priority = 3)
        public void TemplateDownload () {
            var TD = new LMDownloadTemplate_20499 ();
            TD.TemplateDownload ();
        }
        //jhjhjhjhjhhj
}
