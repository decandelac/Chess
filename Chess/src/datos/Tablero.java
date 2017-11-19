package datos;
import datos.Peon;

public class Tablero {
    public casilla board[][]=new casilla[8][8];
    public casilla muertas[][]=new casilla[4][8];
    public Tablero() {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                switch(i){
                    case 2:
                        this.board[i][j]=new casilla(new Peon(i,j,'n'));
                        break;
                    case 7:
                        this.board[i][j]=new casilla(new Peon(i,j,'b'));
                        break;
                    default:
                        this.board[i][j]=new casilla(null);
                        break;
                }
            }
        }
    }
    
}
