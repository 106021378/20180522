import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame{
    private int dirflag=1,odjx=50,odjy=50,odjw=50,odjh=50;
    private Container cp;
    private JButton jbtn1=new JButton("Run");
    private JButton jbtn2=new JButton("↑");
    private JButton jbtn3=new JButton("↓");
    private JButton jbtn4=new JButton("←");
    private JButton jbtn5=new JButton("→");
    private JButton jbtn6=new JButton("Exit");
    private JLabel jlb=new JLabel();
    private ImageIcon icon=new ImageIcon("1.jpg");
    private JPanel jpnc = new JPanel(new GridLayout());
    private JPanel jpns = new JPanel(new GridLayout(1,6,3,3));
    private Timer t1;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocation(100,50);
        this.setSize(800,600);
        cp = this.getContentPane();
        cp.add(jpnc,BorderLayout.CENTER);
        cp.add(jpns,BorderLayout.SOUTH);
        jlb.setIcon(icon);
             jpnc.add(jlb);
             jpns.add(jbtn1);
             jpns.add(jbtn2);
             jpns.add(jbtn3);
             jpns.add(jbtn4);
             jpns.add(jbtn5);
        t1 = new Timer(200, new AbstractAction() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     switch (dirflag){
                         case 1:
                             if(odjy-2>0){
                                 odjy-=2;
                             }
                             break;
                         case 2:
                             if (odjy<600-odjh){
                                 odjy+=2;
                             }
                             break;
                     }
                     jlb.setLocation(odjx,odjy);
                 }
             });
             jbtn6.addActionListener(new AbstractAction() {
                 @Override
                 public void actionPerformed(ActionEvent actionEvent) {
                     System.exit(0);
                 }
             });
    }
}
