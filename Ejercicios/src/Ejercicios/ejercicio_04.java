import java.util.Scanner;
public class ejercicio_04 {
    public static void main(String[] args) {
        int n1,n2;Scanner input;
        System.out.println("Hallar el cociente y el residuo de 2 números");
        input = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        n1 = input.nextInt();
        System.out.println("Ingresa el segundo número: ");
        n2 = input.nextInt();

        System.out.println("El cociente de ambos números es: "+(n1/n2)+"\nY el residuo es: "+(n1%n2));
        input.close();
    }
}
