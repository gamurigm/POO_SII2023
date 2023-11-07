package primeraexperienciaapp;

import java.util.Scanner;


public class HolaMundo {
   
    public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in); //Clase Scanner, Objeto sc 
         
         System.out.println("Ingrese numero 1: ");
         int num1 = sc.nextInt();
          System.out.println("Ingrese numero 2: ");
         int num2 = sc.nextInt();
         
         int suma = num1 + num2;
         System.out.println("La suma de: " + num1 + " y " + num2 +  " es: " + suma);
         
         /*
        System.out.println("Ingrese nombre: "); //Clase System, Objeto out 
        String nombre = sc.nextLine(); //metodo nextLine, clase String
        
        System.out.println("Hola " + nombre); //metodo printLn */
     
    }    
        
        
}
