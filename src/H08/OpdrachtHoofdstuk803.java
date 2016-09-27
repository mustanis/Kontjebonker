package H08;

/**
 * Created by mustafa on 27-9-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OpdrachtHoofdstuk803 extends Applet {
    Button ok;
    TextField textvak;
    Label label;
    double plusbtw;

    public void init(){
        label=new Label("Type een getal");
        add(label);
        textvak=new TextField("",20);
        textvak.addActionListener (new TekstListener());
        ok=new Button("Ok");
        ok.addActionListener(new KnopListener());
        add(textvak);
        add(ok);

    }

    public void paint(Graphics g){
        g.drawString("Het ingevoerde getal plus 21% BTW is: "+plusbtw*121/100, 30, 100);

    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s=textvak.getText();
            plusbtw=Double.parseDouble(s);
            repaint();

        }
    }
    class TekstListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s=textvak.getText();
            plusbtw=Double.parseDouble(s);
            repaint();

        }
    }

}
