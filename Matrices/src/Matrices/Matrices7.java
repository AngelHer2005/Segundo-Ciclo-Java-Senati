/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices.y.tarea.pkg4;

/**
 *
 * @author Alumno
 */
public class Matrices7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] num=new int[10][10];//Vamos a ver una matriz de 10x10
        for (int i = 0;i<10;i++){
            for(int t = 0;t<10;t++){
                num[i][t]=(int)(Math.random()*9);
            System.out.print(num[i][t]+" ");
            }System.out.println();
        }
        
        int[] resultado=new int[10];//se declara la variable como tipo entero
        for (int r = 0;r<10;r++){//modificamos las variables
            resultado[r]=0;//aca inicializamos cada vez que termine de sumar sea 0
            for (int z=0;z<10;z++){
                resultado[r]+=num[r][z];
            }System.out.println(resultado[r]+" ");//realizamos la operación
        }
        
    }
    
}
