package ejemplos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentListener;

public class ComboBoxes extends JFrame {
    public ComboBoxes() {
        super("ComboBoxes");
        setLayout(null);
        setSize(345, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComboBox modulo = new JComboBox();
        modulo.setBounds(40,10, 180, 30);
       
        modulo.addItem("Bases de Datos");
        modulo.addItem("Inglés");
        modulo.addItem("Entornos de desarrollo");
        modulo.addItem("Programación");
        add(modulo);
        setVisible(true);
    }
    
     public static void main(String[] arguments) {
        ComboBoxes cb = new ComboBoxes();
    }
}
