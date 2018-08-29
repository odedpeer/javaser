package problem;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private List<Employee> employees = new ArrayList<Employee>();

    public Factory() {
        // create the employees
        employees.add(new Employee(1, "Monty Burnes", 100, DepartmentDAO.getDepartment(1)));
        employees.add(new Employee(2, "Waylon smithers", 10, DepartmentDAO.getDepartment(1)));
        employees.add(new Employee(3, "Homer Simpson", 1, DepartmentDAO.getDepartment(1)));
        employees.add(new Employee(4, "Marge Simpson", 1, DepartmentDAO.getDepartment(2)));
        employees.add(new Employee(5, "Disco Stu", 1, DepartmentDAO.getDepartment(1)));
        employees.add(new Employee(6, "Lisa Simpson", 1, DepartmentDAO.getDepartment(2)));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Product buildProduct() {
        return new Product();
    }
}
