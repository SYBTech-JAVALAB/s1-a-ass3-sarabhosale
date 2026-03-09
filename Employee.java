import java.util.Scanner;

public class Employee {

    private int employeeID;

    public Employee(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double calculateSalary(int hoursWorked, double rate) {
        return hoursWorked * rate;
    }

    public double calculateSalary(double salary, double bonus) {
        return salary + bonus;
    }

    public double calculateSalary(double monthlySalary) {
        return monthlySalary * 12;
    }

    public double calculateSalary(int hoursWorked, double rate, double overtime) {
        return (hoursWorked * rate) + overtime;
    }

    public double calculateSalary(double salary, double deduction, boolean flag) {
        return salary - deduction;
    }

    public double calculateSalary(double salary, double bonus, double deduction) {
        return salary + bonus - deduction;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        Employee[] emp = new Employee[n];

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter Employee ID:");
            int id = sc.nextInt();

            emp[i] = new Employee(id);

            System.out.println("Employee ID: " + emp[i].getEmployeeID());

            System.out.print("Enter hours worked: ");
            int hours = sc.nextInt();

            System.out.print("Enter rate per hour: ");
            double rate = sc.nextDouble();

            System.out.println("Salary = " + emp[i].calculateSalary(hours, rate));

            System.out.print("Enter basic salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();

            System.out.println("Salary with bonus = " + emp[i].calculateSalary(salary, bonus));

            System.out.print("Enter monthly salary: ");
            double monthly = sc.nextDouble();

            System.out.println("Annual salary = " + emp[i].calculateSalary(monthly));

            System.out.print("Enter overtime: ");
            double overtime = sc.nextDouble();

            System.out.println("Salary with overtime = " + emp[i].calculateSalary(hours, rate, overtime));

            System.out.print("Enter deductions: ");
            double deduction = sc.nextDouble();

            System.out.println("Salary after deduction = " + emp[i].calculateSalary(salary, deduction, true));

            System.out.println("Salary with bonus and deduction = "
                    + emp[i].calculateSalary(salary, bonus, deduction));

            System.out.println("-----------------------------");
        }
    }
}
