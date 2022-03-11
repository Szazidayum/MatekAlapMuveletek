package Matek;
import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Szorzas szorzas = new Szorzas();
        System.out.println("Mi az eredmény: "+ szorzas.getX()+ "*"+ szorzas.getY());
        int szorzasValasz = sc.nextInt();
        System.out.println(szorzas.ellenorzes(szorzasValasz)? "Jó válasz" : "Rossz válasz");
        
        Osztas osztas = new Osztas();
        System.out.println("Mi az eredmény: "+ osztas.getX()+ "/"+ osztas.getY());
        int osztasValasz = sc.nextInt();
        System.out.println(osztas.ellenorzes(osztasValasz)? "Jó válasz" : "Rossz válasz");
    }
    
}
