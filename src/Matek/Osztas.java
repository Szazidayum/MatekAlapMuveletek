
package Matek;


public class Osztas {
    private int x;
    private int y;

    public Osztas() {
        this.x =  (int)(Math.random() * 100) + 1;
        do{
            this.y = (int)(Math.random() * 100) + 1;
        }while(this.x  < this.y || this.x % this.y != 0 || this.y ==1); 
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public boolean ellenorzes(int valasz){
        return x / y == valasz;
    }

    @Override
    public String toString() {
        return "Osztas{" + "x=" + x + ", y=" + y + '}';
    }
}
