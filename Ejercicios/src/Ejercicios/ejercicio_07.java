import java.util.Scanner;
public class ejercicio_07 {
    public static void main(String[] args) {
        Scanner input;
        System.out.println("Hallar radicación");
        input = new Scanner(System.in);
        System.out.println("Ingresa el radicando de la radicación: ");
        double radicando = input.nextDouble();
        System.out.println("Ingresa el el índice: ");
        int indice = input.nextInt();

        System.out.println("El resultado es: "+(Math.pow(radicando,1.0/indice)));
        input.close();
}
}
