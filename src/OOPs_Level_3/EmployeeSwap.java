package OOPs_Level_3;

class Employee {

    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void display()
    {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

public class EmployeeSwap {

    public static void swap(Employee emp1, Employee emp2)
    {
//        String tempName = emp1.name;
//        emp1.name = emp2.name;
//        emp2.name = tempName;

        int tempId = emp1.id;
        emp1.id = emp2.id;
        emp2.id = tempId;

        double tempSalary = emp1.salary;
        emp1.salary = emp2.salary;
        emp2.salary = tempSalary;
    }

    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Alice", 101, 30000);
        Employee employee2 = new Employee("Bob", 102, 50000);

        System.out.println("Before swapping:");
        employee1.display();
        employee2.display();

        swap(employee1, employee2);

        System.out.println("After swapping:");
        employee1.display();
        employee2.display();

    }
}

