package learnJava;
import java.util.Scanner;
import java.util.Random;

public class HW_t20_RockPaperScissors {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);   // For using Scan
        System.out.println("Welcome to ROCK PAPER SCISSORS GAME");
        System.out.println("Made by SWAYAM");

        ////////// CODE FOR PLAYER ///////////

        System.out.println("Use 0 ---> for ROCK");
        System.out.println("Use 1 ---> for PAPER");
        System.out.println("Use 2 ---> for SCISSORS");
        int selected = Sc.nextInt();
        switch (selected) {
            case 0:
                System.out.printf("You have choose \nROCK\n");
                break;
            case 1:
                System.out.printf("You have choose \nPAPER\n");
                break;
            case 2:
                System.out.printf("You have choose \nSCISSORS\n");
                break;
        }

        //////   CODE FOR COMPUTER /////////

        // Creating random object to use
        Random ran = new Random();

        // Generating integer
        int generated = ran.nextInt(3);
        // System.out.println(generated); ---> For computer
        System.out.println("Computer have choose");

        switch (generated) {
            case 0:
                System.out.println("ROCK");
                break;
            case 1:
                System.out.println("PAPER");
                break;
            case 2:
                System.out.println("SCISSORS");
                break;


        }

        // Conditional coding for Game

        if (selected == generated) {        // Rock-0,Paper-1,Scissors-2
            System.out.println("Its a Draw");
        } else if (selected == 0 && generated == 1) {
            System.out.println("Computer won the round");
        } else if (selected == 0 && generated == 2) {
            System.out.println("You won the round!!");
        } else if (selected == 1 && generated == 0) {
            System.out.println("You won the round!!");
        } else if (selected == 1 && generated == 2) {
            System.out.println("Computer won the round");
        } else if (selected == 2 && generated == 0) {
            System.out.println("Computer won the round");
        } else {
            System.out.println("Computer won the round");
        }
    }
}













