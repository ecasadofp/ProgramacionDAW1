package ejemplos;

import javax.swing.*;
import javax.swing.event.*;

public class botones1 extends JFrame implements ChangeListener{
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup bg;
    public botones1() {
    	setTitle("Ejemplo JRadioButton");
    	
        setLayout(null);
        bg=new ButtonGroup();
        radio1=new JRadioButton("640*480");
        radio1.setBounds(10,20,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        bg.add(radio1);
        radio2=new JRadioButton("800*600");
        radio2.setBounds(10,70,100,30);
        radio2.addChangeListener(this);        
        add(radio2);
        bg.add(radio2);
        radio3=new JRadioButton("1024*768");
        radio3.setBounds(10,120,100,30);
        radio3.addChangeListener(this);        
        add(radio3);
        bg.add(radio3);        
    }
    
    public void stateChanged(ChangeEvent e) {
        if (radio1.isSelected()) {
            setSize(640,480);
        }
        if (radio2.isSelected()) {
            setSize(800,600);
        }
        if (radio3.isSelected()) {
            setSize(1024,768);
        }        
    }

    public static void main(String[] args) {
        botones1 formulario1 = new botones1();
        formulario1.setBounds(0,0,350,230);
        formulario1.setVisible(true);
    } 	
}
