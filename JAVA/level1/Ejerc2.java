package level1;

import java.util.Scanner;

//Realizar un programa que solicite por consola 2 números enteros.
// Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.

public class Ejerc2 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese numero 1: ");
        int a = scan.nextInt();
        System.out.print("Ingrese numero 2: ");
        int b = scan.nextInt();

        System.out.println(a+"+"+b+" es : "+(a+b));
        System.out.println(a+"-"+b+" es : "+(a-b));
        System.out.println(a+"*"+b+" es : "+(a*b));
        System.out.println(a+"/"+b+" es : "+(a/b));
        System.out.println(a+"%"+b+" es : "+(a%b));
    }
    
}
