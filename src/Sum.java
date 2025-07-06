import java.util.Scanner;
public class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.print("Number 1 : ");
        n1 = sc.nextInt();
        System.out.print("Number 2 : ");
        n2 = sc.nextInt();
        System.out.print("Number 3 : ");
        n3 = sc.nextInt();

        int sum = n1+n2+n3;

        System.out.println(n1+ "+" +n2+ "+" +n3+ "=" + sum);

    }
}
