
package relacionesEje2.EntidadesEje2;

/**
 *
 * @author franc
 */
public class Revolver {
    private int posicionActual;
    private int posicionAgua;
    

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
        
    }



    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }


    
    public void llenarRevolver(){
        posicionActual = (int) (Math.random()*6+1);
        posicionAgua = (int) (Math.random()*6+1);
        
    }
    
    public boolean mojar(){
        boolean ind =false;
        Jugador j = new Jugador();
        if(posicionActual == posicionAgua){
            ind = true;
            
        }
            return ind;
            
        
         
    }
    public void siguienteChorro(){
        posicionActual++;
        if(posicionActual >=6){
            posicionActual =1;
        }
    }
}
