package org.mcreynolds.homework;

import java.util.Scanner;

/**
 * Created by cs186081 on 26/03/2018.
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a password
        System.out.println("Please enter a password: ");
        String password = input.nextLine();

        // Print "Valid" or "Invalid"
        if (PasswordValidator2.isValid(password)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}
