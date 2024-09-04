import java.util.Scanner;
//program to interface Taxable with members
public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept Employee information
        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(empId, name, salary);
        employee.calcTax();

        // Accept Product information
        System.out.print("Enter Product ID: ");
        int pid = scanner.nextInt();
        System.out.print("Enter Product Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = scanner.nextInt();
        Product product = new Product(pid, price, quantity);
        product.calcTax();

        scanner.close();
    }
}
interface Taxable {
    double salesTax = 0.07;
    double incomeTax = 0.105;

    void calcTax();
}

