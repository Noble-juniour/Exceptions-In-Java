package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Input a number: ");
                float input = reader.nextFloat();
                System.out.println("you input the number " + input);
                System.out.println("\r\n");
            }
            catch (InputMismatchException e)
            {
                System.out.println("You passed invalid input. Not a float");
                e.printStackTrace(System.out);
                System.out.println("\r\n");
               // reader.nextLine();
            }
            finally
            {
            reader.nextLine();
            }

        }
    }
}
