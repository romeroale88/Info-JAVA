package Empleado;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        List<Empleado> employeeList = loadEmployees();

        System.out.println("Empleados con una letra especifica en el apellido.");
        for (Empleado e: EmpleadoUtil.getEmployeesByFirstLetterLastname(employeeList, "S")) {
            System.out.println(e);
        }

        System.out.println("\nEmpleado más viejo y empleado más joven.");
        Map<String, Empleado> oldYoungMap = EmpleadoUtil.getEmployeesOldYoung(employeeList);
        oldYoungMap.forEach((k,v) -> System.out.println(k +
                ":\nEmpleado: " + v.getName() + " " + v.getLastname() +
                " - Edad: " + v.getAge()));

        System.out.println("\nEmpleado con mejor y peor salario.");
        Map<String, Empleado> bestPoorSalariesMap = EmpleadoUtil.getEmployeesBestPoorSalary(employeeList);
        bestPoorSalariesMap.forEach((k,v) -> System.out.println(k +
                ":\nEmpleado: " + v.getName() + " " + v.getLastname() +
                " - Salario: " + v.getSalary()));

        System.out.println("\nLista de empleados ordenados alfabeticamente por nombre y apellido.)");
        for (Empleado e: EmpleadoUtil.sortByNameLastname(employeeList)) {
            System.out.println(e);
        }
    }

    public static List<Empleado> loadEmployees() {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String[] employee;
        List<Empleado> employeeList = new ArrayList<>();

        try {
            file = new File("src/Propuestos/Employees/employees.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                employee = line.split(",");
                employeeList.add(new Empleado(employee[0], employee[1], employee[2], employee[3]));
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (null != fileReader)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return employeeList;
    }
}
