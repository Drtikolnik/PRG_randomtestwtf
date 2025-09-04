import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Mazlicek> mazlickove = new ArrayList<>();

        for (boolean behZapisu=true;;behZapisu=true) {

            System.out.println("1 - zadat");
            System.out.println("2 - vypsat");
            System.out.println("3 - průměrný věk");
            System.out.println("4 - průměrná váha");
            System.out.println("5 - vyhledat podle jména");
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
                    Mazlicek.vypocetPrumernehoVeku(mazlickove);
                break;


                case 4:
                    Mazlicek.vypocetPrumerneVahy(mazlickove);
                    break;


                case 5:
                    System.out.println("Zadej jméno:");
                    String jmeno = sc.nextLine();

                    Mazlicek.vyhledatPodleJmena(jmeno, mazlickove);
                    break;

            }



        }





















    }
}