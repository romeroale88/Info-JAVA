package level1;

import java.util.Scanner;
// Solicitar por consola el nombre del usuario e imprimir por 
//pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
public class Ejerc1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese Nombre: ");
        String name = scan.nextLine();
        System.out.println("hola "+ name);
    }
}