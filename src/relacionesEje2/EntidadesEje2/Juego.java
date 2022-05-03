package relacionesEje2.EntidadesEje2;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        jugadores = new ArrayList();
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

        this.jugadores = jugadores;
        this.revolver = r;

    }

    public void ronda() {

        for (Jugador aux : jugadores) {
            System.out.println(aux.getNombre());
        }

        do {

            for (Jugador jugadore : jugadores) {

                if (jugadore.disparo(revolver) == true) {
                    System.out.println("\033[33m ---------------------------------------");
                    System.out.println(jugadore.getNombre() + " \033[31m Perdiste facha");
                     System.out.println("\033[33m ---------------------------------------");

                    return;
                }

                revolver.siguienteChorro();
            }
        } while (true);
    }

    public void agregar() {
        for (int i = 0; i < 6; i++) {
            jugadores.add(new Jugador(i + 1));
        }

    }
}
