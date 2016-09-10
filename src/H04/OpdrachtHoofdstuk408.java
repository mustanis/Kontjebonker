package H04;

/**
 * Created by Ummah on 10-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk408 extends Applet{

    public void init(){
    }

    public void paint(Graphics g){
        g.drawLine(10,10,200,10);
        g.drawString("Lijn",100,25);
        g.drawRect(10,35,190,75);
        g.drawString("Rechthoek",80,125);
        g.drawRoundRect(10,145,190,75,30,30);
        g.drawString("Afgeronde Rechthoek",50,235);
        g.setColor(Color.magenta);
        g.fillArc(210,145,190,75,0,360);
        g.fillRect(210,35,190,75);
        g.fillArc(410,35,190,75,0,45);
        g.setColor(Color.black);
        g.drawArc(210,35,190,75,0,360);
        g.drawString("Gevulde rechthoek met ovaal",225,125);
        g.drawString("Gevulde Ovaal",265,235);
        g.drawArc(410,35,190,75,0,360);
        g.drawString("Taartpunt met ovaal eromheen",420,125);
        g.drawArc(460,145,75,75,0,360);
        g.drawString("Cirkel",475,235);
    }
}
