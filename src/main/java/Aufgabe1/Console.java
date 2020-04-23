
package Aufgabe1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Console {

    //aus ihrem Github
    public int readIntegerFromStdin(String text) throws Exception {
        System.out.println(text);
        do {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                return Integer.parseInt(bufferedReader.readLine());
            } catch (NumberFormatException ex) {
                System.out.println("Not a number !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public String readStringFromStdin(String text) {
        System.out.println(text);
        do {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                return bufferedReader.readLine();
            } catch (NumberFormatException ex) {
                System.out.println("Not a valid string!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);

    }

    public int consoleMenue() {
        System.out.println("Console-Application: Exercise-1\n" +
                " 1. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm subtraction\n" +
                " 2. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm subtraction\n" +
                " 3. Greatest Common Divisor (GCD) - (Recursive) Euclid's algorithm division rest\n" +
                " 4. Greatest Common Divisor (GCD) - (Iterative) Euclid's algorithm division rest\n" +
                " 5. Sieve of Eratosthanes\n" +
                " 0. Exit\n" +
                " Please enter a number for an option:");
        do {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                int i = Integer.parseInt(bufferedReader.readLine());
                if (i <= 5 && i >= 0) return i;
                else System.out.println("keine Gültige Option");
            } catch (NumberFormatException ex) {
                System.out.println("Not a number !");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);

    }
}
