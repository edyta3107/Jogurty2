import java.util.HashMap;
import java.util.Map;
public class xxx {
    public  static  void main (String[] args) {
Map<Integer,Integer> dupa = new HashMap<>();
dupa.put(1,2);
dupa.put(2,2);
for (Map.Entry<Integer,Integer> n : dupa.entrySet()){
    int a = n.getKey();
    int b = n.getValue();
    System.out.println(a +" " + b);
Map<Integer,Integer> dupa2 = new HashMap<>();
dupa2.put(1,3);
dupa2.put(4, 7);
for(Map.Entry<Integer,Integer> g : dupa2.entrySet()){
    int c = g.getKey();
    int d = g.getValue();
    System.out.println(c+d);
    }



}





    }}
