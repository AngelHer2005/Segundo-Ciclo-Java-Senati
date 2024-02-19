/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices.y.tarea.pkg4;

/**
 *
 * @author Alumno
 */
public class Matrices5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] datos=new int[10];
        int resultado=0;
        for(int i=0;i<10;i++){
            datos[i]=(int)(Math.random()*9);//da números aleatorios del 1 al 9
            resultado+=datos[i];
            System.out.println(datos[i]);
        }
        System.out.println("La suma de los valores es: "+resultado);
    }
    
}
