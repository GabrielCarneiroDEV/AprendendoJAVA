

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author gabri
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensagem;
    @FXML
    private Button btnClick;
    
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá, mundo!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
