package H10;

/**
 * Created by mustafa on 11-10-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OpdrachtHoofdstuk1006 extends Applet {

    TextField tekstvak;
    Button knop;
    String volon;
    int getal;

    public void init(){

        tekstvak=new TextField("", 10);
        add (tekstvak);

        knop=new Button ("Ok");
        knop.addActionListener(new knopListener());
        add (knop);

    }

    public void paint (Graphics g){
        g.drawString("Uw cijfer = "+ volon, 50, 70);
    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal=Integer.parseInt(tekstvak.getText());
            switch (getal){
                case 1:
                case 2:
                case 3:
                    volon = "Slecht";
                    break;
                case 4:
                    volon = "Onvoldoende";
                    break;
                case 5:
                    volon = "Matig";
                    break;
                case 6:
                case 7:
                    volon = "Voldoende";
                    break;
                case 8:
                case 9:
                case 10:
                    volon = "Goed";
                    break;
                default:
                    volon = "X   U heeft een te hoog cijfer ingevoerd!";
                    break;
            }
            repaint();
        }
    }

}
