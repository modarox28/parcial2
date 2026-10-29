package com.example.parcial2;

public class Prenda {
    private String nombre;
    private String descripcion;
    private String precio;
    private String urlImagen;

    public Prenda(String nombre, String descripcion, String precio, String urlImagen) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.urlImagen = urlImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public String getUrlImagen() {
        return urlImagen;
    }
}