import java.util.Scanner;

public class factLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find factorial : ");
        int num = sc.nextInt();
        int fact=1;
        for(int i=num;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(num+"! = "+fact);
    }
}
