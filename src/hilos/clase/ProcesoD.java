package hilos.clase;

import static java.lang.Thread.sleep;

public class ProcesoD implements Runnable {
    private int n;

    public ProcesoD(int numero) {
        n = numero;
    }

    public void cadena(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        cadena(n);
    }
}
