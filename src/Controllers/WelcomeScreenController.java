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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Main.*;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;
/**
 * FXML Controller class
 *
 * @author lahir
 */
public class WelcomeScreenController implements Initializable {

    @FXML
    private StackPane stPane;

    public static Stage userSelectionWindow;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void mouseClickEvent()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUIs/UserSelectionPage.fxml"));
        try {
            Parent root = (Parent)fxmlLoader.load();           
            userSelectionWindow = new Stage();
            userSelectionWindow.setScene(new Scene(root));
            userSelectionWindow.setFullScreen(true);
            userSelectionWindow.show();
            Main.window.close();
            
        } catch (IOException ex) {
            Logger.getLogger(WelcomeScreenController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
