package ejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swing05 extends JFrame implements ActionListener {
  JButton boton;
  Container panel;

  public Swing05() {
    super("Ejemplo de eventos");
    panel = this.getContentPane();
    boton = new JButton("Pulsa!");
    panel.add(boton);
    boton.addActionListener(this);
    setSize(400, 200);
    setVisible(true);
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public void actionPerformed(ActionEvent e) {
  //  Toolkit.getDefaultToolkit().beep();
	  JOptionPane.showMessageDialog(panel,
		      "Has pulsado el botón",
		      "Lo hiciste! ",
		       JOptionPane.INFORMATION_MESSAGE);
	  
  }

  public static void main(String args[]) {
    Swing05 ventana = new Swing05();
  }
}



