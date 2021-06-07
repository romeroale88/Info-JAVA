package level1;

import java.util.Scanner;

//Realizar un Programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. 
//Sin uso de métodos o librerías que realicen toUppercase().
public class Ejerc7 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar texto a transformar: ");
        String text = scan.nextLine();
        char letra; 

        for (int i=0; i<text.length();i++){
            letra = text.charAt(i);
            if(letra >=97 && letra <=122){
                letra -=32;
            }
            System.out.print(letra);
        }
    }
}
