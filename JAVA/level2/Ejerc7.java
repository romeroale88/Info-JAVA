package level2;

import java.util.Scanner;

/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo),
nos devuelva un array de Strings. Con la secuencia de números enteros de principio 
a final. Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo
de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 

*/

public class Ejerc7 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresar valor inicial: ");
        int ini = scan.nextInt();
        System.out.println("ingresar valor final: ");
        int fin = scan.nextInt();

        String[] arr = fizzBuzz(ini, fin);
        for(String str : arr){
            System.out.print(str + " - ");
        }

    }
    
    public static String[] fizzBuzz(int ini, int fin){
        
        String[] arr = new String[fin-1];
        arr[0] = String.valueOf(ini);
        for(int i =1; i< arr.length;i++){
            if(((ini +i) % 2 == 0) && ((ini +i) % 3 == 0)){
                arr[i] ="FizzBuzz";
            }else if((ini+i) % 3 ==0){
                arr[i] = "Buzz";
            }else if((ini+i) % 2 ==0){
                arr[i] = "Fizz";
            }else{
                arr[i] = String.valueOf(ini+i);
            }
        }
        return arr;
        
    }
}
