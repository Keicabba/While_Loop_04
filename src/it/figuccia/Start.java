package it.figuccia;

import java.lang.reflect.GenericDeclaration;
import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10) + 1; // Genera un numero casuale tra 1 e 10
        int guess = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome!");
        while (guess != number) {
            System.out.print("Guess the number (between 1 and 10): ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("Too low. Try again!");
                } else if (guess > number) {
                    System.out.println("Too high. Try again!");
                }
            } else {System.out.println("Is not a number. Try again");
            scanner.next();}
        }
        System.out.println("Congratulations!");
    }
}
