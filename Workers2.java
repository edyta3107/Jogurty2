import java.util.HashMap;
import java.util.Map;

public class Workers2 {
    long pesel;
    String name;
    public Workers2(long pesel,String name) {
    }

    public static void main(String[] args) {
        Workers2 AdamKowalski = new Workers2(87031187955l, "Adam Kowalski ");
        Workers2 EdytaStyrczula = new Workers2(89745154648l, "Edyta Styrczula");
        Workers2 AdamKowalski2 = new Workers2(87542154785l, "Adam Kowalski");
        Workers2 BruceWillis = new Workers2(89073113163l, "Bruce Willis");
        Workers2 BruceWillis2 = new Workers2(89073113163l, "Bruce Willis");

        Map<Integer, Object> list = new HashMap<>();
        list.put(1, AdamKowalski);
        list.put(2, EdytaStyrczula);
        list.put(3, AdamKowalski2);
        list.put(4, BruceWillis);
        list.put(5, BruceWillis2);
        System.out.println(AdamKowalski.hashCode());
        System.out.println(EdytaStyrczula.hashCode());
        System.out.println(AdamKowalski2.hashCode());
        System.out.println(BruceWillis.hashCode());
        System.out.println(BruceWillis2.hashCode());

        System.out.println(BruceWillis.equals(BruceWillis2));

    }}


