/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices.y.tarea.pkg4;

/**
 *
 * @author Alumno
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float datos[]={1,2,3,4};
        System.out.println(media(datos,datos.length));
        
        
    }
    static float media (float datos[],int n){
    int i;
    float suma = 0;
    for(i=0;i<n;i++)
        suma+=datos[i];
    return suma/n;
}
}
