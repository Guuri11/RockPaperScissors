import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

// ************ VENTANA DEL JUEGO ************//
public class ventanaJuego extends ventanaBase {
    private static final long serialVersionUID = 1L;
    public static JLabel trump;
    public static JLabel resultado;
    public static JLabel trumpContador;
    public static JLabel userContador;
    public static int contadorTrump = 0;
    public static int contadorUser = 0;

    public ventanaJuego() {
        // *************** CONTADORES Y RESULTADO **************** //
        trumpContador = new JLabel("TRUMP: " + contadorTrump);
        trumpContador.setBounds(465, 11, 190, 79);
        trumpContador.setFont(new Font("Arial", Font.BOLD, 40));
        add(trumpContador);

        userContador = new JLabel("USER: " + contadorUser);
        userContador.setFont(new Font("Arial", Font.BOLD, 40));
        userContador.setBounds(15, 11, 190, 79);
        add(userContador);

        resultado = new JLabel("Gana quien llegue a 3!");
        resultado.setBounds(167, 175, 350, 200);
        resultado.setFont(new Font("Arial", Font.BOLD, 30));
        add(resultado);

        // *************** TRUMP **************** //
        trump = new JLabel("");
        trump.setIcon(new ImageIcon("imagenes/Trump.jpg"));
        trump.setBounds(280, 75, 175, 175);
        add(trump);

        // ***************BOTONES PIEDRA PAPEL TIJERAS**************** //
        JButton piedra = new JButton("");
        piedra.setIcon(new ImageIcon("imagenes/piedra.png"));
        piedra.setBounds(89, 328, 100, 100);
        piedra.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                juego.user = "piedra";
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("x");
                }
                juego.trump = juego.trumpJugada();
                juego.comprobarRonda(juego.user, juego.trump);
                repaint();
                revalidate();

            }
        });
        add(piedra);

        JButton papel = new JButton("");
        papel.setIcon(new ImageIcon("imagenes/papel.png"));
        papel.setBounds(280, 328, 100, 100);
        papel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                juego.user = "papel";
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("x");
                }
                juego.trump = juego.trumpJugada();
                juego.comprobarRonda(juego.user, juego.trump);
                repaint();
                revalidate();
            }
        });
        add(papel);

        JButton tijeras = new JButton("");
        tijeras.setIcon(new ImageIcon("imagenes/tijeras.png"));
        tijeras.setBounds(471, 328, 100, 100);
        tijeras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                juego.user = "tijeras";
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("x");
                }
                juego.trump = juego.trumpJugada();
                juego.comprobarRonda(juego.user, juego.trump);
                repaint();
                revalidate();
            }
        });
        add(tijeras);

        repaint();
    }

}