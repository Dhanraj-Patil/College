import java.awt.*;
import javax.swing.*;
public class Fat {
    public static void main(String [] args){
        JFrame f=new JFrame();
        f.setSize(500,500);
        JButton jbutton=new JButton("JButton");
        jbutton.setBounds(200,50,100,40);
        JCheckBox jcheckBox=new JCheckBox("JCheckBox");
        jcheckBox.setBounds(200,150,100,40);
        JLabel jlabel=new JLabel("JLabel implemented");
        jlabel.setBounds(190,250,120,40);
        JTextArea jtext=new JTextArea();
        jtext.setBounds(200,350,100,40);

        f.add(jtext);
        f.add(jlabel);
        f.add(jcheckBox);
        f.add(jbutton);
        f.setLayout(null);
        f.setVisible(true);
    }
}
