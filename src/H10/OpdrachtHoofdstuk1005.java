package H10;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mustafa on 11-10-2016.
 */
public class OpdrachtHoofdstuk1005 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    Button knop;
    double gemiddelde;
    String volon;
    double getal1;
    double getal2;
    double getal3;
    double getal4;
    double getal5;

    public void init(){
        tekstvak1=new TextField("", 10);
        add (tekstvak1);
        tekstvak2=new TextField("", 10);
        add (tekstvak2);
        tekstvak3=new TextField("", 10);
        add (tekstvak3);
        tekstvak4=new TextField("", 10);
        add (tekstvak4);
        tekstvak5=new TextField("", 10);
        add (tekstvak5);

        knop=new Button("Ok");
        knop.addActionListener(new knopListener());
        add (knop);


    }

    public void paint(Graphics g){
        g.drawString("Het gemiddelde = "+gemiddelde, 60, 100);
        g.drawString("Geslaagd: "+ volon, 60, 120);

    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.parseInt(tekstvak1.getText());
            getal2 = Integer.parseInt(tekstvak2.getText());
            getal3 = Integer.parseInt(tekstvak3.getText());
            getal4 = Integer.parseInt(tekstvak4.getText());
            getal5 = Integer.parseInt(tekstvak5.getText());
            gemiddelde=(getal1+getal2+getal3+getal4+getal5)/5;

            if (gemiddelde>5.5){
                volon="✓";
            }
            else {
                volon = "X";
            }
            repaint();
        }
    }
}
