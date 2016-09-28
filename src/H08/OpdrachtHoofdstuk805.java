package H08;

/**
 * Created by mustafa on 28-9-2016.
 */

import javax.swing.text.LabelView;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class OpdrachtHoofdstuk805 extends Applet{
    Button waarde;
    TextField tvvalerie;
    TextField tvjeroen;
    TextField tvhans;
    Label labelvalerie;
    Label labeljeroen;
    Label labelhans;
    Color rood;
    Color blauw;
    Color groen;
    int br;
    double kgvalerie;
    double kgjeroen;
    double kghans;
    double base;



    public void init (){
        setSize(500,300);
        waarde=new Button("Wijzig waardes");
        waarde.addActionListener(new waardeKnop());
        tvvalerie=new TextField(8);
        tvvalerie.setText("0");
        tvjeroen=new TextField(8);
        tvjeroen.setText("0");
        tvhans=new TextField(8);
        tvhans.setText("0");
        labelvalerie=new Label("Valerie:");
        labeljeroen=new Label("Jeroen:");
        labelhans=new Label("Hans:");
        add(labelvalerie);
        add(tvvalerie);
        add(labeljeroen);
        add(tvjeroen);
        add(labelhans);
        add(tvhans);
        add(waarde);
        rood = Color.red;
        blauw = Color.blue;
        groen = Color.green;
        br = 35;
        kgvalerie=0;
        kgjeroen = 0;
        kghans = 0;
        base = 274;

    }

    public void paint (Graphics g){
        g.drawString("100",20,130);
        g.drawString("80",20,160);
        g.drawString("60",20,190);
        g.drawString("40",20,220);
        g.drawString("20",20,250);
        g.drawString("0",27,277);
        g.drawLine(45,120,45,274);
        g.drawLine(45,274,240,274);
        g.setColor(rood);
        g.fillRect(46, (int) (base-kgvalerie),br,(int)kgvalerie);
        g.setColor(blauw);
        g.fillRect(91,(int)(base-kgjeroen),br,(int)kgjeroen);
        g.setColor(groen);
        g.fillRect(136,(int)(base-kghans),br,(int)kghans);
    }

    class waardeKnop implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            kgvalerie=Double.parseDouble(tvvalerie.getText())*1.5;
            kgjeroen=Double.parseDouble(tvjeroen.getText())*1.5;
            kghans=Double.parseDouble(tvhans.getText())*1.5;
            repaint();
        }

    }

}

