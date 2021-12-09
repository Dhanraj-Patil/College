import javax.swing.*;
import java.awt.event.*;
import java.util.Locale;

//DHANRAJ PATIL 20MIS0447
//DHANRAJ PATIL 20MIS0447
//DHANRAJ PATIL 20MIS0447

public class LABFAT implements ActionListener {
    JButton button;
    JLabel label;
    JTextArea text;
    String s;
    int value=0;
    LABFAT(){
        JFrame frame=new JFrame();
        frame.setSize(500,500);
        button=new JButton("JButton");
        button.setBounds(200,50,100,40);
        JCheckBox checkBox=new JCheckBox("UpperCase");
        checkBox.setBounds(200,150,100,40);
        label=new JLabel("JLabel implemented");
        label.setBounds(190,250,120,40);
        text=new JTextArea();
        text.setBounds(200,350,100,40);


        button.addActionListener(this);
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1) {
                    value = 1;
                }else{
                    value=0;
                }
            }
        });


        frame.add(text);
        frame.add(label);
        frame.add(checkBox);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        s=text.getText();
        if(value==1){
            s=s.toUpperCase(Locale.ROOT);
        }
        label.setText(s);
        label.setHorizontalAlignment(JLabel.CENTER);
    }
    public static void main(String [] args){
        new LABFAT();
    }
}
