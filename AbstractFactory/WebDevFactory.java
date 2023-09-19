package Design_Patterns.AbstractFactory;

public class WebDevFactory extends EmployeeAbstactFactory{

    @Override
    public Employee creatEmployee(){
        return new WebDevelopers();
    }
    
}
