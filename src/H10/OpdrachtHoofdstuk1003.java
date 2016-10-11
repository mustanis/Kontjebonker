package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mustafa on 11-10-2016.
 */



public class OpdrachtHoofdstuk1003 extends Applet {

    TextField tekstvakmaand;
    TextField tekstvakjaar;
    Label labelmaand;
    Label labeljaar;
    Button knop;
    String maandnaam;
    String schrikkeljaar;
    int maandnummer;
    int dagen;
    int jaartal;
    boolean geklikt;

    public void init(){
        geklikt=false;

        labelmaand=new Label("Maandnummer");
        add (labelmaand);

        tekstvakmaand=new TextField("", 10);
        add (tekstvakmaand);

        labeljaar=new Label("Jaar");
        add(labeljaar);

        tekstvakjaar=new TextField("", 10);
        add (tekstvakjaar);

        knop=new Button("Ok");
        knop.addActionListener(new knopListener());
        add (knop);

    }

    public void paint(Graphics g){
        if (geklikt) {
            g.drawString(maandnaam + " heeft " + dagen + " dagen.", 50, 70);
            g.drawString("Schrikkeljaar: " + schrikkeljaar, 50, 100);
        }
    }

    class knopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            geklikt=true;
            maandnummer=Integer.parseInt(tekstvakmaand.getText());
            switch (maandnummer) {
                case 1:
                    maandnaam = "Januari";
                    dagen = 31;
                    break;
                case 2:
                    maandnaam = "Februari";
                    dagen = 30;
                    break;
                case 3:
                    maandnaam = "Maart";
                    dagen = 31;
                    break;
                case 4:
                    maandnaam = "April";
                    dagen = 30;
                    break;
                case 5:
                    maandnaam = "Mei";
                    dagen = 31;
                    break;
                case 6:
                    maandnaam = "Juni";
                    dagen = 30;
                    break;
                case 7:
                    maandnaam = "Juli";
                    dagen = 31;
                    break;
                case 8:
                    maandnaam = "Augustus";
                    dagen = 31;
                    break;
                case 9:
                    maandnaam = "September";
                    dagen = 30;
                    break;
                case 10:
                    maandnaam = "Oktober";
                    dagen = 31;
                    break;
                case 11:
                    maandnaam = "November";
                    dagen = 30;
                    break;
                case 12:
                    maandnaam = "December";
                    dagen = 31;
                    break;
            }
            jaartal=Integer.parseInt(tekstvakjaar.getText());
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                schrikkeljaar = "✓";
            }
            else {
                schrikkeljaar = "X";
            }
            if ( (jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 0 ) {
                dagen = 28;
            }

            repaint();
        }
    }


}
