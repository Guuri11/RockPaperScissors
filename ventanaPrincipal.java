import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.awt.Component.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// ************ VENTANA DE INICIO ************//
public class ventanaPrincipal extends ventanaBase {

    private static final long serialVersionUID = 1L;
    JLabel fondo = new JLabel(new ImageIcon("imagenes/ppt.png")); // FONDO
                                                                                                                 // DEL
                                                                                                                 // JUEGO

    static ventanaJuego v;

    public ventanaPrincipal() {

        fondo.setBounds(162, 49, 342, 192); // DIMENSIONES DEL BOTON
        add(fondo);

        JButton start = new JButton("START"); // BOTON PARA EMPEZAR JUEGO
        start.setBounds(277, 293, 112, 46);
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                v = new ventanaJuego();

            }
        });
        add(start);

        JButton exit = new JButton("EXIT"); // BOTON PARA SALIR
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                dispose();
            }
        });
        exit.setBounds(277, 370, 112, 46);
        add(exit);

        repaint();
    }
}