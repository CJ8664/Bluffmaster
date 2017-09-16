package bluffmasterplayerf;
import org.jdesktop.application.Action;
public class BluffMasterPlayerFAboutBox extends javax.swing.JDialog 
{
    public BluffMasterPlayerFAboutBox(java.awt.Frame parent) {
        super(parent);
        initComponents();
        getRootPane().setDefaultButton(closeButton);
    }
    @Action public void closeAboutBox() {
        dispose();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
        javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
        javax.swing.JLabel imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(bluffmasterplayerf.BluffMasterPlayerFApp.class).getContext().getResourceMap(BluffMasterPlayerFAboutBox.class);
        setTitle(resourceMap.getString("title")); // NOI18N
        setFocusable(false);
        setFocusableWindowState(false);
        setModal(true);
        setName("aboutBox"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(bluffmasterplayerf.BluffMasterPlayerFApp.class).getContext().getActionMap(BluffMasterPlayerFAboutBox.class, this);
        closeButton.setAction(actionMap.get("quit")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 120));

        appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+4));
        appTitleLabel.setText(resourceMap.getString("Application.title")); // NOI18N
        appTitleLabel.setName("appTitleLabel"); // NOI18N
        getContentPane().add(appTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setText(resourceMap.getString("versionLabel.text")); // NOI18N
        versionLabel.setName("versionLabel"); // NOI18N
        getContentPane().add(versionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        appVersionLabel.setText(resourceMap.getString("Application.version")); // NOI18N
        appVersionLabel.setName("appVersionLabel"); // NOI18N
        getContentPane().add(appVersionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
        vendorLabel.setText(resourceMap.getString("vendorLabel.text")); // NOI18N
        vendorLabel.setName("vendorLabel"); // NOI18N
        getContentPane().add(vendorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        appVendorLabel.setText(resourceMap.getString("Application.vendor")); // NOI18N
        appVendorLabel.setName("appVendorLabel"); // NOI18N
        getContentPane().add(appVendorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel.setText(resourceMap.getString("homepageLabel.text")); // NOI18N
        homepageLabel.setName("homepageLabel"); // NOI18N
        getContentPane().add(homepageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        appHomepageLabel.setText(resourceMap.getString("Application.homepage")); // NOI18N
        appHomepageLabel.setName("appHomepageLabel"); // NOI18N
        getContentPane().add(appHomepageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, 20));

        appDescLabel.setText(resourceMap.getString("appDescLabel.text")); // NOI18N
        appDescLabel.setName("appDescLabel"); // NOI18N
        getContentPane().add(appDescLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 339, -1));

        imageLabel.setIcon(resourceMap.getIcon("imageLabel.icon")); // NOI18N
        imageLabel.setName("imageLabel"); // NOI18N
        getContentPane().add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    // End of variables declaration//GEN-END:variables
}
