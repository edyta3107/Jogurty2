import java.util.Scanner;

public class ReceptaMain extends Recepta{

    public ReceptaMain(String pacjent, int getNumerLekarza, int getNumerRp) {
        super(pacjent, getNumerLekarza, getNumerRp);
    }


    public static void main(String[] args) {
        String lek1 = "lek1 =  na alergie";
        String lek2 = "lek2 =  antybiotyk";

        Recepta rp1 = new Recepta("ola", 1111,1111);{

        for (int i = 0; i < 1; i++) {
            System.out.println("Podaj imie i nazwisko");
            Scanner scan = new Scanner(System.in);
            String dane = scan.nextLine();
            if ((rp1.poprawnedane1(dane, rp1.pacjent))) {
                System.out.println("OK");
                System.out.println("Podaj dane lekarza ");
            int lekarz = scan.nextInt();
            if (rp1.poprawnedane2(rp1.getNumerLekarza, lekarz))
                System.out.println("OK");
                System.out.println("Podaj numer recepty");
                int rp = scan.nextInt();
                if (rp1.poprawnedane2(rp, rp1.getNumerRp))
                    System.out.println("OK");
                    System.out.println(lek1);
                    System.out.println(lek2);
                System.out.println("Dodatki?");
                String decyzja = scan.nextLine();
                if(decyzja.equals("tak")){getlek3();getLek4();}
                    System.out.println();

                System.out.println("Rp zakonczona");}}}}}









