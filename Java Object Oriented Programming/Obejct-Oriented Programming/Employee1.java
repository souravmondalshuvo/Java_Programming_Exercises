import java.time.LocalDate;
import java.time.Period;
public class Employee1 {
    
    private String name;
    private double salary;
    private LocalDate hire_date;

    public Employee1(String name, double salary, LocalDate hire_date) {
        this.name = name;
        this.salary = salary;
        this.hire_date = hire_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double setSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hire_date;
    }

    public void setHireDate(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public int getYearsOfService() {
        return Period.between(hire_date, LocalDate.now()).getYears();
    }

    public void printEmployeeDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hire_date);
    }
}