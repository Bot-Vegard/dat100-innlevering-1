package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.print("Fakultet av tall: ");
    	int x = scanner.nextInt();
    	
    	int fakultet= 1; 
    	// Kunne også ha brukt "long" istedenfor "int" her men vet ikke om vi har gått gjennom det...
    	
    	for (int i = 1; i <= x; i++) {
    		fakultet *= i;
    		
    	}
    		
    	System.out.println("Fakultetet av " + x + "er: " + fakultet);
    	
    	scanner.close();
    
    
    }
}
