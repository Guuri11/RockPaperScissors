import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaGanador extends ventanaBase {
    private static final long serialVersionUID = 1L;
    static int trump, user;
    public static JLabel trumpwins;
    public static JLabel userwins;
    static ventanaPrincipal p;
    

    public ventanaGanador(int trump, int user) {
        this.trump = trump;
        this.user = user;

        if (this.trump == 3) {
            trumpwins = new JLabel();
            trumpwins.setBounds(74, 35, 535, 317);
            trumpwins.setIcon(new ImageIcon("imagenes/trumwins.png"));
            add(trumpwins);

        } else if (this.user == 3) {
            userwins = new JLabel();
            userwins.setBounds(74, 35, 535, 317);
            userwins.setIcon(new ImageIcon("imagenes/chucknorris.jpg"));
            add(userwins);
        }

        JButton start = new JButton("NEW GAME"); // BOTON PARA EMPEZAR JUEGO
        start.setBounds(277, 357, 112, 46);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                p = new ventanaPrincipal();

            }
        });
        add(start);

        JButton exit = new JButton("EXIT"); // BOTON PARA SALIR
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
            }
        });
        exit.setBounds(277, 415, 112, 46);
        add(exit);
    }

}