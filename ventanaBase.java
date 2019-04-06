import javax.swing.*;
import java.awt.*;

// ************ VENTANA BASE ************///
public class ventanaBase extends JFrame {

    private static final long serialVersionUID = 1L;

    public ventanaBase() {
        setSize(683, 500);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setTitle("PIEDRA PAPEL TIJERAS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.gray);
        


    }
}