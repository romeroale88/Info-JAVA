package level2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Dados 2 ArrayList que contienen horas-trabajadas (array1) y 
valor-por-hora(array2) del resumen de carga de horas semanal
de un empleado. Se debe generar otra lista que contenga los totales
y luego imprimir el total final a cobrar.

*/
public class Ejerc5 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] dias = new String[]{"Lunes","Martes","Miercoles","Jueves","Viernes"};
        ArrayList<Integer> horas = new ArrayList<>();
        ArrayList<Integer> precio = new ArrayList<>();

        for(int i = 0;i <5;i++){
            System.out.println(dias[i]);
            System.out.println("Cantidad de horas trabajadas: ");
            horas.add(scan.nextInt());
            System.out.println("Precio de horas trabajadas: ");
            precio.add(scan.nextInt());
        }
        ArrayList<Integer> total = new ArrayList<>();
        for(int i= 0; i <5;i++){
            total.add(horas.get(i) * precio.get(i));
        }
        int cant = 0;
        for(int i=0;i<5;i++){
            cant = cant+total.get(i);
            System.out.println(dias[i]+": "+ total.get(i));
        }

        System.out.println("\nTotal: "+cant);
    }
}
