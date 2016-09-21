package H06;

/**
 * Created by mustafa on 21-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk6 extends Applet {

    int uitkomst;

    public void init(){
        uitkomst = 113/4;

    }

    public void paint (Graphics g){
        g.drawString("Jan €" + uitkomst,50,50);
        g.drawString("Ali €" + uitkomst,50,70);
        g.drawString("Jeannette €" + uitkomst,50,90);
        g.drawString("Ik €" + uitkomst,50,110);
    }
}
