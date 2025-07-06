import java.util.Scanner;
public class threeSubPercen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sub1, sub2, sub3;

        System.out.println("Subject 1 : ");
        sub1 = sc.nextInt();
        System.out.println("Subject 2 : ");
        sub2 = sc.nextInt();
        System.out.println("Subject 3 : ");
        sub3 = sc.nextInt();

        int totalMarks = sub1+sub2+sub3;
        System.out.println(totalMarks);

        double per = (totalMarks / 300.0) * 100;
        System.out.println(per);

        double cgpa = per/9.5;
        System.out.println(cgpa);
    }
}
