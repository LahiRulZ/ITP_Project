/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author lahir
 */
public class Main extends Application {
    
    public static Stage window;
    
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        Parent root = FXMLLoader.load(getClass().getResource("/GUIs/WelcomeScreen.fxml"));
        
        Scene scene = new Scene(root);
        //changing the title bar
        stage.initStyle(StageStyle.UNIFIED);
        
        window.setFullScreen(true);
        window.setScene(scene);
        window.show();
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
