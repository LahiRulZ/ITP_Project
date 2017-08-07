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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lahir
 */
public class UserSelectionPageController implements Initializable {

    public static Stage logInScreenWindow;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void mouseClickEventUser()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUIs/LogInScreen.fxml"));
        try {
            Parent root = (Parent)fxmlLoader.load();
            logInScreenWindow = new Stage();
            logInScreenWindow.setScene(new Scene(root));
            logInScreenWindow.setFullScreen(true);
            logInScreenWindow.show();
            WelcomeScreenController.userSelectionWindow.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @FXML
    public void mouseClickEventAdmin()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUIs/LogInScreen.fxml"));
        try {
            Parent root = (Parent)fxmlLoader.load();
            logInScreenWindow = new Stage();
            logInScreenWindow.setScene(new Scene(root));
            logInScreenWindow.setFullScreen(true);
            logInScreenWindow.show();
            WelcomeScreenController.userSelectionWindow.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     @FXML
    public void mouseClickEventOwner()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUIs/LogInScreen.fxml"));
        try {
            Parent root = (Parent)fxmlLoader.load();
            logInScreenWindow = new Stage();
            logInScreenWindow.setScene(new Scene(root));
            logInScreenWindow.setFullScreen(true);
            logInScreenWindow.show();
            WelcomeScreenController.userSelectionWindow.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
