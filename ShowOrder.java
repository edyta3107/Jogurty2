public class ShowOrder {

    private int nextNumber;

    public ShowOrder(int nextNumber) {
        this.nextNumber = nextNumber;
    }
public void update (Object object){
    System.out.println("czytnik nr" + nextNumber+ "odczytal nowe zamowienie" + object);
}


}
