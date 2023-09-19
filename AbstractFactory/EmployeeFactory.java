package Design_Patterns.AbstractFactory;

public class  EmployeeFactory {

    public static Employee getEmployee(EmployeeAbstactFactory factory){
       return factory.creatEmployee();
    }
    
}
