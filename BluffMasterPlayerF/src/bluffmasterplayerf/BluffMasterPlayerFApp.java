package bluffmasterplayerf;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
/**
 * The main class of the application.
 */
public class BluffMasterPlayerFApp extends SingleFrameApplication 
{
    @Override protected void startup() {
        show(new BluffMasterPlayerFView(this));
    }
    @Override protected void configureWindow(java.awt.Window root) {
    }
    public static BluffMasterPlayerFApp getApplication() {
        return Application.getInstance(BluffMasterPlayerFApp.class);
    }
    public static void main(String[] args) {
        launch(BluffMasterPlayerFApp.class, args);
    }
}
