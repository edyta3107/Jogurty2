import model.PoszukiwanyPartner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Randki {


    public static void main(String[] args){
        PoszukiwanyPartner poszukiwanyPartner1 = new PoszukiwanyPartner(true,false,20,30,160,170);
        PoszukiwanyPartner poszukiwanyPartner2 = new PoszukiwanyPartner(false,true,25,30,170,180);
        PoszukiwanyPartner poszukiwanyPartner3 = new PoszukiwanyPartner(true,false,19,27,168,189);
        PoszukiwanyPartner poszukiwanyPartner4 = new PoszukiwanyPartner(false,true,45,55,170,180);


        Uzytkownik uzytkownik1 = new Uzytkownik(true,false,30,166,poszukiwanyPartner1 );
        Uzytkownik uzytkownik2 =  new Uzytkownik(false,true,33,180,poszukiwanyPartner2);
        Uzytkownik uzytkownik3 =   new Uzytkownik(false,true,36,180,poszukiwanyPartner3);
        List<Uzytkownik> uzytkownicy = Arrays.asList(
        uzytkownik1,
       uzytkownik2,
        uzytkownik3,
        new Uzytkownik(false,true,40,175,poszukiwanyPartner4));

        List<Uzytkownik> pasujacyPartnerzy = uzytkownicy.stream()
                .filter(uzytkownik -> !uzytkownik1.equals(uzytkownik))
                .filter(uzytkownik -> uzytkownik.getPoszukiwanyPartner().getMaxWiek() < 45)
                .collect(Collectors.toList());

        pasujacyPartnerzy.stream().
                map(uzytkownik -> uzytkownik.isMezczyzna()+ " " + uzytkownik.getWiek() + " " + uzytkownik.getWzrost())
                .forEach(System.out::println);

pasujacyPartnerzy.stream()
        .filter(abc->uzytkownik1.isKobieta()==abc.getPoszukiwanyPartner().isKobieta())
        .forEach(match -> System.out.println(match.getWiek()));
//        uzytkownicy.stream()
//                .filter(uzytkownik -> !uzytkownik1.equals(uzytkownik))
//                .filter(uzytkownik -> uzytkownik.getPoszukiwanyPartner().getMaxWiek()< 45)
//                .map(uzytkownik -> uzytkownik.isMezczyzna()+ " " + uzytkownik.getWiek() + " " + uzytkownik.getWzrost())
//                .forEach(System.out::println);





}}
