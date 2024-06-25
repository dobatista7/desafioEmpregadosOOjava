package application;

import entities.Address;
import entities.Department;
import entities.Employee;
import util.ReportGenerator;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String departmentName = sc.nextLine();
        System.out.print("Dia do pagamento: ");
        int payDay = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        Address address = new Address(email,phone);
        Department dept = new Department(departmentName,payDay,address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Dados do funcionário " + i + ":");
            sc.nextLine();
            System.out.print("Nome: ");
            String employeeName = sc.nextLine();
            System.out.print("Salário: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(employeeName,salary);
            dept.addEmployee(emp);
        }

        ReportGenerator.showReport(dept);

        sc.close();

        }
    }
