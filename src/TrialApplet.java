import java.applet.*;
import java.awt.*;

/*
<applet code="TrialApplet" width=300 height=200>
</applet>
*/

class TrialApplet extends Applet{
    String msg;
    public void init(){
        setBackground(Color.green);
        setForeground(Color.red);
        msg="Hi";
    }
    public void start(){
        msg=msg+" Dhanraj";
    }
    public void paint(Graphics g){
        g.drawString(msg,20,20);
    }
}