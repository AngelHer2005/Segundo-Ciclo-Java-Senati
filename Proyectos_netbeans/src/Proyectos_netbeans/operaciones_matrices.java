package matrices.y.tarea.pkg4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Tarea_4 {
    public static void main(String[] args) throws Exception {
        Scanner input;boolean validor=true,a=true;int decision;
        System.out.println("                       SUMA, RESTA O MULTIPLICACIÓN DE MATRICES\nHola! A continuación se te mostrará unas cuantas opciones para realizar una suma, resta o multiplicación de 2 matrices de 3x3. \nPor favor, rellena todo.");
        int [][] m1=new int[3][3];
        int [][] m2= new int[3][3];
        int [][] m3=new int[3][3];
        input=new Scanner(System.in);
        char matriz='A';
        while (a){
        System.out.println("Ingresa un número para la matriz "+matriz+".");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Posición ("+i+","+j+"):");
                while(true){
                    try {
                        if(validor){
                        m1[i][j]=input.nextInt();
                        }else{
                        m2[i][j]=input.nextInt();
                        }break;
                    } catch (InputMismatchException e) {
                        System.out.println("Se detectó un dato inválido. Ingresa de nuevo, por favor.");
                    }
                }
            }
        }
        if (validor){
            System.out.println("\nMatriz A");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(m1[i][j]+" ");
            }System.out.println();matriz='B';
        }validor = false;
        }else{
            System.out.println("\nMatriz B");matriz='B';
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(m2[i][j]+" ");
                }
            System.out.println();
            }a=false;
        }
        }
        System.out.println("\nElige una opción:\n1. Suma:\n2. Resta:\n3. Multiplicación:\n");
        while (true){
            try {
                decision = input.nextInt();break;
            } catch (InputMismatchException e) {
                System.out.println("Se detectó un dato inválido. Ingresa de nuevo, por favor.");
            }
        }
        while(validor==false){
            if(decision==1){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    m3[i][j]=m1[i][j]+m2[i][j];
                }
            }
        }else{if(decision==2){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    m3[i][j]=m1[i][j]-m2[i][j];
                }
            }
        }else{if(decision==3){
            int row = m1.length;
            int cola = m1[0].length;
            int colb = m2[0].length;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < colb; j++) {
                    int sum = 0;
                    for (int k = 0; k < cola; k++) {
                        sum += m1[i][k] * m2[k][j];
                    }
                    m3[i][j] = sum;
                }
            }
        }}}
        System.out.println("\nResultado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d ", m3[i][j]);
            }
        System.out.println();
        }
        break;
        }System.out.println("PROGRAMA FINALIZADO...");
        input.close();
    } 
}