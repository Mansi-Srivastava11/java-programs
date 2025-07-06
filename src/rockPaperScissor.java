import java.util.Scanner;
import java.util.Random;
public class rockPaperScissor {
    public static void main(String args[]){

        System.out.print("\nNote, Here's three weapons \n R - Rock \n P - Paper \n S - Scissor \n\n ");

        //Play 5 times
        for(int i=1;i<=5;i++) {
            System.out.println(i+" round");

            //User Input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Your Weapon : ");
            char yourWeapon = sc.next().charAt(0);

            //Random Character Generator
            char[] choice = {'R', 'P', 'S'};
            Random random = new Random();
            int index = random.nextInt(choice.length);
            char randomChar = choice[index];
            System.out.println("Computer Weapon is : " + randomChar);

            // Checking who's Winner
            if (yourWeapon == 'R' && randomChar == 'S') {
                System.out.println("You Win");
            } else if (yourWeapon == 'P' && randomChar == 'R') {
                System.out.println("You Win");
            } else if (yourWeapon == 'S' && randomChar == 'P') {
                System.out.println("You Win");
            } else if (randomChar == 'R' && yourWeapon == 'S') {
                System.out.println("You Loss");
            } else if (randomChar == 'P' && yourWeapon == 'R') {
                System.out.println("You Loss");
            } else if (randomChar == 'S' && yourWeapon == 'P') {
                System.out.println("You Loss");
            } else if (randomChar == 'R' && yourWeapon == 'R') {
                System.out.println("Match Draw");
            } else if (randomChar == 'P' && yourWeapon == 'P') {
                System.out.println("Match Draw");
            } else if (randomChar == 'S' && yourWeapon == 'S') {
                System.out.println("Match Draw");
            }
        }
    }
}
