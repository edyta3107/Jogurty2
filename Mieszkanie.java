import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Mieszkanie {
    public static void main(String[] args){
        List<Mieszkanie2>mieszkanieList = Arrays.asList(
          new Mieszkanie2("Krakow","Pradnik","xxx",1,1.02f,true,30),
          new Mieszkanie2("Krakow","bonarka","xxx",2, 1.03f,true,30),
          new Mieszkanie2("Wroclaw","ccc","bbb",3,1.06f,false,10));



         mieszkanieList.stream()
        .filter(mieszkanie -> mieszkanie.getMiasto().equals("Krakow")).filter(mieszkanie -> mieszkanie.getCena()>=10)
        .map(mieszkanie -> mieszkanie.getMiasto()+ ""+ mieszkanie.getpiwnica()+ ""+mieszkanie.getCena()+""+mieszkanie.getUlica())
        .forEach(System.out::println);}






    }











