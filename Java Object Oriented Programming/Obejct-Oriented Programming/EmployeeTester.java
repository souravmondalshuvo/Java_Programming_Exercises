public class EmployeeTester {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee employee2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);

        System.out.println("\nEmployee Details: ");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        employee1.raiseSalary(8);
        employee2.raiseSalary(12);

        System.out.println("\nAfter raising salary: ");
        
        System.out.println("\n8% for 'Franziska Waltraud': ");
        employee1.printEmployeeDetails();
        System.out.println("\n12% for 'Hubertus Andrea': ");
        employee2.printEmployeeDetails();

    }
}