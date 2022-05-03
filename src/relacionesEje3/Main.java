package relacionesEje3;

import java.util.Scanner;
import relacionesEje3.EntidadesEjer3.Carta;
import relacionesEje3.Service.Baraja;

/**
 *
 * @author franc
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Baraja mazo = new Baraja();

        boolean salir = false;
        int op;
        
        
        do {
            System.out.println("Bienvenido!\n"
                    + "1.Barajar\n"
                    + "2.Dar cartas\n"
                    + "3.Siguiente carta\n"
                    + "4.Mostrar baraja\n"
                    + "5.Cartas del repartidas\n"
                    + "6.Salir");

            op = leer.nextInt();

            switch (op) {
                case 1:
                    mazo.barajar();

                    break;
                case 2:
                    mazo.darCartas();
                    break;
                case 3:
                    mazo.siguienteCarta();
                    break;
                case 4:
                    mazo.mostrarBaraja();
                    break;
                case 5:
                    mazo.cartasMonton();
                    break;
                case 6:
                    System.out.println("Estas seguro que quieres salir? S/N");
                    String aux = leer.next();
                    if (aux.toUpperCase().equals("S")) {
                        salir = true;
                    }
                default:

            }
        } while (!salir);

    }
}
