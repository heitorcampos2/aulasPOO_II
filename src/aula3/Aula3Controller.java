/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author IFNMG
 */
public class Aula3Controller implements Initializable {

    @FXML
    private PasswordField passwordBanco;
    @FXML
    private Button buttonPegarDados;
    @FXML
    private TextArea textAreaReclamacoes;
    @FXML
    private Label labelDados;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarDados(ActionEvent event) {
        String m = "";
        String n = " ";
        String a = "Dados: \n";
        //pegar o dado do password field
        m += passwordBanco.getText();
        
        //pegar o texto do text área
        n += textAreaReclamacoes.getText();
        
        //jogar os dados no label
        labelDados.setText(a + m + n);
        
    }
    
}
