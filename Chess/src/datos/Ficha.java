
package datos;

public abstract class Ficha {
    private int x,y;
    private char color;
    private boolean movido;

    public Ficha(int x, int y, char color) {
        setX (x);
        setY (y);
        setColor (color);
        setMovido (false);
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public boolean isMovido() {
        return movido;
    }

    public void setMovido(boolean movido) {
        this.movido = movido;
    }
    
    public abstract boolean MovimientoValido(int x,int y);
    
}
