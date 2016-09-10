package H04;

/**
 * Created by Ummah on 10-9-2016.
 */

import java.awt.*;
import java.applet.*;


public class OpdrachtHoofdstuk404 extends Applet{

    public void init (){
    }

    public void paint (Graphics g){
        g.drawString("100",20,20);
        g.drawString("80",20,50);
        g.drawString("60",20,80);
        g.drawString("40",20,110);
        g.drawString("20",20,140);
        g.drawString("0",27,170);
        g.drawLine(45,5,45,170);
        g.drawLine(45,170,240,170);
        g.setColor(Color.red);
        g.fillRect(46,105,45,65);
        g.drawString("Valerie",45,180);
        g.setColor(Color.blue);
        g.fillRect(91,15,45,155);
        g.drawString("Jeroen",91,180);
        g.setColor(Color.green);
        g.fillRect(136,40,45,130);
        g.drawString("Hans",137,180);
    }
}
