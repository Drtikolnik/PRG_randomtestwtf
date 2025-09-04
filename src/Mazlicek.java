import java.util.ArrayList;
import java.util.Scanner;

public class Mazlicek {
    static Scanner sc = new Scanner(System.in);
    private String jmeno;
    private String druh;
    private int vek;
    private double vaha;
    private ArrayList<Mazlicek> mazlickove;

    Mazlicek(){
        System.out.println("Jméno mazlíčka:");
        this.jmeno = sc.nextLine();
        System.out.println("Druh mazlíčka:");
        this.druh = sc.nextLine();
        System.out.println("Věk mazlíčka:");
        this.vek = sc.nextInt();
        sc.nextLine();
        System.out.println("Váha mazlíčka:");
        this.vaha = sc.nextDouble();
        sc.nextLine();
    }


    public String toString(){
        System.out.println("Jméno: " +getJmeno()+ ", Druh: " +getDruh()+ ", Věk: " +getVek()+ ", Váha: " +getVaha()+ "kg");
        return null;
    }

    public String vypocetPrumernehoVeku(Mazlicek mazlicek){
        double prumerVek = 0;
        int vekCelkem = 0;
        int pocet = 0;
        for (Mazlicek mazlicek : mazlickove) {
            vekCelkem = vekCelkem + mazlicek.getVek();
            pocet++;
        }
        prumerVek = vekCelkem / pocet;
        System.out.println("Průměrný věk: " + prumerVek);
    }

    public void vypocetPrumerneVahy(Mazlicek mazlicek){
        double prumerVaha = 0;
        double vahaCelkem = 0;
        int pocet = 0;
        for (Mazlicek mazlicek : mazlickove) {
            vahaCelkem = vahaCelkem + mazlicek.getVaha();
            pocet++;
        }
        prumerVaha = vahaCelkem / pocet;
        System.out.println("Průměrná váha: " + prumerVaha);
    }


    public void vyhledatPodleJmena(String jmeno, Mazlicek mazlicek){

    }












    //set
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public void setDruh(String druh) {
        this.druh = druh;
    }
    public void setVek(int vek) {
        this.vek = vek;
    }
    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    //get
    public String getJmeno() {
        return jmeno;
    }
    public String getDruh() {
        return druh;
    }
    public int getVek() {
        return vek;
    }
    public double getVaha() {
        return vaha;
    }
}
