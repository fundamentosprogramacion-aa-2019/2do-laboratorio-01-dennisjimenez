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
public class Equipo {

    private String nombre;
    private Federacion federacion;
    private int numeroCampeonatos;

    public Equipo(String n, Federacion f, int numCamp) {
        establecerNombre(n);
        establecerFederacion(f);
        establecerNumeroCampeonatos(numCamp);
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerFederacion(Federacion f) {
        federacion = f;
    }

    public void establecerNumeroCampeonatos(int numCamp) {
        numeroCampeonatos = numCamp;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Federacion obtenerFederacion() {
        return federacion;
    }

    public int obtenerNumeroCampeonatos() {
        return numeroCampeonatos;
    }

    public String toString() {

        String cadena = String.format("%s\t\t\t%d\t\t\t%s\t\t\t%s\t%s",
                obtenerNombre(), obtenerNumeroCampeonatos(),
                obtenerFederacion().obtenerNombre(),
                obtenerFederacion().obtenerConfederacion().obtenerNombre(),
                obtenerFederacion().obtenerConfederacion().obtenerSiglas());
        return cadena;
    }
}
