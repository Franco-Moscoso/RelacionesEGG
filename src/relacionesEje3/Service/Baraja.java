package relacionesEje3.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import relacionesEje3.EntidadesEjer3.Carta;
import relacionesEje3.Enum.Palos;

public class Baraja {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> baraja;
    ArrayList<Carta> mazo;

    public Baraja() {
        baraja = new ArrayList();
        mazo = new ArrayList();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 12; j++) {
                Carta carta = new Carta(Palos.values()[i], j + 1);
                baraja.add(carta);
                

            }

        }
    }

    public ArrayList<Carta> getCartas() {
        return baraja;
    }

    public void setCartas(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }

    public void barajar() {
        Collections.shuffle(baraja);

    }
    public void siguienteCarta(){
        for (int i = 0; i < 40; i++) {
            baraja.remove(i);
            
            if(i == 0){
                break;
            }
        }   
    }
    
    public void mostrarBaraja(){
        for (Carta carta : baraja) {
            System.out.println(carta);
        }
    }

    public void  darCartas(){
        System.out.println("Ingrese el numero de cartas a retirar");
        int cartas = leer.nextInt();
        
        for (int i = cartas-1; i >= 0; i--) {
            
            Carta carta = baraja.remove(i);
            mazo.add(carta);
            
            if(cartas > baraja.size()){
                System.out.println("No hay mas cartas");
            }
        }

    }
    public void cartasMonton(){
        for (Carta aux :mazo) {
            System.out.println(aux);
        }
    }
}
