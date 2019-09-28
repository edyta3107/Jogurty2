import java.util.Scanner;
import java.util.Random;
public class Losowanie {
    public static void main(String[] args){
        System.out.println("Wybierz zakres od 0-10 ");

        System.out.println("Masz 4 proby");
        Random los =  new Random();
int x = los.nextInt(10);

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i <= 4; i ++){
            int cyfra = scan.nextInt();
            if(x == cyfra){
                System.out.println("Gratulacje");
            }
           else if(cyfra<x){
                System.out.println("wyzej");
            }
          else  if(cyfra>x){
                System.out.println("nizej");
            }
            if(i==4){
                System.out.println("koniec");
            }


        }




      


        }

    }




