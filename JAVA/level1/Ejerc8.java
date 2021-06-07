package level1;

import java.util.Scanner;

/* 
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}

*/

public class Ejerc8 {

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar Nombre y Apellido: ");
        String nom = scan.nextLine();
        
        System.out.println("Ingresar Edad: ");
        int edad = scan.nextInt();

        System.out.println("Ingresar Direccion: ");
        String dire = scan.nextLine();

        System.out.println("Ingresar Ciudad: ");
        String ciudad = scan.nextLine();

        System.out.println(ciudad+"-"+dire+"-"+edad+"-"+nom);;
    }

    
}
