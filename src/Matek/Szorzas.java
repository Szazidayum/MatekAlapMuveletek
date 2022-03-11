package Matek;

public class Szorzas {
    
    private int x;
    private int y;

    public Szorzas() {
        this.x =  (int)(Math.random() * 20) + 1;
        do{
            this.y = (int)(Math.random() * 20) + 1;
        }while(this.y * this.x > 100); 
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public boolean ellenorzes(int valasz){
        return x * y == valasz;
    }

    @Override
    public String toString() {
        return "Szorzas{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
