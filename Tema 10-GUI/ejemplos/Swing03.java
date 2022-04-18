package ejemplos;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;

public class Swing03 extends JFrame {
  Container panel;

  public Swing03() {
    super("Ejemplo de Layout");
    // Configurar componentes:
    panel = this.getContentPane();
    // BorderLayout sobrecarga de constructores, espaciado horizontal y vertical entre componentes
    panel.setLayout(new BorderLayout(5, 10));
    panel.add(new JButton("1"), BorderLayout.EAST);
    panel.add(new JButton("2"), BorderLayout.SOUTH);
    panel.add(new JButton("3"), BorderLayout.WEST);
    panel.add(new JButton("4"), BorderLayout.NORTH);
    panel.add(new JButton("5"), BorderLayout.CENTER);
    setSize(200,200);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String args[]) {
    Swing03 ventana = new Swing03();
  }
}

