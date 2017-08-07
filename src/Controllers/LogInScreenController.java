/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lahir
 */
public class LogInScreenController implements Initializable {

    @FXML
    private TextField usernametxt;
    @FXML
    private TextField passwordtxt;
    @FXML
    private Button signInBtn;
    
    public static Stage themeWindow;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void resetButtonAction(ActionEvent event) 
    {
        usernametxt.setText("");
        passwordtxt.setText("");
    }
    
    @FXML
    public void backButtonAction(ActionEvent event) 
    {
        WelcomeScreenController.userSelectionWindow.show();
        WelcomeScreenController.userSelectionWindow.setFullScreen(true);
        UserSelectionPageController.logInScreenWindow.close();
    }
    
    @FXML
    void signInBtnAction(ActionEvent event) 
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/GUIs/Theme.fxml"));
            themeWindow = new Stage();
            themeWindow.setScene(new Scene(root));
            //themeWindow.setFullScreen(true);
            themeWindow.show();
            UserSelectionPageController.logInScreenWindow.close();
            
        } catch (IOException ex) {
            Logger.getLogger(LogInScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
