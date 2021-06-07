package level2;

import java.util.ArrayList;
import java.util.Scanner;

/*
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, 
luego imprimir por pantalla el ranking
*/
public class Ejerc1 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<>();

        boolean agregar = true;
        while(agregar){
            System.out.println("Agregar Ciudad: s / n");
            char a = scan.nextLine().charAt(0);

            if(a == 's'){
                System.out.println("Nombre de ciudad: ");
                ciudades.add(scan.nextLine());
            }else if(a == 'n'){
                agregar = false;
            }else{
                System.out.println("Opcion invalida");
                
            }

        }
        System.out.println("Ciudades favoritas: ");
        for(int i=0; i<ciudades.size();i++){
            System.out.println("#"+(i+1)+"-"+ciudades.get(i));
            
        }
    }
}
