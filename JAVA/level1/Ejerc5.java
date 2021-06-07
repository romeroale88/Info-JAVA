package level1;

import java.util.Scanner;

//Se desea una aplicación que solicite 2 números enteros y realice la operación 
//de multiplicación por sumas sucesivas (sin uso de librerías).

public class Ejerc5 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        int a = scan.nextInt();

        System.out.println("Ingrese numero 2: ");
        int b = scan.nextInt();

        int sum=0;
        for(var i=0; i<b;i++){
            sum = sum+a;
        }
        System.out.println("La multiplicacion es: "+sum);
    }
}
