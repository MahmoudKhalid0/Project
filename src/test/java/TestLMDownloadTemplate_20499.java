import org.example.LMDownloadTemplate_20499;
import org.example.MainClass;
import org.testng.annotations.Test;

public class TestLMDownloadTemplate_20499 extends MainClass {


    public static class _Point1 {
        @Test(priority = 1)
        public void LookupManagementScreenDisplay () {
            var LMSD = new LMDownloadTemplate_20499 ();
            LMSD.HrLogin ();
            LMSD.LookupManagementScreenDisplay ();
        }
    }

    public static class _Point2 {
        @Test(priority = 2)
        public void LookupScreenAsGridWithColumns () {
            var LSAGWC = new LMDownloadTemplate_20499 ();
            LSAGWC.LookupScreenAsGridWithColumns ();
        }
    }

    public static class _Point3 {
        @Test(priority = 3)
        public void TemplateDownload () throws InterruptedException {
            var TD = new LMDownloadTemplate_20499 ();
            TD.TemplateDownload ();
        }
    }
}
