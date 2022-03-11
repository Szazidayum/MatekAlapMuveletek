package matekalapmuveletek;
import java.util.Random;
import java.util.Scanner;
import Matek.Osztas;
import Matek.Szorzas;
public class MatekAlapmuveletek {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Szeretnél gyakrolni?");
        System.out.print("1: igen\n2: nem\n");
        int folytat = scanner.nextInt();
        while(!(folytat==2)){
            if (folytat==1){
                valasztas();
            System.out.println("Szeretnél gyakrolni?");
            System.out.println("1: igen\n2: nem");
            folytat = scanner.nextInt();
            }else{
                folytat=2;
            }
        }
       
    }
    
    private static void valasztas(){
        System.out.println("Milyen műveletet szeretnél gyakorolni?");
        System.out.print("1: összeadás\n2: kivonás\n3: szorzás\n4: osztás\nÍrd be a megfelelő számot: ");
        int valasz = scanner.nextInt();
        while (!(valasz==1 || valasz==2 || valasz==3 || valasz==4)){
            System.out.print("Nem jó számot adtál meg.Írd be újra: ");
            valasz = scanner.nextInt();
        }
        System.out.println("Old meg a következő 10 műveletet:");
        if (valasz==1){
            osszeadas();
        }else if (valasz==2){
            kivonas();
        }else if (valasz==3){
            szorzas();
        }else if (valasz==4){
            osztas();
        }
    }
    
    private static int osszeadas() {
        int joValaszok = 0;
        int min = 0, max = 100;
        Random rndSzam = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".művelet");
            int szam1 = rndSzam.nextInt(max - min + 1) + min;
            int szam2 = rndSzam.nextInt((100 - szam1) - min + 1) + min;
            System.out.print(szam1 + "+" + szam2 + "= ");
            int valasz = scanner.nextInt();
            if (!(valasz == (szam1 + szam2))) {
                while (!(valasz == (szam1 + szam2))) {
                    System.out.println("Nem jó a válasz, próbáld meg újra!");
                    System.out.print(szam1 + "+" + szam2 + "= ");
                    valasz = scanner.nextInt();
                }

            }
            //System.out.println("");
            //System.out.println("Helyes válaszok: " + joValaszok);

        }
        return joValaszok;
    }

    private static int kivonas() {
        int joValaszok = 0;
        int min = 0, max = 100;
        Random rndSzam = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".művelet");
            int szam1 = rndSzam.nextInt(max - min + 1) + min;
            int szam2 = rndSzam.nextInt(max - min + 1) + min;

            int seged = 0;
            if (szam2 > szam1) {
                seged = szam2;
                szam2 = szam1;
                szam1 = seged;
            }

            System.out.print(szam1 + "-" + szam2 + "= ");
            int valasz = scanner.nextInt();
            if (!(valasz == (szam1 - szam2))) {
                while (!(valasz == (szam1 - szam2))) {
                    System.out.println("Nem jó választ adtál meg, próbáld meg újra!");
                    System.out.print(szam1 + "-" + szam2 + "= ");
                    valasz = scanner.nextInt();
                }
            }

        }
        System.out.println("");
        System.out.println("Helyes válaszok: " + joValaszok);

        return joValaszok;
    }
    private static int szorzas(){
        int szorzasValasz=0;
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".művelet");
        Scanner sc = new Scanner(System.in);
        Szorzas szorzas = new Szorzas();
        System.out.println("Mi az eredmény: "+ szorzas.getX()+ "*"+ szorzas.getY());
        szorzasValasz = sc.nextInt();
        System.out.println(szorzas.ellenorzes(szorzasValasz)? "Jó válasz" : "Rossz válasz");
        }
        return szorzasValasz;
    }
    private static int osztas(){
        int osztasValasz=0;
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+".művelet");
        Scanner sc = new Scanner(System.in);
        Osztas osztas = new Osztas();
        System.out.println("Mi az eredmény: "+ osztas.getX()+ "/"+ osztas.getY());
        osztasValasz = sc.nextInt();
        System.out.println(osztas.ellenorzes(osztasValasz)? "Jó válasz" : "Rossz válasz");
        }
        return osztasValasz;
    }
    
}