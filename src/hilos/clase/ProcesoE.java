package hilos.clase;

import javax.swing.*;

public class ProcesoE implements Runnable {
    private String mensaje;

    public ProcesoE(String frase) {
        this.mensaje = frase;
    }

    public void cuadroTexto(String mensaje) {
        JPanel panel = new JPanel();
        JOptionPane.showMessageDialog(panel, mensaje, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void run() {
        cuadroTexto(mensaje);
    }
}
