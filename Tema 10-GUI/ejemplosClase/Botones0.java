package ejemplos;

import java.awt.Container;
import java.awt.FlowLayout;
 
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
 
public class Botones0 extends JFrame {
	
 Container contenedor;
    public Botones0() {
        super("Ejemplo grupos de opción");
        setLayout(new FlowLayout());
        contenedor=getContentPane();
        
       
        this.setVisible(true);
        JRadioButton option1 = new JRadioButton("Linux",true);
        JRadioButton option2 = new JRadioButton("Windows");
        JRadioButton option3 = new JRadioButton("Macintosh");
 
        
        ButtonGroup group = new ButtonGroup();
        
        group.add(option1);
        group.add(option2);
        group.add(option3);
       
       
        contenedor.add(option1);
        contenedor.add(option2);
        contenedor.add(option3);
 
        
    }
 
    public static void main(String[] args) {
    	Botones0 formulario0 = new Botones0();
        formulario0.setBounds(0,0,300,130);
        formulario0.setVisible(true);      
               
            };
   
}