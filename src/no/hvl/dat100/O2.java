package no.hvl.dat100;

import java.util.Scanner;

public class O2 {	

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("skriv inntekt");
        double skatt = scanner.nextDouble();
        
        if (skatt >= 0 && skatt <= 208050) {
            System.out.println("Ingen Trinnskatt");
        } 
        else if (skatt >= 208051 && skatt <= 292850) {
            double trinnskatt = (double) 0.017;
        	System.out.println("1.7 % trinnskatt antall kr = " + (skatt*trinnskatt));
        } 
        else if (skatt >= 292851 && skatt <= 670000) {
        	double trinnskatt = (double) 0.04;
            System.out.println("4 % trinnskatt antall kr = " + (skatt*trinnskatt));
        } 
        else if (skatt >= 670001 && skatt <= 937900) {
        	double trinnskatt = (double) 0.136;
            System.out.println("13.6 % trinnskatt antall kr = " + (skatt*trinnskatt));
        } 
        else if (skatt >= 937901 && skatt <= 1350000) {
        	double trinnskatt = (double) 0.166;
            System.out.println("16.6 % trinnskatt antall kr = " + (skatt*trinnskatt));
        }
        else if (skatt >= 1350001) {
        	double trinnskatt = (double) 0.176;
            System.out.println("17.6 %  trinnskatt antall kr = " + (skatt*trinnskatt));
        } 
        else {
            System.out.println("Feil prøv på nytt");
            }
    		
	        
	scanner.close();
	
    }
}
