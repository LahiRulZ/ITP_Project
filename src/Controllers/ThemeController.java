/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author lahir
 */
public class ThemeController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXDrawer drawer;

    @FXML
    private JFXHamburger hamburger;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // TODO
            VBox vbox = FXMLLoader.load(getClass().getResource("/GUIs/SidePane.fxml"));
            drawer.setSidePane(vbox);
        } catch (IOException ex) {
            Logger.getLogger(ThemeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        HamburgerBackArrowBasicTransition burgerAni = new HamburgerBackArrowBasicTransition(hamburger);
        burgerAni.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e) ->
        {
            burgerAni.setRate(burgerAni.getRate() * -1);
            burgerAni.play();
            
            if(drawer.isShown())
            {
                drawer.close();
            }
            else
            {
                drawer.open();
            }
        });
    }  
}
