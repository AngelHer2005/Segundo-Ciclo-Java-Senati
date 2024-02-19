import java.util.Scanner;
public class ejercicio_02 {
    public static void main(String[] args) {
        int altura,base;Scanner input;
        System.out.println("Hallar el área del triángulo");
        input = new Scanner(System.in);
        System.out.println("Ingresa la altura del triángulo: ");
        altura = input.nextInt();
        System.out.println("Ingresa la base del triángulo: ");
        base = input.nextInt();

        System.out.println("El área del triángulo con los datos recibidos es: "+(altura*base)/2);
        input.close();
}
    
}
