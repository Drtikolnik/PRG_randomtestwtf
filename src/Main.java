import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Mazlicek> mazlickove = new ArrayList<>();
        SpravaMazlicku haf = new SpravaMazlicku();

        for (boolean behZapisu=true;;behZapisu=true) {

            System.out.println("1 - zadat");
            System.out.println("2 - vypsat");
            System.out.println("3 - průměrný věk");
            System.out.println("4 - průměrná váha");
            System.out.println("5 - vyhledat podle jména");
            System.out.println("6 - filtrovat podle druhu");
            int vyber = sc.nextInt();
            sc.nextLine();
            switch (vyber) {
                case 1:
                    mazlickove.add(new Mazlicek());
                    break;


                case 2:
                    for (Mazlicek mazlicek : mazlickove) {
                        mazlicek.toString();
                        System.out.println();
                    }

                    break;


                case 3:

                    haf.vypocetPrumernehoVeku(mazlickove);
                break;


                case 4:
                    haf.vypocetPrumerneVahy(mazlickove);
                    break;


                case 5:
                    System.out.println("Zadej jméno:");
                    String jmeno = sc.nextLine();

                    haf.vyhledatPodleJmena(jmeno, mazlickove);
                    break;


                case 6:
                    System.out.println("Zadej druh:");
                    String druh = sc.nextLine();

                    haf.vyhledatPodleDruhu(druh, mazlickove);
                    break;

            }



        }





















    }
}