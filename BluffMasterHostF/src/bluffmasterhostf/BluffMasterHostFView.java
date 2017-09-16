package bluffmasterhostf;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.JDialog;
import javax.swing.JFrame;
public class BluffMasterHostFView extends FrameView 
{
    public BluffMasterHostFView(SingleFrameApplication app)throws IOException {
        super(app);
        initComponents();
        ResourceMap resourceMap = getResourceMap();
        int messageTimeout = resourceMap.getInteger("StatusBar.messageTimeout");
        messageTimer = new Timer(messageTimeout, new ActionListener() {
            public void actionPerformed(ActionEvent e) {}});
        messageTimer.setRepeats(false);
    }
    @Action
    public void showAboutBox() {
        if (aboutBox == null) {
            JFrame mainFrame = BluffMasterHostFApp.getApplication().getMainFrame();
            aboutBox = new BluffMasterHostFAboutBox(mainFrame);
            aboutBox.setLocationRelativeTo(mainFrame);
        }
        BluffMasterHostFApp.getApplication().show(aboutBox);
    }
    @Action
    public void startgame()
    {
        jTextArea1.setText(question[n[i]-1]);
        an=answer[n[i]-1].split("@@");
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
        String code=jTextField1.getText();
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
        jTextField1.setVisible(false);
        jButton23.setVisible(false);
    }
    @Action
    public void show10() {
        jTable1.setValueAt(an[0], 0, 1);
    }
    @Action
    public void show9() {
        jTable1.setValueAt(an[1], 1, 1);
    }
    @Action
    public void show8() {
        jTable1.setValueAt(an[2], 2, 1);
    }
    @Action
    public void show7() {
        jTable1.setValueAt(an[3], 3, 1);
    }
    @Action
    public void show6() {
        jTable1.setValueAt(an[4], 4, 1);
    }
    @Action
    public void show5() {
        jTable1.setValueAt(an[5], 5, 1);
    }
    @Action
    public void show4() {
        jTable1.setValueAt(an[6], 6, 1);
    }
    @Action
    public void show3() {
        jTable1.setValueAt(an[7], 7, 1);
    }
    @Action
    public void show2() {
        jTable1.setValueAt(an[8], 8, 1);
    }
    @Action
    public void show1() {
        jTable1.setValueAt(an[9], 9, 1);
    }
    @Action
    public void up1() {
     x= jTable1.getSelectedRow();
     amount=jTable1.getValueAt(x, 2)+"";
     if(amount!=null)
     {
         int a =Integer.parseInt(amount);
         int pr=Integer.parseInt(jLabel5.getText());
         if(add)
         {
             int sum=a+pr;
             jLabel5.setText(sum+"");
         }
         if(sub)
         {
             int sum=pr-pr/2;
             jLabel5.setText(sum+"");
         }
     }
    }
    @Action
    public void up2() {
     x= jTable1.getSelectedRow();
     amount=jTable1.getValueAt(x, 2)+"";
     if(amount!=null)
     {
         int a =Integer.parseInt(amount);
         int pr=Integer.parseInt(jLabel6.getText());
         if(add)
         {
             int sum=a+pr;
             jLabel6.setText(sum+"");
         }
         if(sub)
         {
             int sum=pr-pr/2;
             jLabel6.setText(sum+"");
         }
     }
    }
    @Action
    public void up3() {
     x= jTable1.getSelectedRow();
     amount=jTable1.getValueAt(x, 2)+"";
     if(amount!=null)
     {
         int a =Integer.parseInt(amount);
         int pr=Integer.parseInt(jLabel7.getText());
         if(add)
         {
             int sum=a+pr;
             jLabel7.setText(sum+"");
         }
         if(sub)
         {
             int sum=pr-pr/2;
             jLabel7.setText(sum+"");
         }
     }
    }
    @Action
    public void up4() {
     x= jTable1.getSelectedRow();
     amount=jTable1.getValueAt(x, 2)+"";
     if(amount!=null)
     {
         int a =Integer.parseInt(amount);
         int pr=Integer.parseInt(jLabel8.getText());
         if(add)
         {
             int sum=a+pr;
             jLabel8.setText(sum+"");
         }
         if(sub)
         {
             int sum=pr-pr/2;
             jLabel8.setText(sum+"");
         }
     }
    }
    @Action
    public void up5() {
     x= jTable1.getSelectedRow();
     amount=jTable1.getValueAt(x, 2)+"";
     if(amount!=null)
     {
         int a =Integer.parseInt(amount);
         int pr=Integer.parseInt(jLabel9.getText());
         if(add)
         {
             int sum=a+pr;
             jLabel9.setText(sum+"");
         }
         if(sub)
         {
             int sum=pr-pr/2;
             jLabel9.setText(sum+"");
         }
     }
    }
    @Action
    public void up6() {
     x= jTable1.getSelectedRow();
     amount=jTable1.getValueAt(x, 2)+"";
     if(amount!=null)
     {
         int a =Integer.parseInt(amount);
         int pr=Integer.parseInt(jLabel10.getText());
         if(add)
         {
             int sum=a+pr;
             jLabel10.setText(sum+"");
         }
         if(sub)
         {
             int sum=pr-pr/2;
             jLabel10.setText(sum+"");
         }
     }
    }
    @Action
    public void cadd() {
        add=true;
        sub=false;
        ded=true;
    }
    @Action
    public void csub() {
        if(ded)
        {
        sub=true;
        add=false;
        up1();
        up2();
        up3();
        up4();
        up5();
        up6();
        }
        if(jLabel5.getText().equals("1"))
        {
            jTextField2.setVisible(false);
            jButton17.setVisible(false);
            jLabel5.setVisible(false);
        }
        if(jLabel6.getText().equals("1"))
        {
            jTextField3.setVisible(false);
            jButton18.setVisible(false);
            jLabel6.setVisible(false);
        }
        if(jLabel7.getText().equals("1"))
        {
            jTextField4.setVisible(false);
            jButton19.setVisible(false);
            jLabel7.setVisible(false);
        }
        if(jLabel8.getText().equals("1"))
        {
            jTextField5.setVisible(false);
            jButton20.setVisible(false);
            jLabel8.setVisible(false);
        }
        if(jLabel9.getText().equals("1"))
        {
            jTextField6.setVisible(false);
            jButton21.setVisible(false);
            jLabel9.setVisible(false);
        }
        if(jLabel10.getText().equals("1"))
        {
            jTextField7.setVisible(false);
            jButton22.setVisible(false);
            jLabel10.setVisible(false);
        }
    }
    @Action
    public void next() 
    {
        clcknext--;
        if(clcknext>=1)
        {
        for(int j=0;j<10;j++)
        jTable1.setValueAt("",j,1);
        i+=1;
        jTextArea1.setText(question[n[i]-1]);
        an=answer[n[i]-1].split("@@");
        /*jTextArea1.setText(statements[i]);
        ans=statements[i+1];
        an=ans.split("@@");*/
        }
        else
          showAboutBox();
    }
    @Action
    public void removeplayer() {
        bluff=jCheckBox1.isSelected();
        String p=jComboBox1.getSelectedItem().toString();
        String r[]=p.split(" ");
        int no=Integer.parseInt(r[1]);
        switch(no)
        {
            case 1:
            {
                jTextField2.setVisible(false);
                jButton17.setVisible(false);
                jLabel5.setVisible(false);
                if(bluff)
                {
                    int a=Integer.parseInt(jLabel5.getText())/6;
                    jLabel6.setText((Integer.parseInt(jLabel6.getText())+a)+"");
                    jLabel7.setText((Integer.parseInt(jLabel7.getText())+a)+"");
                    jLabel8.setText((Integer.parseInt(jLabel8.getText())+a)+"");
                    jLabel9.setText((Integer.parseInt(jLabel9.getText())+a)+"");
                    jLabel10.setText((Integer.parseInt(jLabel10.getText())+a)+"");
                }
                break;
            }
            case 2:
            {
                jTextField3.setVisible(false);
                jButton18.setVisible(false);
                jLabel6.setVisible(false);
                if(bluff)
                {
                    int a=Integer.parseInt(jLabel6.getText())/6;
                    jLabel5.setText((Integer.parseInt(jLabel5.getText())+a)+"");
                    jLabel7.setText((Integer.parseInt(jLabel7.getText())+a)+"");
                    jLabel8.setText((Integer.parseInt(jLabel8.getText())+a)+"");
                    jLabel9.setText((Integer.parseInt(jLabel9.getText())+a)+"");
                    jLabel10.setText((Integer.parseInt(jLabel10.getText())+a)+"");
                }
                break;
            }
            case 3:
            {
                jTextField4.setVisible(false);
                jButton19.setVisible(false);
                jLabel7.setVisible(false);
                if(bluff)
                {
                    int a=Integer.parseInt(jLabel7.getText())/6;
                    jLabel6.setText((Integer.parseInt(jLabel6.getText())+a)+"");
                    jLabel5.setText((Integer.parseInt(jLabel5.getText())+a)+"");
                    jLabel8.setText((Integer.parseInt(jLabel8.getText())+a)+"");
                    jLabel9.setText((Integer.parseInt(jLabel9.getText())+a)+"");
                    jLabel10.setText((Integer.parseInt(jLabel10.getText())+a)+"");
                }
                break;
            }
            case 4:
            {
                jTextField5.setVisible(false);
                jButton20.setVisible(false);
                jLabel8.setVisible(false);
                if(bluff)
                {
                    int a=Integer.parseInt(jLabel8.getText())/6;
                    jLabel6.setText((Integer.parseInt(jLabel6.getText())+a)+"");
                    jLabel7.setText((Integer.parseInt(jLabel7.getText())+a)+"");
                    jLabel5.setText((Integer.parseInt(jLabel5.getText())+a)+"");
                    jLabel9.setText((Integer.parseInt(jLabel9.getText())+a)+"");
                    jLabel10.setText((Integer.parseInt(jLabel10.getText())+a)+"");
                }
                break;
            }
            case 5:
            {
                jTextField6.setVisible(false);
                jButton21.setVisible(false);
                jLabel9.setVisible(false);
                if(bluff)
                {
                    int a=Integer.parseInt(jLabel9.getText())/6;
                    jLabel6.setText((Integer.parseInt(jLabel6.getText())+a)+"");
                    jLabel7.setText((Integer.parseInt(jLabel7.getText())+a)+"");
                    jLabel8.setText((Integer.parseInt(jLabel8.getText())+a)+"");
                    jLabel5.setText((Integer.parseInt(jLabel5.getText())+a)+"");
                    jLabel10.setText((Integer.parseInt(jLabel10.getText())+a)+"");
                }
                break;
            }
            case 6:
            {
                jTextField7.setVisible(false);
                jButton22.setVisible(false);
                jLabel10.setVisible(false);
                if(bluff)
                {
                    int a=Integer.parseInt(jLabel10.getText())/6;
                    jLabel6.setText((Integer.parseInt(jLabel6.getText())+a)+"");
                    jLabel7.setText((Integer.parseInt(jLabel7.getText())+a)+"");
                    jLabel8.setText((Integer.parseInt(jLabel8.getText())+a)+"");
                    jLabel9.setText((Integer.parseInt(jLabel9.getText())+a)+"");
                    jLabel5.setText((Integer.parseInt(jLabel5.getText())+a)+"");
                }
                break;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton22 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setName("jSeparator1"); // NOI18N
        mainPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 172, 780, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setName("jSeparator2"); // NOI18N
        mainPanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 10, 410));

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(bluffmasterhostf.BluffMasterHostFApp.class).getContext().getActionMap(BluffMasterHostFView.class, this);
        jButton10.setAction(actionMap.get("show10")); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(bluffmasterhostf.BluffMasterHostFApp.class).getContext().getResourceMap(BluffMasterHostFView.class);
        jButton10.setIcon(resourceMap.getIcon("jButton10.icon")); // NOI18N
        jButton10.setText(resourceMap.getString("jButton10.text")); // NOI18N
        jButton10.setName("jButton10"); // NOI18N
        mainPanel.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 40, 30));

        jButton9.setAction(actionMap.get("show9")); // NOI18N
        jButton9.setIcon(resourceMap.getIcon("jButton9.icon")); // NOI18N
        jButton9.setText(resourceMap.getString("jButton9.text")); // NOI18N
        jButton9.setName("jButton9"); // NOI18N
        mainPanel.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 40, 30));

        jButton8.setAction(actionMap.get("show8")); // NOI18N
        jButton8.setIcon(resourceMap.getIcon("jButton8.icon")); // NOI18N
        jButton8.setText(resourceMap.getString("jButton8.text")); // NOI18N
        jButton8.setName("jButton8"); // NOI18N
        mainPanel.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 40, 30));

        jButton7.setAction(actionMap.get("show7")); // NOI18N
        jButton7.setIcon(resourceMap.getIcon("jButton7.icon")); // NOI18N
        jButton7.setText(resourceMap.getString("jButton7.text")); // NOI18N
        jButton7.setName("jButton7"); // NOI18N
        mainPanel.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 40, 30));

        jButton6.setAction(actionMap.get("show6")); // NOI18N
        jButton6.setIcon(resourceMap.getIcon("jButton6.icon")); // NOI18N
        jButton6.setText(resourceMap.getString("jButton6.text")); // NOI18N
        jButton6.setName("jButton6"); // NOI18N
        mainPanel.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 40, 30));

        jButton5.setAction(actionMap.get("show5")); // NOI18N
        jButton5.setIcon(resourceMap.getIcon("jButton5.icon")); // NOI18N
        jButton5.setText(resourceMap.getString("jButton5.text")); // NOI18N
        jButton5.setName("jButton5"); // NOI18N
        mainPanel.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 40, 30));

        jButton3.setAction(actionMap.get("show3")); // NOI18N
        jButton3.setIcon(resourceMap.getIcon("jButton3.icon")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N
        mainPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 40, 30));

        jButton4.setAction(actionMap.get("show4")); // NOI18N
        jButton4.setIcon(resourceMap.getIcon("jButton4.icon")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N
        mainPanel.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 40, 30));

        jButton2.setAction(actionMap.get("show2")); // NOI18N
        jButton2.setIcon(resourceMap.getIcon("jButton2.icon")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        mainPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 40, 30));

        jButton1.setAction(actionMap.get("show1")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N
        mainPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 40, 30));

        jButton11.setAction(actionMap.get("cadd")); // NOI18N
        jButton11.setFont(resourceMap.getFont("jButton11.font")); // NOI18N
        jButton11.setIcon(resourceMap.getIcon("jButton11.icon")); // NOI18N
        jButton11.setText(resourceMap.getString("jButton11.text")); // NOI18N
        jButton11.setName("jButton11"); // NOI18N
        mainPanel.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 140, 40));

        jButton12.setAction(actionMap.get("csub")); // NOI18N
        jButton12.setFont(resourceMap.getFont("jButton12.font")); // NOI18N
        jButton12.setIcon(resourceMap.getIcon("jButton12.icon")); // NOI18N
        jButton12.setText(resourceMap.getString("jButton12.text")); // NOI18N
        jButton12.setName("jButton12"); // NOI18N
        mainPanel.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, 140, 40));

        jButton13.setAction(actionMap.get("startgame")); // NOI18N
        jButton13.setIcon(resourceMap.getIcon("jButton13.icon")); // NOI18N
        jButton13.setText(resourceMap.getString("jButton13.text")); // NOI18N
        jButton13.setName("jButton13"); // NOI18N
        mainPanel.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 90, 30));

        jButton14.setAction(actionMap.get("next")); // NOI18N
        jButton14.setIcon(resourceMap.getIcon("jButton14.icon")); // NOI18N
        jButton14.setText(resourceMap.getString("jButton14.text")); // NOI18N
        jButton14.setName("jButton14"); // NOI18N
        mainPanel.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 90, 30));

        jButton15.setAction(actionMap.get("showAboutBox")); // NOI18N
        jButton15.setIcon(resourceMap.getIcon("jButton15.icon")); // NOI18N
        jButton15.setText(resourceMap.getString("jButton15.text")); // NOI18N
        jButton15.setName("jButton15"); // NOI18N
        mainPanel.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 90, 30));

        jTextField2.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jTextField2.setName("jTextField2"); // NOI18N
        mainPanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 140, 30));

        jTextField3.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jTextField3.setText(resourceMap.getString("jTextField3.text")); // NOI18N
        jTextField3.setName("jTextField3"); // NOI18N
        mainPanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 140, 30));

        jTextField4.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setName("jTextField4"); // NOI18N
        mainPanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 140, 30));

        jTextField5.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jTextField5.setText(resourceMap.getString("jTextField5.text")); // NOI18N
        jTextField5.setName("jTextField5"); // NOI18N
        mainPanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 140, 30));

        jTextField6.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jTextField6.setText(resourceMap.getString("jTextField6.text")); // NOI18N
        jTextField6.setName("jTextField6"); // NOI18N
        mainPanel.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 140, 30));

        jTextField7.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jTextField7.setText(resourceMap.getString("jTextField7.text")); // NOI18N
        jTextField7.setName("jTextField7"); // NOI18N
        mainPanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 140, 30));

        jLabel5.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        mainPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 110, 30));

        jLabel6.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N
        mainPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 110, 30));

        jLabel7.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jLabel7.setText(resourceMap.getString("jLabel7.text")); // NOI18N
        jLabel7.setName("jLabel7"); // NOI18N
        mainPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 110, 30));

        jLabel8.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jLabel8.setText(resourceMap.getString("jLabel8.text")); // NOI18N
        jLabel8.setName("jLabel8"); // NOI18N
        mainPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 110, 30));

        jLabel9.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jLabel9.setText(resourceMap.getString("jLabel9.text")); // NOI18N
        jLabel9.setName("jLabel9"); // NOI18N
        mainPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 110, 30));

        jLabel10.setFont(resourceMap.getFont("jTextField2.font")); // NOI18N
        jLabel10.setText(resourceMap.getString("jLabel10.text")); // NOI18N
        jLabel10.setName("jLabel10"); // NOI18N
        mainPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 110, 30));

        jComboBox1.setFont(resourceMap.getFont("jComboBox1.font")); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PLAYER 1", "PLAYER 2", "PLAYER 3", "PLAYER 4", "PLAYER 5", "PLAYER 6" }));
        jComboBox1.setBorder(null);
        jComboBox1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jComboBox1.setName("jComboBox1"); // NOI18N
        mainPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 470, 100, 20));

        jCheckBox1.setFont(resourceMap.getFont("jCheckBox1.font")); // NOI18N
        jCheckBox1.setText(resourceMap.getString("jCheckBox1.text")); // NOI18N
        jCheckBox1.setBorder(null);
        jCheckBox1.setName("jCheckBox1"); // NOI18N
        mainPanel.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 470, 110, 20));

        jButton22.setAction(actionMap.get("up6")); // NOI18N
        jButton22.setIcon(resourceMap.getIcon("jButton22.icon")); // NOI18N
        jButton22.setText(resourceMap.getString("jButton22.text")); // NOI18N
        jButton22.setName("jButton22"); // NOI18N
        mainPanel.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 550, 40, 40));

        jButton20.setAction(actionMap.get("up4")); // NOI18N
        jButton20.setIcon(resourceMap.getIcon("jButton20.icon")); // NOI18N
        jButton20.setText(resourceMap.getString("jButton20.text")); // NOI18N
        jButton20.setName("jButton20"); // NOI18N
        mainPanel.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 40, 40));

        jButton16.setAction(actionMap.get("removeplayer")); // NOI18N
        jButton16.setFont(resourceMap.getFont("jButton16.font")); // NOI18N
        jButton16.setIcon(resourceMap.getIcon("jButton16.icon")); // NOI18N
        jButton16.setText(resourceMap.getString("jButton16.text")); // NOI18N
        jButton16.setBorder(null);
        jButton16.setName("jButton16"); // NOI18N
        mainPanel.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 80, 20));

        jButton17.setAction(actionMap.get("up1")); // NOI18N
        jButton17.setIcon(resourceMap.getIcon("jButton17.icon")); // NOI18N
        jButton17.setText(resourceMap.getString("")); // NOI18N
        jButton17.setName("jButton17"); // NOI18N
        mainPanel.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 40, 40));

        jButton18.setAction(actionMap.get("up2")); // NOI18N
        jButton18.setIcon(resourceMap.getIcon("jButton18.icon")); // NOI18N
        jButton18.setText(resourceMap.getString("jButton18.text")); // NOI18N
        jButton18.setName("jButton18"); // NOI18N
        mainPanel.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 550, 40, 40));

        jButton19.setAction(actionMap.get("up3")); // NOI18N
        jButton19.setIcon(resourceMap.getIcon("jButton19.icon")); // NOI18N
        jButton19.setText(resourceMap.getString("jButton19.text")); // NOI18N
        jButton19.setName("jButton19"); // NOI18N
        mainPanel.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 40, 40));

        jButton21.setAction(actionMap.get("up5")); // NOI18N
        jButton21.setIcon(resourceMap.getIcon("jButton21.icon")); // NOI18N
        jButton21.setText(resourceMap.getString("jButton21.text")); // NOI18N
        jButton21.setName("jButton21"); // NOI18N
        mainPanel.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, 40, 40));

        jButton23.setAction(actionMap.get("load")); // NOI18N
        jButton23.setFont(resourceMap.getFont("jButton23.font")); // NOI18N
        jButton23.setText(resourceMap.getString("jButton23.text")); // NOI18N
        jButton23.setName("jButton23"); // NOI18N
        mainPanel.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 90, 20));

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        mainPanel.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 190, -1));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(resourceMap.getFont("jTextArea1.font")); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(4);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane2.setViewportView(jTextArea1);

        mainPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 450, 110));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setFont(resourceMap.getFont("jTable1.font")); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {new Integer(10), null, "100000"},
                {new Integer(9), null, "90000"},
                {new Integer(8), null, "80000"},
                {new Integer(7), null, "70000"},
                {new Integer(6), null, "60000"},
                {new Integer(5), null, "50000"},
                {new Integer(4), null, "40000"},
                {new Integer(3), null, "30000"},
                {new Integer(2), null, "20000"},
                {new Integer(1), null, "10000"}
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

        mainPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 200));

        jLabel1.setIcon(resourceMap.getIcon("jLabel1.icon")); // NOI18N
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        mainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        setComponent(mainPanel);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
    private final Timer messageTimer;
    private boolean first=true;
    private JDialog aboutBox;
    private boolean add=false;
    private boolean sub=false;
    private String amount;
    private String an[];
    private File f;
    private FileReader fr;
    private BufferedReader br;
    private String file=new String();
    private String ans;
    private String statements[];
    private int i=0;
    private int x;
    private boolean ded=false;
    private boolean bluff=false;
    private String question[];
    private String answer[];
    private int clcknext=6;
    private int n[];
}
