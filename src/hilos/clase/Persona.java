package hilos.clase;

import lombok.Getter;
import lombok.Setter;

import java.security.SecureRandom;

public class Persona {
    @Getter @Setter private String nombre;
    @Getter @Setter private String fechaNacimiento;
    @Getter @Setter private String direccion;

    // Constructor
    public Persona() {}

    public Persona(String nombre, String fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

}
