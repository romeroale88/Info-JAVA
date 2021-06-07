package level1;

import java.util.Scanner;

//Se desea una aplicación que solicite 2 números enteros y realice la operación
// de potencia (sin uso de librerías).

public class Ejerc6 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese valor 1: ");
        int a = scan.nextInt();

        System.out.println("Ingrese valor 2: ");
        int b = scan.nextInt();

        int prod = 1;
        for(var i=0; i<b; i++){
            prod = prod * a;
        }
        System.out.println("La potencia de "+a+" es: "+prod);
    }
}
