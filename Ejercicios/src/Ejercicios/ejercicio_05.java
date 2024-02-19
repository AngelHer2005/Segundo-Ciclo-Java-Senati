import java.util.Scanner;
public class ejercicio_05 {
    public static void main(String[] args) {
        int producto;Scanner input;
        input = new Scanner(System.in);
        System.out.println("Ingresa el producto: ");
        producto= input.nextInt();
        System.out.println("El total del producto con el IGV es: "+(producto*1.18));
        input.close();
}
}