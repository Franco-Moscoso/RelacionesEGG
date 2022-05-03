
package relacionesEje2.EntidadesEje2;


import java.util.Scanner;

/**
 *
 * @author franc
 */
public class Jugador {
    private Scanner leer;
    private int id;
    private String nombre;
    private boolean mojado;
    
    

    public Jugador() {
        leer = new Scanner(System.in).useDelimiter("\n");
        
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public Jugador(int i){
        id = i;
        nombre ="Jugador"+ id;
        mojado = false;
    }

    public boolean disparo(Revolver r){
        boolean aux = false;
       if(r.mojar() == true){
           aux = true;
           
       }
       mojado = aux;
        return mojado;
        
    }

    
}
