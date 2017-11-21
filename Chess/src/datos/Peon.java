
package datos;

public class Peon extends Ficha{

    public Peon(int x, int y, char color) {
        super(x, y, color);
    }

    @Override
    public boolean MovimientoValido(int x, int y) {
        if(y+1==getY()||y==getY()+2&&isMovido()){
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
