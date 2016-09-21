package H05;

/**
 * Created by mustafa on 20-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk502 extends Applet{
    Color ok1;
    Color ok2;
    Color ok3;
    int br;
    int kgvalerie;
    int kgjeroen;
    int kghans;
    int base;


    public void init (){
        ok1 = Color.red;
        ok2 = Color.blue;
        ok3 = Color.green;
        br = 45;
        kgvalerie = 80;
        kgjeroen = 120;
        kghans = 95;
        base = 170;

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
        g.setColor(ok1);
        g.fillRect(46,base-kgvalerie,br,kgvalerie);
        g.setColor(ok2);
        g.fillRect(91,base-kgjeroen,br,kgjeroen);
        g.setColor(ok3);
        g.fillRect(136,base-kghans,br,kghans);
    }

}