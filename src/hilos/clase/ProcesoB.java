package hilos.clase;

public class ProcesoB extends Thread {
    private int n;

    public ProcesoB(int n) {
        this.n = n;
    }

    public void contar(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Iteración N°" + i);
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        contar(n);
    }
}
