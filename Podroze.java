import java.util.ArrayList;
import java.util.Scanner;

public class Podroze   {
    public static void main (String[] args){

        for(Kraje d: Kraje.values()){
            System.out.println("Oferta");
            System.out.println(d);
        }

        ArrayList<Kraje> ciepleKraje = new ArrayList<>();
        ciepleKraje.add(Kraje.Grecja);
        ciepleKraje.add(Kraje.Turcja);
        ciepleKraje.add(Kraje.Grecja1);
        ciepleKraje.add(Kraje.Egipt);
        ciepleKraje.add(Kraje.Turcja1);

        ArrayList<Kraje>zimneKraje = new ArrayList<>();
        zimneKraje.add(Kraje.Norwegia);

        System.out.println("*****Cieple kraje*****");
        System.out.println(ciepleKraje);
        System.out.println("****Zimne kraje****");
        System.out.println(zimneKraje);
        System.out.println("***************");
        for(Kraje k : Kraje.values() ){
            System.out.println(k);
            System.out.println(k.getKosztWycieczki());


            PodrozeInterface ubezpieczenie = (a,b)-> k.getKosztWycieczki()+ b;
            System.out.println("Wycieczka z ubezpieczeniem");
            System.out.println(ubezpieczenie.oblicz(0,0.2*k.getKosztWycieczki()));
            System.out.println("Koszty wycieczki po odliczeniu ulg");
            PodrozeInterface ulgi = (x,y)-> (k.getKosztWycieczki()+ 0.2*k.getKosztWycieczki())- y;
            System.out.println(ulgi.oblicz(0, 100.0));

           }
        }


    }




