package Design_Patterns.AbstractFactory;

public class AndroidDevFactory extends EmployeeAbstactFactory {

    @Override
    public Employee creatEmployee(){
        return new AndroidDevelopers();
    }
    
}
