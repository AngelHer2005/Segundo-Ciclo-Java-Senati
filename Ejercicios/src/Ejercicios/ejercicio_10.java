
package Lunes;

import java.util.Scanner;

public class ejercicio_10 {
    public static void main(String[] args) {
        int valor = 0; Scanner input;boolean validor = true;
		System.out.println("El restaurante ofrecerá un 10% para consumos menores o iguales a S/. 200 y 20% para consumos mayores. Para ambos se aplica el impuesto del 18%.");
		input = new Scanner(System.in);
        while (validor==true){
            try {
                System.out.println("\nIngresa el valor total de todos tus pedidos: ");
                valor = input.nextInt();
                validor=false;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Se detectó un valor inválido. Ingresa un valor entero o flotante.");input.next();
            }
        } 
		if(valor<=200){
            System.out.println("El monto de descuento con un descuento del 20% es: S/. "+(valor*0.9)+" y el importe a pagar es: S/. "+(Math.round((valor*0.9)*1.18))+".");
		}else{
			System.out.println("El monto de descuento con un descuento del 20% es: S/. "+(valor*0.8)+" y el importe a pagar es: S/. "+(Math.round((valor*0.8)*1.18))+".");
		}
		System.out.println("Gracias por tu compra. Vuelve pronto!");
        input.close();
    }
}
