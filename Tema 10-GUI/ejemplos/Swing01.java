package ejemplos;
import javax.swing.*;
import java.awt.*;

public class Swing01 extends JFrame {
  Container panel;
  JButton miboton;

  public Swing01() {
    super("Ejemplo 01 con bot�n");
    // Configurar componentes ;
    miboton = new JButton("Aceptar");
    panel = this.getContentPane();
    panel.add(miboton);
    setSize(200,100);
    setVisible(true);
  //  setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Swing01 ventana = new Swing01();
  }
}

