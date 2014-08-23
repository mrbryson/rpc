package com.company;

import java.io.Console;
import java.util.Random;
import java.util.Scanner;

public class RPS {
    static int cookies = 0;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true) {
            int validInput = -1;

            while (validInput < 0) {
                System.out.print("Rock, Paper, or Scissors: ");
                String input = in.nextLine();
                validInput = validateInput(input);
                if (validInput < 0) {
                    System.out.println("Invalid input, please try again.");
                }
            }

            int cpNum = getRandomNum();

            System.out.printf("You chose %s, the computer chose %s.\n", printChoice(validInput), printChoice(cpNum));

            printWinner(validInput, cpNum);
        }
    }

    public static int validateInput(String input) {
        input = input.toLowerCase();

        if (input.equals("rock")) {
            return 0;
        } else if (input.equals("paper")) {
            return 1;
        } else if (input.equals("scissors")) {
            return 2;
        } else {
            return -1;
        }
    }

    public static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public static String printChoice(int number) {
        if (number == 0) {
            return "rock";
        } else if (number == 1) {
            return "paper";
        } else if (number == 2) {
            return "scissors";
        } else {
            return "cookie";
        }
    }

    public static void printWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            System.out.println("It's a tie, you both get one cookie.");
            cookies += 1;
            System.out.println("You have " + cookies + " in counting");
        } else if (playerChoice == 0) {
            if(computerChoice == 1) {
                System.out.println("You Lose, no cookies for you!");
                cookies += 0;
                System.out.println("You have " + cookies + " in counting");
            } else {
                System.out.println("You win!  Have two cookies!");
                cookies += 2;
                System.out.println("You have " + cookies + " in counting");
            }
        } else if (playerChoice == 1) {
            if(computerChoice == 2) {
                System.out.println("You Lose, no cookies for you!");
                cookies += 0;
                System.out.println("You have " + cookies + " in counting");
            } else {
                System.out.println("You win!  Have two cookies!");
                cookies += 2;
                System.out.println("You have " + cookies + " in counting");
            }
        } else if (playerChoice == 2) {
            if(computerChoice == 0) {
                System.out.println("You Lose, no cookies for you!");
                cookies += 0;
                System.out.println("You have " + cookies + " in counting");
            } else {
                System.out.println("You win!  Have two cookies!");
                cookies += 2;
                System.out.println("You have " + cookies + " in counting");
            }
        }
    }
}
