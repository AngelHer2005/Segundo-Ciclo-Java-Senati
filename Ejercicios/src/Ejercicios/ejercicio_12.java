package Lunes;

import java.util.Scanner;

public class ejercicio_12 {
    public static void main(String[] args) {
        double temperatura=0;Scanner input; boolean validor = true;
		input = new Scanner(System.in);
		while (validor==true){
            try {
                System.out.println("\nIngresa la temperatura actual: ");
                temperatura = input.nextDouble();
                validor=false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Se detectó un valor inválido. Ingresa un valor entero o flotante.");input.next();
            }
        } 
		if(temperatura<10){
			System.out.println("El clima está frío.");
		}else{if(temperatura>=10 && temperatura <=20){
			System.out.println("El clima está nublado.");
		}else{if(temperatura>20 && temperatura <=30){
			System.out.println("El clima está caluroso.");
		}else{if(temperatura>30){
			System.out.println("El clima está tropical.");
				}
			}
		}
		}
        input.close();
    }
}
