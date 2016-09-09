package H04;

/**
 * Created by Ummah on 9-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk403 extends Applet{

    public void init(){
    }
    public void paint(Graphics g){
        g.drawRect(50,49,105,76);
        g.fillRect(50,50,5,200);
        g.setColor(Color.red);
        g.fillRect(55,50,100,25);
        g.setColor(Color.white);
        g.fillRect(55,75,100,25);
        g.setColor(Color.blue);
        g.fillRect(55,100,100,25);
    }
}
