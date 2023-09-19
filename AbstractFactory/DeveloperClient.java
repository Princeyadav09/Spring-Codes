package Design_Patterns.AbstractFactory;

public class DeveloperClient {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(employee.salary());
    }
    
}
