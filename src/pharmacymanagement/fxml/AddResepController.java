/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacymanagement.fxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author drag me to hell
 */
public class AddResepController implements Initializable {
    @FXML
    private TextField inKodeResep;
    @FXML
    private Label lblNamaDokter;
    @FXML
    private Label lblSpesialis;
    @FXML
    private Label lblFile;
    @FXML
    private Button btnImport;
    @FXML
    private Button btnAddResep;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnImportAction(ActionEvent event) {
    }

    @FXML
    private void btnAddResepAction(ActionEvent event) {
    }
    
}
