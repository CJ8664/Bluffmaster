package bluffmasterhostf;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
public class BluffMasterHostFApp extends SingleFrameApplication 
{
    @Override protected void startup() {
        try {
            show(new BluffMasterHostFView(this));
        } catch (IOException ex) {
            Logger.getLogger(BluffMasterHostFApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override protected void configureWindow(java.awt.Window root) {
    }
    public static BluffMasterHostFApp getApplication() {
        return Application.getInstance(BluffMasterHostFApp.class);
    }
    public static void main(String[] args) {
        launch(BluffMasterHostFApp.class, args);
    }
}
