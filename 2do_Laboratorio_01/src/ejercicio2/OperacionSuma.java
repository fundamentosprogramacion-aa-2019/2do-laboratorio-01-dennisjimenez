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
public class OperacionSuma {

    private Equipo[] campeonato;
    double suma;

    public OperacionSuma(Equipo[] equipos) {
        campeonato = equipos;

    }

    public void establecerCampeonato(Equipo[] ca) {
        campeonato = ca;
    }

    public void establecerSumaCampeonato() {
        int sumaCamp = 0;

        for (int i = 0; i < campeonato.length; i++) {
            sumaCamp = sumaCamp + campeonato[i].obtenerNumeroCampeonatos();
        }
        suma = sumaCamp;
    }

    public Equipo[] obtenerCampeonato() {
        return campeonato;
    }

    public double obtenerSumaCampeonato() {
        return suma;
    }

    public String toString() {
        String cadena = String.format("Suma campeonatos: %.0f\n",
                obtenerSumaCampeonato());
        return cadena;
    }

}
