package H04;

/**
 * Created by Ummah on 10-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk407 extends Applet {

    public void init() {
    }

    public void paint(Graphics g){
        g.drawRoundRect(20,20,85,85,20,20);
        g.fillArc(25,25,35,35,0,360);
        g.fillArc(65,25,35,35,0,360);
        g.fillArc(25,65,35,35,0,360);
        g.fillArc(65,65,35,35,0,360);
    }
}
