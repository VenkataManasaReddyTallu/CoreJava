import java.util.*;
//Secure User Data with Encapsulation
class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public static void main(String[] args) {
        User user = new User();
        user.setUsername("Manas");
        System.out.println("Username: " + user.getUsername());
    }
}