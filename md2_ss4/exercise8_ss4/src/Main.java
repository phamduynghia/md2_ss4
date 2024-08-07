
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_EMPLOYEES = 5;
        Employee[] employees = new Employee[NUM_EMPLOYEES];

        for (int i = 0; i < NUM_EMPLOYEES; i++) {
            System.out.println("Entering details for employee " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].inputData();
        }

        System.out.println("Employee details:");
        for (Employee employee : employees) {
            employee.displayData();
        }
    }
}
