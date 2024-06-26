package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Integer payDay;
    private Address address;
    private List<Employee> employees = new ArrayList<>();

    public Department(){
    }

    public Department(String name, Integer payDay, Address address) {
        this.name = name;
        this.payDay = payDay;
        this.address = address;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public double payroll(){
        double sum = 0.0;
        for (Employee emp : employees){
            sum +=emp.getSalary();
        }
        return sum;
    }

    public String getName() {
        return name;
    }

    public Integer getPayDay() {
        return payDay;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Address getAddress() {
        return address;
    }
}
