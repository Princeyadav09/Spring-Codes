package Design_Patterns.BuilderPattern;

public class Main {
    
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                            .setEmailId("p@gmail.com")
                            .setUserId("princeyadav09")
                            .setUserName("prince")
                            .build();

        System.out.println(user);
    }
}
