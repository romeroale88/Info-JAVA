package level2;
/*
Se dispone de una lista de Empleados, de cada empleado se conoce:
Nombre y Apellido
DNI
horasTrabajadas
valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo
(horasTrabajadas x valorPorHora) de toda esa lista para luego almacenar en un Map 
(o Diccionario) donde la clave (key) es el dni y el valor (value) es el 
sueldo calculado. 

*/

import java.util.HashMap;
import java.util.HashSet;

public class Ejerc6 {
    
    public static void main(String[] args){
        HashSet<Empleado> empleadoHashSet = new HashSet<>();
        HashMap<Integer, Float> salarios = new HashMap<>();

        empleadoHashSet.add(new Empleado("Empl 1",20568433,4,350));
        empleadoHashSet.add(new Empleado("Empl 2",25545541,6,350));
        empleadoHashSet.add(new Empleado("Empl 3",29547266,2,350));

        for(Empleado emp : empleadoHashSet){
            salarios.put(emp.getDni(),emp.getSalario());
        }
        salarios.forEach((dni, salario)->System.out.println("DNI: "+dni+" - Sueldo: "+salario));
    }
}

class Empleado {
    String nomb;
    int dni;
    float horas;
    float precio;

    public Empleado( String nomb, int dni,float horas, float precio){
        this.nomb = nomb;
        this.dni = dni;
        this.horas = horas;
        this.precio = precio;
    }
    public int getDni(){
        return dni;
    }
    public float getSalario(){
        return this.horas * this.precio;
    }
}