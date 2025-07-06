import java.util.Scanner;
public class convertKmMiles {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter km : ");
        float km = sc.nextFloat();
        double miles = km/1.60934;
        System.out.println(miles);
    }
}
