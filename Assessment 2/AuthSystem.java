import java.util.*;
//Using Inner Classes for Authentication
class AuthSystem {
    private String password = "secure123";

    class Auth {
        boolean validate(String pass) {
            return password.equals(pass);
        }
    }

    public static void main(String[] args) {
        AuthSystem system = new AuthSystem();
        AuthSystem.Auth auth = system.new Auth();
        System.out.println("Authentication: " + auth.validate("secure123"));
    }
}
