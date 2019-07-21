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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Region r1 = new Region("Costa");
        Region r2 = new Region("Sierra");
        Region r3 = new Region("Oriente");

        Provincia pr1 = new Provincia("Loja            ", r2);
        Provincia pr2 = new Provincia("Pichincha       ", r2);
        Provincia pr3 = new Provincia("El Oro          ", r1);
        Provincia pr4 = new Provincia("Guayas          ", r1);
        Provincia pr5 = new Provincia("Zamora Chinchipe", r3);

        Ciudad c1 = new Ciudad("Zapotillo  ", 16312, pr1);
        Ciudad c2 = new Ciudad("Catacocha  ", 5369, pr1);
        Ciudad c3 = new Ciudad("Cayambe    ", 39028, pr2);
        Ciudad c4 = new Ciudad("Sangolquí  ", 75080, pr2);
        Ciudad c5 = new Ciudad("El Guabo   ", 50009, pr3);
        Ciudad c6 = new Ciudad("Huaquillas ", 47706, pr3);
        Ciudad c7 = new Ciudad("Durán      ", 235769, pr4);
        Ciudad c8 = new Ciudad("Samborondón", 500000, pr4);
        Ciudad c9 = new Ciudad("El Pangui  ", 8619, pr5);
        Ciudad c10 = new Ciudad("Yantzaza  ", 18500, pr5);

        Ciudad[] ciudades = new Ciudad[10];
        ciudades[0] = c1;
        ciudades[1] = c2;
        ciudades[2] = c3;
        ciudades[3] = c4;
        ciudades[4] = c5;
        ciudades[5] = c6;
        ciudades[6] = c7;
        ciudades[7] = c8;
        ciudades[8] = c9;
        ciudades[9] = c10;

        System.out.println("CIUDAD\t\t\tPOBLACIÓN\t\tPROVINCIA\t\t\tREGIÓN\n");
        for (int i = 0; i < ciudades.length; i++) {

            System.out.printf("%s\t\t%d\t\t\t%s\t\t%s\n",
                    ciudades[i].obtenerNombre(),
                    ciudades[i].obtenerPoblacion(),
                    ciudades[i].obtenerProvincia().obtenerNombre(),
                    ciudades[i].obtenerProvincia().obtenerRegion().obtenerNombre());

        }

        OperacionPromedio operacion = new OperacionPromedio(ciudades);
        operacion.PromedioPoblacion();

        System.out.printf("Promedio de la Poblacion: %s\n",
                operacion.obtenerPromedioPoblacion());

    }

}
