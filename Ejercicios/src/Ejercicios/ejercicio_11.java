package Lunes;

import java.util.Scanner;

public class ejercicio_11 {
    public static void main(String[] args) {
        int valor = 0; Scanner input;boolean validor = true;
		input=new Scanner(System.in);
        System.out.println("Debido al éxito que obtuvo el restaurante con su última acción, decidió agregar un 10% para consumos menores o iguales a S/. 100, 20% para consumos menores o iguales a S/. 200 y 30% para consumos mayores. Se seguirá usando el impuesto del 18%.");
		while (validor==true){
            try {
                System.out.println("\nIngresa el valor total de todos tus pedidos: ");
                valor = input.nextInt();
                validor=false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Se detectó un valor inválido. Ingresa un valor entero o flotante.");input.next();
            }
        } 
		if (valor<=100){
			System.out.println("El monto de descuento con un descuento del 10% es: S/. "+(valor*0.9)+", el importe de impuesto es del 18% y el importe a pagar es: S/. "+(Math.round((valor*0.9)*1.18))+".");
			
		}else{if(valor>100 && valor<200){
			System.out.println("El monto de descuento con un descuento del 20% es: S/."+(valor*0.8)+", el importe del impuesto es del 18% y el importe a pagar es: S/. "+(Math.round((valor*0.8)*1.18))+".");
			
		}else{if(valor>=200){
			System.out.println("El monto de descuento con un descuento del 30% es: S/. "+(valor*0.7)+", el importe de impuesto es del 18% y el importe a pagar es: S/. "+(Math.round((valor*0.7)*1.18))+".");
		        }
			}
	    }
        input.close();
    }
}
