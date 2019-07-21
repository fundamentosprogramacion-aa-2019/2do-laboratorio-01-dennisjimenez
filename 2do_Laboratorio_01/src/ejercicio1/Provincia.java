/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Dennis Leo
 */
public class Provincia {

    private String nombre;

    private Region region;

    //constructor
    public Provincia(String n, Region r) {
        establecerNombre(n);

        establecerRegion(r);
    }

    public void establecerNombre(String n) {

        nombre = n;
    }

    public void establecerRegion(Region r) {

        region = r;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Region obtenerRegion() {
        return region;
    }

    public String toString() {
        String cadena = String.format("Provincia:\n\tNombre:%s\n\tRegion:"
                + "%s\n", obtenerNombre(), obtenerRegion());
        return cadena;
    }

}
