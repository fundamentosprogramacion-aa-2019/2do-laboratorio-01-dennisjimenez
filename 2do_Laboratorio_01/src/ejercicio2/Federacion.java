
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
public class Federacion {

    private String nombre;
    private Confederacion confederacion;
    private String deporte;

    public Federacion(String n, Confederacion conf, String d) {
        establecerNombre(n);
        establecerConfederacion(conf);
        establecerDeporte(d);
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerConfederacion(Confederacion conf) {
        confederacion = conf;
    }

    public void establecerDeporte(String d) {
        deporte = d;
    }

    //**********************************************************************
    public String obtenerNombre() {
        return nombre;
    }

    public Confederacion obtenerConfederacion() {
        return confederacion;
    }

    public String obtenerDeporte() {
        return deporte;
    }

    public String toString() {

        String cadena = String.format("%s\t\t%s",
                obtenerNombre(), obtenerConfederacion().obtenerNombre(),
                obtenerDeporte());
        return cadena;
    }

}
