package H04;

/**
 * Created by Ummah on 9-9-2016.
 */

import java.awt.*;
import java.applet.*;


public class OpdrachtHoofdstuk402 extends Applet {

    public void init(){
    }

    public void paint(Graphics g){
        g.drawLine(20,100,100,20);
        g.drawLine(100,20,180,100);
        g.drawLine(20,100,180,100);
        g.drawRect(20,100,160,160);
        g.drawRect(40,140,40,40);
        g.drawRect(40,140,17,17);
        g.drawRect(63,140,17,17);
        g.drawRect(40,163,17,17);
        g.drawRect(63,163,17,17);
        g.drawRect(130,200,35,60);
    }
}
