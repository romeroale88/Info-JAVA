package Empleado;

import java.util.*;

public abstract class EmpleadoUtil {

    /**
     * This method returns a employees list where
     * his last name begin with an specific letter
     * @param employees
     * @param letter
     * @return
     */
    public static List<Empleado> getEmployeesByFirstLetterLastname(List<Empleado> employees, String letter) {
        List<Empleado> employeeList = new ArrayList<>();
        for (Empleado employee : employees) {
            if (letter.equalsIgnoreCase(String.valueOf(employee.getLastname().charAt(0))))
                employeeList.add(employee);
        }

        return employeeList;
    }

    /**
     * This method returns a map with
     * the most old employee and
     * the most young employee
     * @param employees
     * @return
     */
    public static Map<String, Empleado> getEmployeesOldYoung(List<Empleado> employees) {
        Map<String, Empleado> employeesMap = new HashMap<>();
        employees.sort(Comparator.comparing(Empleado::getAge));

        employeesMap.put("Young", employees.get(0));
        employeesMap.put("Old", employees.get(employees.size() - 1));
        return employeesMap;
    }

    /**
     * Returns 2 employees with the
     * best and poor salary
     * @param employees
     * @return
     */
    public static Map<String, Empleado> getEmployeesBestPoorSalary(List<Empleado> employees) {
        Map<String, Empleado> employeesMap = new HashMap<>();
        employees.sort(Comparator.comparing(Empleado::getSalary));

        employeesMap.put("Poor", employees.get(0));
        employeesMap.put("Best", employees.get(employees.size() - 1));
        return employeesMap;
    }

    /**
     * Returns the same list of employees
     * but sorted by name and lastname
     * @param employees
     * @return
     */
    public static List<Empleado> sortByNameLastname(List<Empleado> employees) {
        employees.sort(Comparator.comparing(Empleado::getName).thenComparing(Empleado::getLastname));
        return employees;
    }
}
