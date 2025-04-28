package hilos.clase;

import hilos.vista.ventanaAuto;

public class ProcesoF implements Runnable {

    @Override
    public void run() {
        ventanaAuto ventana = new ventanaAuto();
        ventana.setVisible(true);
    }
}
