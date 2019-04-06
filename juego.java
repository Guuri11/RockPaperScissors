import java.util.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.UIManager;

public class juego {
    public static String user = "";
    public static String trump = "";
    public static int contadorTrump = 0;
    public static int contadorUser = 0;

    public static void main(String[] args) {
        ventanaPrincipal frame = new ventanaPrincipal();

    }

    public static String trumpJugada() {
        Random ran = new Random(System.currentTimeMillis());
        String j = "";
        int num = ran.nextInt(3) + 1;
        if (num == 1) {
            j = "piedra";
            ventanaJuego.trump.setIcon(new ImageIcon("imagenes/trumpiedra.jpg"));
        }

        else if (num == 2) {
            j = "papel";
            ventanaJuego.trump.setIcon(new ImageIcon("imagenes/trumpapel.jpg"));
        }

        else {
            j = "tijeras";
            ventanaJuego.trump.setIcon(new ImageIcon("imagenes/trumtijeras.jpg"));
        }

        return j;
    }

    public static void comprobarRonda(String user, String trump) {
        switch (user) {
        case "piedra":
            if (trump.equals("piedra")) {
                ventanaJuego.resultado.setText("Empate!");
                ventanaJuego.resultado.setBounds(270, 175, 210, 200);

                if (ventanaJuego.contadorUser == 3 || ventanaJuego.contadorTrump == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    comprobarVictoria(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);
                }
                break;
            } else if (trump.equals("papel")) {
                ventanaJuego.resultado.setText("Has perdido!");
                ventanaJuego.contadorTrump++;
                ventanaJuego.resultado.setBounds(240, 175, 210, 200);
                ventanaJuego.trumpContador.setText("TRUMP: " + ventanaJuego.contadorTrump);

                if (ventanaJuego.contadorUser == 3 || ventanaJuego.contadorTrump == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    comprobarVictoria(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);

                }
                break;
            } else {
                ventanaJuego.resultado.setText("Has ganado!");
                ventanaJuego.contadorUser++;
                ventanaJuego.resultado.setBounds(240, 175, 210, 200);
                ventanaJuego.userContador.setText("User: " + ventanaJuego.contadorUser);

                if (ventanaJuego.contadorUser == 3 || ventanaJuego.contadorTrump == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    comprobarVictoria(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);
                }
                break;

            }

        case "papel":
            if (trump.equals("piedra")) {
                ventanaJuego.resultado.setText("Has ganado!");
                ventanaJuego.contadorUser++;
                ventanaJuego.resultado.setBounds(240, 175, 210, 200);
                ventanaJuego.userContador.setText("User: " + ventanaJuego.contadorUser);

                if (ventanaJuego.contadorUser == 3 || ventanaJuego.contadorTrump == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    comprobarVictoria(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);
                }
                break;
            } else if (trump.equals("papel")) {
                ventanaJuego.resultado.setText("Empate!");
                ventanaJuego.resultado.setBounds(270, 175, 210, 200);
                break;
            } else {
                ventanaJuego.resultado.setText("Has perdido!");
                ventanaJuego.contadorTrump++;
                ventanaJuego.resultado.setBounds(240, 175, 210, 200);
                ventanaJuego.trumpContador.setText("TRUMP: " + ventanaJuego.contadorTrump);

                if (ventanaJuego.contadorUser == 3 || ventanaJuego.contadorTrump == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    comprobarVictoria(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);
                }
                break;
            }

        case "tijeras":
            if (trump.equals("piedra")) {
                ventanaJuego.resultado.setText("Has perdido!");
                ventanaJuego.contadorTrump++;
                ventanaJuego.trumpContador.setText("TRUMP: " + ventanaJuego.contadorTrump);
                ventanaJuego.resultado.setBounds(240, 175, 210, 200);

                if (ventanaJuego.contadorUser == 3 || ventanaJuego.contadorTrump == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    comprobarVictoria(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);
                }
                break;
            } else if (trump.equals("papel")) {
                ventanaJuego.resultado.setText("Has ganado!");
                ventanaJuego.contadorUser++;
                ventanaJuego.userContador.setText("User: " + ventanaJuego.contadorUser);
                ventanaJuego.resultado.setBounds(240, 175, 210, 200);

                if (ventanaJuego.contadorUser == 3 || ventanaJuego.contadorTrump == 3) {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                    comprobarVictoria(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);
                }
                break;
            } else {
                ventanaJuego.resultado.setText("Empate!");
                ventanaJuego.resultado.setBounds(270, 175, 210, 200);
                break;
            }

        default:
        }
    }

    public static void comprobarVictoria(int trump, int user) {
        if (ventanaJuego.contadorTrump == 3 || ventanaJuego.contadorUser == 3) {
            ventanaPrincipal.v.dispose();
            ventanaGanador vWin = new ventanaGanador(ventanaJuego.contadorTrump, ventanaJuego.contadorUser);
            ventanaJuego.contadorTrump = 0;
            ventanaJuego.contadorUser = 0;
            vWin.setVisible(true);
        }
    }

}