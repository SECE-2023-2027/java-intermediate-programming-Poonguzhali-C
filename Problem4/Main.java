package Problem4;
import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = sc.next();

        System.out.print("Enter Employee Salary: ");
        double empSalary = sc.nextDouble();

        Employee emp = new Employee(empName, empSalary);

        System.out.print("Enter Manager Name: ");
        String mName = sc.next();

        System.out.print("Enter Manager Base Salary: ");
        double mSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        Manager m = new Manager(mName, mSalary, bonus);

        System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + m.calculateSalary());

        sc.close();

    }
    
}
