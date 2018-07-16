package labs.mvc.controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import labs.mvc.model.UserModel;
import labs.mvc.util.Connect;
import labs.mvc.view.User;

public class UserController {

    UserModel model;

    boolean status;

    public UserController() throws SQLException {
        this.model = new UserModel();
    }

    public void save(String username, String password) {
        status = model.insert(username, password);
        if (status) {
            JOptionPane.showMessageDialog(null, "insert Sukses!");
        } else {
            JOptionPane.showMessageDialog(null, "insert Failed!");
        }
    }
    
    public void executes() throws SQLException{
        new User().setVisible(true);
    }
}
