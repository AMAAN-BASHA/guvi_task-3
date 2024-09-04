public class Employee implements Taxable {
    private String empId;
    private String name;
    private double salary;

    public Employee(String empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calcTax() {
        double tax = salary * incomeTax;
        System.out.println("Income Tax for " + name + " (ID: " + empId + "): " + tax);
    }
}
