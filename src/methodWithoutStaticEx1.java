class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
}
public class methodWithoutStaticEx1 {
    public static void main(String[] args) {
        cellPhone phone = new cellPhone();
        phone.ring();
        phone.vibrate();
    }
}
