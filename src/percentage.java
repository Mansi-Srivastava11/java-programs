import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter marks of 5 subjects ");
        for (int i=0;i<5;i++){
            System.out.print("Subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            totalMarks+=marks[i];
        }
        System.out.println(totalMarks);
        double percentage = (totalMarks / 500.0) * 100;


        System.out.println("Total Marks = "+totalMarks+" out of 500");
        System.out.println("Percentage = "+percentage+"%");
    }
}