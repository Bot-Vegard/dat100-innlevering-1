package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            int poeng;
            
            while (true) {
                System.out.println("Skriv inn poeng:");
                poeng = scanner.nextInt();
                
                if (poeng >= 0 && poeng <= 100) {
                    break;
                } 
                else {
                    System.out.println("Feilmelding, skriv et tall mellom 0 og 100.");
                }
            }

            if (poeng >= 90) {
                System.out.println("Karakter: A");
            } 
            else if (poeng >= 80) {
                System.out.println("Karakter: B");
            } 
            else if (poeng >= 60) {
                System.out.println("Karakter: C");
            } 
            else if (poeng >= 50) {
                System.out.println("Karakter: D");
            } 
            else if (poeng >= 40) {
                System.out.println("Karakter: E");
            } 
            else {
                System.out.println("Karakter: F");
            }
        }
        
        scanner.close();
    }
}