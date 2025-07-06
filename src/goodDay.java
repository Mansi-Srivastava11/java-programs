import java.util.Scanner;
public class goodDay {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.print("Enter your name : ");
        name=sc.nextLine();

        System.out.print("Hello "+name+", have a good day!");
    }
}
