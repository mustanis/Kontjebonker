package H08;

import sun.plugin.viewer.context.WNetscape6AppletContext;



/**
 * Created by mustafa on 27-9-2016.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class OpdrachtHoofdstuk8 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    String s;


    public void init(){
        tekstvak=new TextField("", 20);
        add(tekstvak);
        knop=new Button("OK");
        knop2=new Button("RESET");
        knop.addActionListener(new KnopListener2());
        knop2.addActionListener(new KnopListener());
        add(knop);
        add(knop2);
        s = "";



    }

    public void paint(Graphics g) {
        g.drawString(s,50,90);


    }
    class KnopListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            s=tekstvak.getText();
            repaint();

        }
    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText(" ");
            repaint();

        }
    }

}
