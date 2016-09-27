package H08;

/**
 * Created by mustafa on 27-9-2016.
 */

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.geom.Arc2D;

public class OpdrachtHoofdstuk804 extends Applet{
    TextField textvak1;
    TextField textvak2;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    double x;
    double y;


    public void init(){
        setSize(500,100);
        textvak1=new TextField("",20);
        textvak2=new TextField("",20);
        add(textvak1);
        add(textvak2);
        knop1=new Button("*");
        knop1.addActionListener(new Button1());
        knop2=new Button("/");
        knop2.addActionListener(new Button2());
        knop3=new Button("+");
        knop3.addActionListener(new Button3());
        knop4=new Button("-");
        knop4.addActionListener(new Button4());
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
    }


    class Button1 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            x=Double.parseDouble(textvak1.getText());
            y=Double.parseDouble(textvak2.getText());
            textvak1.setText(""+x*y);
            textvak2.setText("");
            repaint();

        }
    }

    class Button2 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            x=Double.parseDouble(textvak1.getText());
            y=Double.parseDouble(textvak2.getText());
            textvak1.setText(""+x/y);
            textvak2.setText("");
            repaint();

        }
    }

    class Button3 implements ActionListener{
        public void actionPerformed(ActionEvent e){
            x=Double.parseDouble(textvak1.getText());
            y=Double.parseDouble(textvak2.getText());
            textvak1.setText(""+(x+y));
            textvak2.setText("");
            repaint();

        }
    }

    class Button4 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            x=Double.parseDouble(textvak1.getText());
            y=Double.parseDouble(textvak2.getText());
            textvak1.setText(""+(x-y));
            textvak2.setText("");
            repaint();

        }
    }



}
