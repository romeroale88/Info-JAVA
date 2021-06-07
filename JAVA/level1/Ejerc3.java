package level1;

import java.util.Scanner;

//Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números
 //(incrementos de 1) de la siguiente forma:
public class Ejerc3 {
    
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero entero: ");
        int a = scan.nextInt();

        for(int i= 1; i<=a;i++){
            for(int j=1; j<=i;j++){
                String num=String.valueOf(j+" ");

                num=num.replaceAll("\n","");
                
                System.out.println(num);
            }
            System.out.println("");
        }
    }
}
