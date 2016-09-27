package H06;

/**
 * Created by mustafa on 22-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk603 extends Applet{
    int a;
    int b;
    int c;

    public void init(){
        a=10;
        b=20;
        c=-(a+b);

    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde is: "+c ,50,50);

    }
}
