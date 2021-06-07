package level2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa
 (solo los valores, no figuras). Se deberá cargar el ArrayList (en orden),
 imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList
 y volver a imprimir.


*/

public class Ejerc3 {
    
    public static void main(String[] args){

        ArrayList<String> cartas = new ArrayList<>();
        for(int i=0;i <13;i++){
            cartas.add("Carta"+(i+1));
        }
        System.out.println("Ordenado");
        for(String carta : cartas){
            System.out.println(carta);
        }
        Collections.reverse(cartas);
        System.out.println("\nInverso");
        for(String carta : cartas){
            System.out.println(carta);
        }
        Collections.shuffle(cartas);
        System.out.println("\nMezclado");
        for(String carta : cartas){
            System.out.println(carta);
        }
    }
}
