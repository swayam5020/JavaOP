import java.util.*;
interface Gross{
    double calculateGrossSalary();
}
class Employee{
    String name;
    double bSalary;
    Employee(String name, double basicSalary){
        this.name = name;
        this.bSalary = basicSalary;
    }
    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + bSalary);
    }
}
class Salary extends Employee implements Gross {
    Salary(String name, double basicSalary) {
        super(name, basicSalary);
    }
    public double calculateGrossSalary() {
        return bSalary + (0.2 * bSalary) + (0.1 * bSalary); // Basic + HRA + DA
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: "); 
        String name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();
        Salary emp = new Salary(name, basicSalary);
        emp.display();
        System.out.println("Gross Salary: " + emp.calculateGrossSalary());
        sc.close();
    }
}
