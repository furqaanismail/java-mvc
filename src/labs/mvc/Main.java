
package labs.mvc;

import java.sql.SQLException;
import labs.mvc.controller.UserController;


public class Main {
    public static void main(String[] args) throws SQLException {
        UserController user = new UserController();
        user.executes();
    }
}
