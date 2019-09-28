import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Workers {
    public static void main(String[] args) {

        Map<Integer, String> workers = new HashMap<>();
        workers.put(1, "Adam Kowalski");
        workers.put(2, "Bruce Willis");
        workers.put(3, "Enrique Iglesias");
        workers.put(4, "Edyta Styrczula");
        workers.put(5,"Adam Kowalski");

        for (Map.Entry<Integer, String> entry : workers.entrySet()) {
            System.out.println("Lp" + entry.getKey() + " " + "Worker  :" + " " + entry.getValue());
        }
        System.out.println("What would You like to do with workers list ?");
        System.out.println("1 - add new worker? ");
        System.out.println("2 - remove worker?");
        System.out.println("3-  check data workers");

        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("First add number and then in the same line add data of new worker");
                int newWorker = scan.nextInt();
                String newWorker1 = scan.nextLine();
                if (newWorker > workers.size()) {
                    workers.put(newWorker, newWorker1);
                    for (Map.Entry<Integer, String> entry : workers.entrySet()) {
                        System.out.println("Lp" + entry.getKey() + " " + "Worker  :" + " " + entry.getValue());
                    }
                    break;
                }
            case 2:
                System.out.println("Write worker number, who You want to remove");
                workers.remove(scan.nextInt());
                for (Map.Entry<Integer, String> entry : workers.entrySet()) {
                    System.out.println("Lp" + entry.getKey() + " " + "Worker  :" + " " + entry.getValue());
                }
                break;

            case 3:
                System.out.println("Write data of worker to check she/ he exist in worker list");
                String workerData = scan.nextLine();
                System.out.println(workers.containsValue(scan.nextLine()));
                break;
        }

        System.out.println(workers.get(1).hashCode());
        System.out.println(workers.getOrDefault(1,"Adam Kowalski").hashCode());
        System.out.println("Adam Kowalski".hashCode());
        System.out.println(workers.getOrDefault(5,"Adam Kowalski").hashCode());
 if(workers.get(1).equals(workers.get(5))) {
     System.out.println("true");
     System.out.println(workers.get(1).hashCode()==workers.get(5).hashCode());
 }


}}




               /* System.out.println(workers.containsValue("Adam Kowalski"));

        //System.out.println("Add new worker, anserw yes or no  ?");

    System.out.println(workers);
    System.out.println("Currently workers list :" + workers.size());
}
}



}}*/








