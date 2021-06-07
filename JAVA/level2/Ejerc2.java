package level2;

import java.util.ArrayList;

/*
Crear un ArrayList, agregar 5 números enteros. Luego, 
agregar un número entero al principio de la lista y otro al final.
Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma
(antes y después de agregar a en la primera y última posición).
*/
public class Ejerc2 {
    
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(10);

        System.out.println("Lista");
        System.out.println("Tamaño: "+numeros.size());
        for(int i : numeros){
            System.out.println(i);
        }
        numeros.add(0,1);
        numeros.add(13);

        System.out.println("Lista modificada: ");
        System.out.println("Tamaño: "+numeros.size());
        for(int i: numeros){
            System.out.println(i);
        }
    }
}
