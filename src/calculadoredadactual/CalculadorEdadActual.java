/*
Pide al usuario su nombre y su año de nacimiento. Calcula su edad actual y muestra un mensaje con su nombre y edad.
*/
package calculadoredadactual;

import java.util.Scanner;

public class CalculadorEdadActual {
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        String nombre = " ";
        int añoNacimiento = 0;
        int edadActual = 0;
        
        System.out.println("Ingresa tu nombre: ");
        nombre = read.nextLine();
        
        System.out.println("Ingresa tu año de nacimiento");
        añoNacimiento = read.nextInt();
        
        edadActual = 2025 - añoNacimiento;
        
        System.out.println("Hola "+nombre+" tienes "+edadActual+" años");
        
        
        
    }
    
}
