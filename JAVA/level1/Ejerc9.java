package level1;

import java.util.Scanner;

/* 
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que 
aparece una letra dada.
*/

public class Ejerc9 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar texto: ");
        String text = scan.nextLine();

        System.out.println("Ingresar letra deseada: ");
        char letra = scan.nextLine().charAt(0);

        int cont = 0;

        for(int i=0;i< text.length();i++){
            if(letra == text.charAt(i)){
                cont ++;
            }
        }
        System.out.println("Cantidad de letra "+letra+" es: "+cont);
    }
}
