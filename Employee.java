class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInformation() {
        System.out.println(name + " " + yearOfJoining + " " + address);
    }
}

public class EmployeeInformation {
    public static void main(String[] args) {
        // Create three Employee objects
        Employee employee1 = new Employee("Robert", 1994, "64C- Walls Street");
        Employee employee2 = new Employee("Sam", 2000, "68D- Walls Street");
        Employee employee3 = new Employee("John", 1999, "26B- Walls Street");

        // Display information of the employees
        System.out.println("Name\tYear of Joining\tAddress");
        employee1.displayInformation();
        employee2.displayInformation();
        employee3.displayInformation();
    }
}