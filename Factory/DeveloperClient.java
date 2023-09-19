package Design_Patterns.Factory;

public class DeveloperClient {

    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee("web developers");
        System.out.println(employee.salary());
    }
    
}
