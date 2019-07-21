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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Confederacion conf1 = new Confederacion("Confederación Sudamericana "
                + "de Fútbol ", "(CONMEBO)");
        Confederacion conf2 = new Confederacion("Unión de Asociaciones "
                + "Europeas de Fútbol", "(UEFA)");
        Confederacion conf3 = new Confederacion("Confederación de Fútbol de"
                + " Norte, Centroamérica y el Caribe ", "(CONCACAF)");
        Confederacion conf4 = new Confederacion("Confederación Asiática de"
                + " Fútbol", "(AFC)");

        Federacion fed1 = new Federacion("Asociación del Fútbol Argentino "
                + "(AFA)       ", conf1, "Futbol");
        Federacion fed2 = new Federacion("Confederación Brasileira de Futbol ("
                + "CBF)     ", conf1, "Futbol");
        Federacion fed3 = new Federacion("United States Soccer Federation "
                + "(USSF)  ", conf3, "Futbol");
        Federacion fed4 = new Federacion("Federación Mexicana de Fútbol"
                + " Asociación (FMF)", conf3, "Futbol");
        Federacion fed5 = new Federacion("Real Federación Española de Fútbol "
                + "(RFEF)     ", conf2, "Futbol");
        Federacion fed6 = new Federacion("Federación Portuguesa de Futebol "
                + "(FPF)         ", conf2, "Futbol");
        Federacion fed7 = new Federacion("Korea Football Association "
                + "(KFA)              ", conf4, "Futbol");
        Federacion fed8 = new Federacion("Chinese Football Association "
                + "(CFA)           ", conf4, "Futbol");

        Equipo eq1 = new Equipo("River Plate ", fed1, 5);
        Equipo eq2 = new Equipo("Boca Juniors", fed1, 2);
        Equipo eq3 = new Equipo("Sao Paulo   ", fed2, 4);
        Equipo eq4 = new Equipo("Palmeiras   ", fed2, 2);
        Equipo eq5 = new Equipo("Oporto      ", fed6, 4);
        Equipo eq6 = new Equipo("Real Madrid ", fed5, 2);
        Equipo eq7 = new Equipo("Tigres      ", fed4, 3);
        Equipo eq8 = new Equipo("Philadelphia", fed3, 2);
        Equipo eq9 = new Equipo("Taiwan      ", fed8, 1);
        Equipo eq10 = new Equipo("Macao      ", fed8, 1);
        Equipo eq11 = new Equipo("Yukong     ", fed7, 3);
        Equipo eq12 = new Equipo("Seongnam   ", fed7, 1);

        Equipo[] equipos = new Equipo[12];
        equipos[0] = eq1;
        equipos[1] = eq2;
        equipos[2] = eq3;
        equipos[3] = eq4;
        equipos[4] = eq5;
        equipos[5] = eq6;
        equipos[6] = eq7;
        equipos[7] = eq8;
        equipos[8] = eq9;
        equipos[9] = eq10;
        equipos[10] = eq11;
        equipos[11] = eq12;

        System.out.println("NOMBRE DEL EQUIPO\t\tCAMPEONATOS\t\t"
                + "FEDERACION\t\t\t\t\t\t\tCONFEDERACION\n");
        for (int i = 0; i < equipos.length; i++) {
            Equipo equipo = equipos[i];
            System.out.printf("%s\n", equipos[i]);
        }

        OperacionSuma operacion = new OperacionSuma(equipos);
        operacion.establecerSumaCampeonato();

        System.out.printf("%s\n", operacion);

    }

}
