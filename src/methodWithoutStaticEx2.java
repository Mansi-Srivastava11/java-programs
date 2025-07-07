class TommyVecetti{
    public void hit(){
        System.out.println("Hitting...");
    }
    public void run(){
        System.out.println("Running...");
    }
    public void fire(){
        System.out.println("Firing...");
    }
}
public class methodWithoutStaticEx2 {
    public static void main(String[] args) {
        TommyVecetti tommy = new TommyVecetti();
        tommy.hit();
        tommy.run();
        tommy.fire();
    }
}
