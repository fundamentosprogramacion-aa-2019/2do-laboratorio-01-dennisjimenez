/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Dennis Leo
 */
public class Confederacion {

    private String nombre;
    private String siglas;

    public Confederacion(String n, String s) {
        establecerNombre(n);
        establcerSiglas(s);
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establcerSiglas(String s) {
        siglas = s;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }

    public String toString() {

        String cadena = String.format("%s\t%s",
                obtenerNombre(), obtenerSiglas());
        return cadena;
    }
}
