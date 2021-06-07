package level1;

import java.util.Scanner;

//Realizar un programa que calcule el factorial de un número:
//n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
//Sin hacer uso de librerías.

public class Ejerc4 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int n = scan.nextInt();
        int f = 1;

        for(int i=1; i<=n;i++){
            f = f*i;
        }
        System.out.println("El factorial de "+n+" es: "+f);;
    }
}
