package hilos.test;

import hilos.clase.*;


public class Test {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setFechaNacimiento("01/01/2000");
        persona.setDireccion("Calle Falsa 123");

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Dirección: " + persona.getDireccion());



        ProcesoA a = new ProcesoA("Juan");
        ProcesoB b = new ProcesoB(10);
        ProcesoC c = new ProcesoC(10);
        Runnable x = new ProcesoD(100);
        Thread d = new Thread(x);
        Runnable y = new ProcesoE("Hola ¿Cómo estás?");
        Thread e = new Thread(y);

        a.start();
        c.start();
        b.start();
        d.start();
        e.start();

        Runnable w = new ProcesoF();
        Thread r = new Thread(w);

        r.start();
    }
}
