package problem;

public class Employee {

    private Integer id;
    private String name;
    private long salary;
    private Department department;

    public Employee(Integer id, String name, long salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", department=" + department + "]";
    }

}
