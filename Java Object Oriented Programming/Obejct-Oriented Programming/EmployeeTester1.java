import java.time.LocalDate;
public class EmployeeTester1 {
    public static void main(String[] args) {
    
        Employee1 employee1 = new Employee1("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
        Employee1 employee2 = new Employee1("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
        Employee1 employee3 = new Employee1("Magdalena Artemon", 50000, LocalDate.parse("2011-01-05"));

        employee1.printEmployeeDetails();
        System.out.println("Years of Service: " + employee1.getYearsOfService());

        employee2.printEmployeeDetails();
        System.out.println("Years of Service: " + employee1.getYearsOfService());

        employee3.printEmployeeDetails();
        System.out.println("Years of Service: " + employee1.getYearsOfService());
    }
}