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
public class OperacionPromedio {

    private Ciudad[] lasCiudades;
    private double promedioPoblacion;

    //constructor
    public OperacionPromedio(Ciudad[] Ciudad) {
        lasCiudades = Ciudad;
    }

    public void establecerCiudad(Ciudad[] c) {
        lasCiudades = c;
    }

    public void establerPromedioPoblacion(double promPoblacion) {
        promedioPoblacion = promPoblacion;
    }

    public double obtenerPromedioPoblacion() {
        return promedioPoblacion;
    }

    public Ciudad[] obtenerLasCiudades() {
        return lasCiudades;
    }

    public void PromedioPoblacion() {
        double suma = 0;
        for (int i = 0; i < obtenerLasCiudades().length; i++) {
            suma = suma + obtenerLasCiudades()[i].obtenerPoblacion();

        }
        establerPromedioPoblacion(suma / obtenerLasCiudades().length);
    }

}
