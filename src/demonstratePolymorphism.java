abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract  void disconnect();
}
class SmartTelephone extends telephone{
    void ring(){
        System.out.println("Ringing...");
    }
    void lift(){
        System.out.println("Lifting...");
    }
    void disconnect(){
        System.out.println("Disconnecting...");
    }
    void camera(){
        System.out.println("Clicking Photo...");
    }
}
public class demonstratePolymorphism {
    public static void main(String[] args) {
        telephone tel = new SmartTelephone();
        tel.ring();
        tel.lift();
        tel.disconnect();

    }
}
