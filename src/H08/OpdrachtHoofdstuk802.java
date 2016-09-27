package H08;



/**
 * Created by mustafa on 27-9-2016.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class OpdrachtHoofdstuk802 extends Applet {
    Button man;
    Button vrouw;
    Button vrouwll;
    Button manll;
    String atman;
    String atvrouw;
    String atmanll;
    String atvrouwll;
    String totaal;
    int xman;
    int xvrouw;
    int xmanll;
    int xvrouwll;
    int xtotaal;


    public void init(){
        man=new Button("Man");
        man.addActionListener(new KnopListener());
        vrouw=new Button("Vrouw");
        vrouw.addActionListener(new KnopListener2());
        vrouwll=new Button("Vrouwelijke Leerling");
        vrouwll.addActionListener(new KnopListener3());
        manll=new Button("Mannelijke Leerling");
        manll.addActionListener(new KnopListener4());
        add(man);
        add(vrouw);
        add(manll);
        add(vrouwll);
        atman="Aantal mannen: ";
        atvrouw="Aantal Vrouwen: ";
        atmanll="Aantal mannelijke leerlingen: ";
        atvrouwll="Aantal vrouwelijke leerlingen: ";
        totaal="Totaal: ";
        xman=0;
        xvrouw=0;
        xmanll=0;
        xvrouwll=0;
        xtotaal=0;



    }

    public void paint(Graphics g){
        g.drawString(atman+xman,20,100);
        g.drawString(atvrouw+xvrouw,20,115);
        g.drawString(atmanll+xmanll,20,130);
        g.drawString(atvrouwll+xvrouwll,20,145);
        g.drawString(totaal+xtotaal,20,160);

    }
    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xman=xman+1;
            xtotaal=xtotaal+1;
            repaint();

        }
    }
    class KnopListener2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xvrouw=xvrouw+1;
            xtotaal=xtotaal+1;
            repaint();

        }
    }
    class KnopListener4 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xmanll=xmanll+1;
            xman=xman+1;
            xtotaal=xtotaal+1;
            repaint();

        }
    }
    class KnopListener3 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            xvrouwll=xvrouwll+1;
            xvrouw=xvrouw+1;
            xtotaal=xtotaal+1;
            repaint();

        }
    }


}
