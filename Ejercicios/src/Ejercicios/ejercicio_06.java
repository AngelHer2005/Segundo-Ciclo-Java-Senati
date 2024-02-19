import java.util.Scanner;
public class ejercicio_06 {
    public static void main(String[] args) {
        double base,exponente;Scanner input;
        System.out.println("Hallar potencia");
        input = new Scanner(System.in);
        System.out.println("Ingresa la base de la potencia: ");
        base = input.nextDouble();
        System.out.println("Ingresa el exponente de la potencia: ");
        exponente = input.nextDouble();

        System.out.println("El resultado es: "+(Math.pow(base,exponente)));
        input.close();
    }
}
