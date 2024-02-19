package com.angel.model;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class ejercicio_13 {
    public static void main(String[] args) {
        Scanner yes = new Scanner(System.in);
        System.out.println("Ingresa el año, mes y día en que naciste para decirte que edad tienes: ");
        int year = yes.nextInt();
        int month = yes.nextInt();
        int day = yes.nextInt();
        int current_y = 2023;
        int current_m = 10;
        int current_d = 1;
        boolean a = true;
        boolean b = true;
        boolean c = true;
        while (a == true || b== true || c == true) {
            if(current_d>day && a == true){current_d-=day;a = false;}else{if(a==true){
                current_d+=mes(month);
                current_m-=1;
                } 
            }if(current_m>month){current_m-=month;b=false;}else{if(b==true){
                current_m+=12;
                current_y-=1;
            }}if(c==true){current_y-=year;c=false;}
        }
        System.out.println("Año: "+current_y+"\nMes: "+current_m+"\nDía: "+current_d);
        yes.close();
        
    }
    public static int mes(int n){
        Map<Integer,Integer> diccionario = new HashMap<>();
        diccionario.put(1,31);
        diccionario.put(2,29);
        diccionario.put(3,31);
        diccionario.put(4,30);
        diccionario.put(5,31);
        diccionario.put(6,30);
        diccionario.put(7,31);
        diccionario.put(8,31);
        diccionario.put(9,30);
        diccionario.put(10,31);
        diccionario.put(11,30);
        diccionario.put(12,31);
        return diccionario.get(n);
    }
}
