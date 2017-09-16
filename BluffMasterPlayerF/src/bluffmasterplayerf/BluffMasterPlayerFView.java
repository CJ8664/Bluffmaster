package bluffmasterplayerf;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JDialog;
import javax.swing.JFrame;
import java.io.*;
public class BluffMasterPlayerFView extends FrameView 
{
    public BluffMasterPlayerFView(SingleFrameApplication app) {
        super(app);
        initComponents();
        jTable1.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel5.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        // status bar initialization - message timeout, idle icon and busy animation, etc
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        messageTimer.setRepeats(false);
    }
    @Action
    public void showAboutBox(){
        if (aboutBox == null) {
            JFrame mainFrame = BluffMasterPlayerFApp.getApplication().getMainFrame();
            aboutBox = new BluffMasterPlayerFAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        BluffMasterPlayerFApp.getApplication().show(aboutBox);
    }
    @Action
    public void startgame() throws Exception
    {
        jTextArea1.setText(question[n[i]-1]);
        answ=answer[n[i]-1].split("@@");
        for (int j = 0; j < 10; j++) 
            {
                jTable1.setValueAt(answ[j], j, 1);    
            }
    }
    @Action
    public void next() {
        clcknext--;
        if(clcknext>=1)
        {
        i+=1;
        jTextArea1.setText(question[n[i]-1]);
        answ=answer[n[i]-1].split("@@");
        for (int j = 0; j < 10; j++) 
            {
                jTable1.setValueAt(answ[j], j, 1);    
            }
        }
        else
          showAboutBox();
    }
    @Action
    public void playerpass(){
        if(jTextField1.getText().equals(mpass))
        {
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jButton6.setVisible(true);
        jButton7.setVisible(true);
        jLabel5.setVisible(false); 
        clear();
        }
        else if(jTextField1.getText().equals(opass))
        {
            jTable1.setVisible(true);
            jLabel5.setVisible(true);
            clear();
        }
    }
    @Action
    public void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }
    @Action
    public void maspass(){
       if( jTextField2.getText().equals("Oldpass"));
       {
            opass=jTextField3.getText();
            jTable1.setVisible(false);
            jLabel6.setVisible(false);
            jLabel7.setVisible(false);
            jLabel5.setVisible(false);
            jTextField2.setVisible(false);
            jTextField3.setVisible(false);
            jButton6.setVisible(false);
            jButton7.setVisible(false);
            jTextField1.setText("");
       }
    }
    @Action
    public void load()throws IOException
    {
        f=new File("D:\\abc\\QUESTION.txt");
        fr=new FileReader(f);
        br=new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
           {
               file=file+" "+s;
           }
        statements=file.split("##"); 
        first=false;
        String code=jTextField4.getText();
        String cd[]=code.split(",");
        n=new int[cd.length];
        for(int m=0;m<n.length;m++)
        {
            n[m]=Integer.parseInt(cd[m]);
        }
        question=new String[statements.length/2];
        answer=new String[statements.length/2];
        for(int m=0,p=0;m<statements.length/2;m++)
        {
            question[m]=statements[2*p];
            answer[m]=statements[2*p+1];
            p++;
        }
        jTextField4.setVisible(false);
        jButton8.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(bluffmasterplayerf.BluffMasterPlayerFApp.class).getContext().getResourceMap(BluffMasterPlayerFView.class);
        jLabel5.setFont(resourceMap.getFont("jLabel5.font")); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(resourceMap.getIcon("jLabel5.icon")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 390, 60));

        jLabel6.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel6.setIcon(resourceMap.getIcon("jLabel6.icon")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        mainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, 210, 30));

        jLabel7.setFont(resourceMap.getFont("jLabel8.font")); // NOI18N
        jLabel7.setIcon(resourceMap.getIcon("jLabel7.icon")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        mainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 210, 30));

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(bluffmasterplayerf.BluffMasterPlayerFApp.class).getContext().getActionMap(BluffMasterPlayerFView.class, this);
        jButton1.setAction(actionMap.get("startgame")); // NOI18N
        jButton1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 90, 30));

        jButton2.setAction(actionMap.get("next")); // NOI18N
        jButton2.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jButton2.setIcon(resourceMap.getIcon("jButton2.icon")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        mainPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 90, 30));

        jButton3.setAction(actionMap.get("showAboutBox")); // NOI18N
        jButton3.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jButton3.setIcon(resourceMap.getIcon("jButton3.icon")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        mainPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 90, 30));

        jButton4.setAction(actionMap.get("clear")); // NOI18N
        jButton4.setFont(resourceMap.getFont("jButton4.font")); // NOI18N
        jButton4.setIcon(resourceMap.getIcon("jButton4.icon")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        mainPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 150, 60));

        jButton5.setAction(actionMap.get("playerpass")); // NOI18N
        jButton5.setFont(resourceMap.getFont("jButton4.font")); // NOI18N
        jButton5.setIcon(resourceMap.getIcon("jButton5.icon")); // NOI18N
        jButton5.setText(resourceMap.getString("jButton5.text")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        mainPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 170, 60));

        jButton6.setAction(actionMap.get("maspass")); // NOI18N
        jButton6.setFont(resourceMap.getFont("jButton7.font")); // NOI18N
        jButton6.setIcon(resourceMap.getIcon("jButton6.icon")); // NOI18N
        jButton6.setText(resourceMap.getString("jButton6.text")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        mainPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 150, 40));

        jButton7.setAction(actionMap.get("clear")); // NOI18N
        jButton7.setFont(resourceMap.getFont("jButton7.font")); // NOI18N
        jButton7.setIcon(resourceMap.getIcon("jButton7.icon")); // NOI18N
        jButton7.setText(resourceMap.getString("jButton7.text")); // NOI18N
        jButton7.setName("jButton7"); // NOI18N
        mainPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 160, 40));

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        mainPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, 40));

        jTextField2.setText(resourceMap.getString("jTextField2.text")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        mainPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 160, 30));

        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        mainPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 160, 30));

        jSeparator1.setName("jSeparator1"); // NOI18N
        mainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 780, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setName("jSeparator2"); // NOI18N
        mainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 20, 140));

        jButton8.setAction(actionMap.get("load")); // NOI18N
        jButton8.setFont(resourceMap.getFont("jButton8.font")); // NOI18N
        jButton8.setText(resourceMap.getString("jButton8.text")); // NOI18N
        jButton8.setName("jButton8"); // NOI18N
        mainPanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 220, 30));

        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setName("jTextField4"); // NOI18N
        mainPanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 220, 30));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(resourceMap.getFont("jTextArea1.font")); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        mainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 330, 150));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setFont(resourceMap.getFont("jTable1.font")); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {new Integer(10), null, "$ 100000"},
                {new Integer(9), null, "$ 90000"},
                {new Integer(8), null, "$ 80000"},
                {new Integer(7), null, "$ 70000"},
                {new Integer(6), null, "$ 60000"},
                {new Integer(5), null, "$ 50000"},
                {new Integer(4), null, "$ 40000"},
                {new Integer(3), null, "$ 30000"},
                {new Integer(2), null, "$ 20000"},
                {new Integer(1), "", "$ 10000"}
            },
            new String [] {
                "SR.NO", "ANSWER", "AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setName("jTable1"); // NOI18N
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(50);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        jTable1.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("jTable1.columnModel.title0")); // NOI18N
        jTable1.getColumnModel().getColumn(1).setMaxWidth(500);
        jTable1.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("jTable1.columnModel.title1")); // NOI18N
        jTable1.getColumnModel().getColumn(2).setMaxWidth(200);
        jTable1.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("jTable1.columnModel.title2")); // NOI18N

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 740, 200));

        jLabel1.setFont(resourceMap.getFont("jLabel1.font")); // NOI18N
        jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setComponent(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
    private final Timer messageTimer;
    private String answ[];
    private File f;
    private FileReader fr;
    private BufferedReader br;
    private String file=new String();
    private String ans;
    private String statements[];
    private int i=0;
    private boolean first=true;
    private JDialog aboutBox;
    private String opass="OP";
    private String mpass="BLUFFRf";
    private int clcknext=6;
    private String question[];
    private String answer[];
    private int n[];
}
