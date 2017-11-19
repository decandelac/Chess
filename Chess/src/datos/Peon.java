
package datos;

public class Peon extends Ficha{

    public Peon(int x, int y, char color) {
        super(x, y, color);
    }

    @Override
    public boolean MovimientoValido(int x, int y) {
        if(x+1==getX()){
            //if(verificar casilla ocupada)
            return true;
            //else
            //return false;
        }
        else{
            
        }
        return true;
    }
    
}