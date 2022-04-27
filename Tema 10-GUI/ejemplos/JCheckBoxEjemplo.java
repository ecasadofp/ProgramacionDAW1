package ejemplos;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.event.*;

public class JCheckBoxEjemplo extends JFrame implements ChangeListener{
    private JCheckBox check1,check2,check3;
    private JLabel eti1, eti2;
    public JCheckBoxEjemplo() {
    	setTitle("Idiomas");
    	/*
    	 * En el constructor de la clase llamamos al método heredado de la clase JFrame
    	 * llamado setLayout y le pasamos como par�metro un valor null, con esto estamos
    	 * informándole a la clase JFrame que utilizaremos posicionamiento absoluto para
    	 * los controles visuales dentros del JFrame.
    	 */
        setLayout(null);
        
        check1=new JCheckBox("Inglés");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);
        check2=new JCheckBox("Francés");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);        
        add(check2);
        check3=new JCheckBox("Alemán");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);        
        add(check3);        
        eti1 = new JLabel("Idiomas seleccionados: ");
        eti1.setBounds(10, 140, 150, 20);
        add(eti1);
        eti2 = new JLabel();
        eti2.setBounds(150, 140, 200, 20);
        eti2.setFont(new Font("Verdana", Font.BOLD,14));
        eti2.setForeground(Color.blue);
        add(eti2);
    }
    
    public void stateChanged(ChangeEvent e){
        String cad="";
        if (check1.isSelected()==true) {
            cad=cad+"Inglés-";
        }
        if (check2.isSelected()==true) {
            cad=cad+"Francés-";
        }
        if (check3.isSelected()==true) {
            cad=cad+"Alemán-";
        }
        eti2.setText(cad);
    }

    public static void main(String[] args) {
        JCheckBoxEjemplo formulario1 = new JCheckBoxEjemplo();
        formulario1.setBounds(0,0,350,250);
        formulario1.setVisible(true);
    }    
}
