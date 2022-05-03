package relacionesEje2;

import java.util.ArrayList;
import java.util.Scanner;
import relacionesEje2.EntidadesEje2.Juego;
import relacionesEje2.EntidadesEje2.Jugador;
import relacionesEje2.EntidadesEje2.Revolver;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Revolver revolver = new Revolver();
        

        Jugador jugador = new Jugador();

        Juego juego = new Juego();
        ArrayList<Jugador> jugadores = new ArrayList();

        System.out.println("\033[34m Bienvenido a la RULETA RUSA!!");
        
        for (int i = 0; i < 6; i++) {
            jugadores.add(new Jugador(i));
        }
        
        revolver.llenarRevolver();
        juego.llenarJuego(jugadores, revolver);

        

        juego.ronda();

    }

}
