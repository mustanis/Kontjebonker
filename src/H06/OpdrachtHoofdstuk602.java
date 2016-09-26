package H06;

/**
 * Created by mustafa on 22-9-2016.
 */

import java.awt.*;
import java.applet.*;

public class OpdrachtHoofdstuk602 extends Applet {
    int uitkomstuur;
    int uitkomstdag;
    int uitkomstjaar;

    public void init(){
        uitkomstuur=60*60;
        uitkomstdag=uitkomstuur*24;
        uitkomstjaar=uitkomstdag*365;

    }

    public void paint(Graphics g){
        g.drawString("Seconden in een uur (60*60) = "+uitkomstuur,50,50);
        g.drawString("Seconden in een dag (60*60*24) = "+uitkomstdag,50,65);
        g.drawString("Seconden in een jaar (60*60*24*365) = "+uitkomstjaar,50,80);

    }
}
