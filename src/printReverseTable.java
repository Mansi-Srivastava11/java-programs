import java.util.Scanner;

public class printReverseTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print a table : ");
        int num = sc.nextInt();
        for (int i=10;i>=1;i--){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}

