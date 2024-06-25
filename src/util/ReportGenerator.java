package util;

import entities.Department;
import entities.Employee;

public class ReportGenerator {

    public static void showReport(Department dept){
        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO: ");
        System.out.println("Departamento " + dept.getName() + " = R$ " + String.format("%.2f", dept.payroll()));
        System.out.println("Pagamento realizado no dia " + dept.getPayDay());
        System.out.println("Funcionários:");
        for (Employee emp : dept.getEmployees()) {
            System.out.println(emp.getName());
        }
        System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());
    }
}
