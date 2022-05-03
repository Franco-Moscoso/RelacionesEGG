
package relacionesEje3.EntidadesEjer3;

import java.util.Scanner;
import relacionesEje3.Enum.Palos;

/**
 *
 * @author franc
 */
public class Carta {
    private Scanner leer;
    private int numeros;
    private Palos palos;

    public Carta() {
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Carta(Palos palos, int numeros) {
        this.palos = palos;
        this.numeros = numeros;
    }

    public Palos getPalos() {
        return palos;
    }

    public void setPalos(Palos palos) {
        this.palos = palos;
    }

    public int getNumeros() {
        return numeros;
    }

    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }

    @Override
    public String toString() {
        return "BarajaEspa\u00f1ola{" + "numeros=" + numeros + ", palos=" + palos + '}';
    }

    
    
    
    
    
}
