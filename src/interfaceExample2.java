interface TVRemote{
    void turnOff();
    void volumeLoud();
    void volumeSlow();
}
interface SmartTVRemote extends TVRemote {
    void Wifi();
    void netflix();
    void youtube();
}
class TV implements TVRemote{
    public void turnOff() {
        System.out.println("Turn off the TV...");
    }
    @Override
    public void volumeLoud() {
        System.out.println("Increasing the volume...");
    }
    @Override
    public void volumeSlow() {
        System.out.println("Decreasing the volume...");
    }
}
public class interfaceExample2 {
    public static void main(String[] args) {
        SmartTVRemote remote = new SmartTVRemote() {
            @Override
            public void Wifi() {
                System.out.println("I am SmartTV , Turning on Wifi...");
            }

            @Override
            public void netflix() {
                System.out.println("I am SmartTV , Turning on Netflix...");
            }

            @Override
            public void youtube() {
                System.out.println("I am SmartTV , On Youtube...");
            }

            @Override
            public void turnOff() {
                System.out.println("Turn off the TV...");
            }

            @Override
            public void volumeLoud() {
                System.out.println("Increasing the volume...");
            }

            @Override
            public void volumeSlow() {
                System.out.println("Decreasing the volume...");
            }
        };

        remote.netflix();
        remote.Wifi();
        remote.youtube();
        remote.volumeSlow();
        remote.volumeLoud();
        remote.turnOff();

    }
}
