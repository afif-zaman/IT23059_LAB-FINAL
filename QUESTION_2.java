class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }
    public double calculateSalary() {
        return 0.0; 
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary()
    {
        return hourlyRate * hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
      
        Employee emp1 = new FullTimeEmployee("Afif", 5000);
        Employee emp2 = new PartTimeEmployee("Zaman", 20, 120);

        System.out.println(emp1.name + "'s Salary: $" + emp1.calculateSalary());
        System.out.println(emp2.name + "'s Salary: $" + emp2.calculateSalary());
    }
}
