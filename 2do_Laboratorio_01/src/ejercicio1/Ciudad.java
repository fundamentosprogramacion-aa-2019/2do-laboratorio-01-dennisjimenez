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
public class Ciudad {

    private String nombre;
    private int poblacion;
    private Provincia provincia;

    //constructor
    public Ciudad(String n, int p, Provincia pr) {
        establecerNombre(n);
        establecerPoblacion(p);
        establecerProvincia(pr);
    }

    public void establecerNombre(String n) {

        nombre = n;
    }

    public void establecerPoblacion(int n) {

        poblacion = n;
    }

    public void establecerProvincia(Provincia n) {

        provincia = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerPoblacion() {
        return poblacion;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    public String toString() {
        String cadena = String.format("Ciudad:\n\tNombre:%s\n\tPoblacion:%s\n\tProvincia:"
                + "%s\n", obtenerNombre(), obtenerPoblacion(), obtenerProvincia());
        return cadena;
    }

}
