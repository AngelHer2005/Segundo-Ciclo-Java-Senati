// Realizar la suma, resta, multiplicacion, division y resto de 2 numeros
import java.util.Scanner; 
public class ejercicio_08 {
    public static void main(String[] args) {
        int a,b,c; Scanner input;  
        float d,e,f;
        input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        a =input.nextInt();
        System.out.println("Ingrese el segundo numero");
        b =input.nextInt();
        c=a+b;    
        System.out.println("La suma es: "+c);
        d=(float) (a-b);
        System.out.println("la resta es:"+d );
        e =(float)(a*b);
        System.out.println("la multiplicacion es:" +e);
        f=(float)(a/b);
            System.out.println("La division es: " +f);
        input.close();
            
    }}
        
