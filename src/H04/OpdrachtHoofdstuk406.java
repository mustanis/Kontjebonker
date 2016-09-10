package H04;

/**
 * Created by Ummah on 10-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk406 extends Applet{

    public void init(){}

    public void paint(Graphics g){
        g.fillRect(20,20,60,170);
        g.setColor(Color.red);
        g.fillArc(25,25,50,50,0,360);
        g.setColor(Color.orange);
        g.fillArc(25,80,50,50,0,360);
        g.setColor(Color.green);
        g.fillArc(25,135,50,50,0,360);
    }
}
