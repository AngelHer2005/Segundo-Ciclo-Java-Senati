import java.util.Scanner;
public class ejercicio_09 {
    public static void main(String[] args) {
        int n1;Scanner input;
        //Número a ASCII
        input=new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        n1 = input.nextInt();
        System.out.println("El número "+n1+" tiene como carácter ASCII: "+((char)n1));
        input.close();
    }
}
