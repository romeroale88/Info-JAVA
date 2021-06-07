package level2;

import java.util.ArrayList;
import java.util.List;

/*
Cargar un arrayList con 12 nombres de estudiantes (String), 
luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.

*/
public class Ejerc4 {
    
    public static void main(String[] args){
        ArrayList<String> estudiantes = new ArrayList<>();

        estudiantes.add("Juan1");
        estudiantes.add("Juan2");
        estudiantes.add("Juan3");
        estudiantes.add("Juan4");
        estudiantes.add("Juan5");
        estudiantes.add("Juan6");
        estudiantes.add("Juan7");
        estudiantes.add("Juan8");
        estudiantes.add("Juan9");
        estudiantes.add("Juan10");
        estudiantes.add("Juan11");
        estudiantes.add("Juan12");

        List<String> curso1 = estudiantes.subList(0,4);
        List<String> curso2 = estudiantes.subList(4,8);
        List<String> curso3 = estudiantes.subList(8,12);

        System.out.println("Curso 1: ");
        for(String estudiante : curso1){
            System.out.println(estudiante);
        }

        System.out.println("\nCurso 2: ");
        for(String estudiante : curso2){
            System.out.println(estudiante);
        }
        System.out.println("\nCurso 3: ");
        for(String estudiante : curso3){
            System.out.println(estudiante);
        }
    }
}
