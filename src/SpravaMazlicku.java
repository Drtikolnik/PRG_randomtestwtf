import java.util.ArrayList;

public class SpravaMazlicku {


    public void vypocetPrumernehoVeku(ArrayList<Mazlicek> mazlickove){
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

    public void vypocetPrumerneVahy(ArrayList<Mazlicek> mazlickove){
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


    public void vyhledatPodleJmena(String jmeno, ArrayList<Mazlicek> mazlickove){
        for (Mazlicek mazlicek : mazlickove) {
            if(mazlicek.getJmeno().equals(jmeno)){
                mazlicek.toString();
            }
        }
    }

    public void vyhledatPodleDruhu(String druh, ArrayList<Mazlicek> mazlickove){
        for (Mazlicek mazlicek : mazlickove) {
            if(mazlicek.getDruh().equals(druh)){
                mazlicek.toString();
            }
        }
    }
}
