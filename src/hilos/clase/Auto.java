package hilos.clase;

import lombok.Getter;
import lombok.Setter;

public class Auto {
    @Getter @Setter private String marca;
    @Getter @Setter private String modelo;
    @Getter @Setter private String precio;

    // Constructor
    public Auto() {
    }
    public Auto(String marca, String modelo, String precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

}
