package H10;

/**
 * Created by mustafa on 11-10-2016.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtHoofdstuk1002 extends Applet {

    TextField tekstvak;
    Button knop;
    int hoogsteGetal;
    int laagsteGetal;
    boolean geklikt;

    public void init(){
        geklikt=false;
        tekstvak=new TextField("",10);
        add(tekstvak);
        knop=new Button("Ok");
        knop.addActionListener (new knopListener());
        add(knop);
        hoogsteGetal=Integer.MIN_VALUE;
        laagsteGetal=Integer.MAX_VALUE;
    }

    public void paint (Graphics g) {
        if (geklikt) {
            g.drawString("Het hoogste getal = " + hoogsteGetal, 50, 70);
            g.drawString("Het laagste getal = " + laagsteGetal, 50, 80);

        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           int getal=Integer.parseInt(tekstvak.getText());

            geklikt=true;

            if(getal>hoogsteGetal){
                hoogsteGetal=getal;
            }

            if (getal<hoogsteGetal){
                laagsteGetal=getal;
            }

            if (laagsteGetal==Integer.MAX_VALUE){
                laagsteGetal=hoogsteGetal;
            }
            repaint();
        }
    }
}
