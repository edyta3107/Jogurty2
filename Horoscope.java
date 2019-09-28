import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Horoscope {
 public static void main(String[]args){
     System.out.println("Horoskop na dzisiaj ");
   String znakiZodiaku[] ={"Baran", "Byk","Bliznieta","Rak","Lew","Panna","Waga","Skorpion","Strzelec",
   "Koziorozec","Wodnik","Ryby"};
Scanner scan = new Scanner(System.in);
String znak = scan.nextLine();{
     for (int i = 0;i<znakiZodiaku.length; i++){
         znak.equals(znakiZodiaku);{

           Random los= new Random();
         int praca = los.nextInt(2);
         int milosc = los.nextInt(2);
         int zdrowie = los.nextInt(2);
         System.out.println("Praca");
         if(   praca ==0) {
             System.out.println("*");}
         if(praca ==1){
             System.out.println("**");}
             if(praca==2){
                 System.out.println("***");}
         System.out.println("Milosc");
         if(milosc==0){
             System.out.println("*");}
         if(milosc==1){System.out.println("**");}
         if(milosc==2){System.out.println("***"); }
         System.out.println("Zdrowie");
if(zdrowie==0){System.out.println("*");}
if(zdrowie==1){System.out.println("**");}
if(zdrowie==2){System.out.println("***");}}}}}}















