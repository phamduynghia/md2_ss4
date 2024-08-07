
import java.util.Scanner;

public class Employee {

    private String employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double rate;
    private double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, String gender, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
        calSalary();
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        this.employeeId = scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        this.employeeName = scanner.nextLine();

        System.out.print("Enter Age: ");
        this.age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Gender (M/F): ");
        this.gender = scanner.nextLine();

        System.out.print("Enter Rate: ");
        this.rate = scanner.nextDouble();
        scanner.nextLine();

        calSalary();
    }

    private void calSalary() {
        this.salary = rate * 1_300_000;
    }

    public void displayData() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Rate: " + rate);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}


