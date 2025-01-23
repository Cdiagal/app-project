package main.java.es.cdiagal.tastkyourself.model;

public class ProductoModelo {
    
    String codigo;
    String nombre;
    // propiedades en general
    // constructores toSTring equals.

    public ProductoModelo(String codigo){
        this.codigo = codigo;
    }

    public ProductoModelo(String nombre, String codigo){
        this.codigo = codigo;
        this.nombre = nombre;
    }
}
