abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing...");
    }
     void refill() {
         System.out.println("Refilling...");
    }
    public void changeNib(){
        System.out.println("Changing Nib...");
    }
}
public class abstractClassMethod {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}
