package jdbcExample;

import jdbcExample.manager.UserManager;
import jdbcExample.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        try {
            User user = new User("poghos", "poghosyan", "poghos@gmail.com", "poghos");
            userManager.addUser(user);
            System.out.println(user);
            //userManager.addUser(new User("poghos", "poghosyan", "poghos@gmail.com", "poghos"));

            List<User> allUsers = userManager.getAllUsers();
            for (User allUser : allUsers) {
                System.out.println(allUser);
            }

            userManager.deleteUserById(4);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
