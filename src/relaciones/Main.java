
package relaciones;

import java.util.Scanner;
import relaciones.entidades.Perro;
import relaciones.entidades.Persona;

/**
 *
 * @author franc
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Perro perro1 = new Perro("Pepe","Beagle","Chiquito",7);
        
        Persona persona1 = new Persona("Franco","Moscoso",21,42809793,perro1);
        
        Perro perro2 = new Perro("Loki","Ovejero","Grande",2);
        
        Persona persona2 = new Persona("Martin","Martinez",30,4142434,perro2);
        System.out.println(persona1);
        System.out.println(persona2);
    }
    
}
