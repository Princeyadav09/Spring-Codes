package Design_Patterns.Factory;

public class  EmployeeFactory {

    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("Android developers")){
            return new AndroidDevelopers();
        } else if(empType.trim().equalsIgnoreCase("Web developers")){
            return new WebDevelopers();
        } else {
            return null;
        }
    }
    
}
