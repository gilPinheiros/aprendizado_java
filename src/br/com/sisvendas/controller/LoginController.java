package br.com.sisvendas.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.sisvendas.JDBC.ConnectionFactory;
import br.com.sisvendas.home.Login;
import br.com.sisvendas.home.Principal;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

public class LoginController implements Initializable{
	
    @FXML
    private ToggleButton btnLogar;

    @FXML
    private Label lblMensagen;

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;
    
    Principal p = new Principal();
    ConnectionFactory conexao = new ConnectionFactory();
    
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		System.out.println(conexao);
		btnLogar.setOnAction( (event) -> {
			logar();
		});
	}
	
	public void logar(){
	       if(txtLogin.getText().equals("admin") && txtSenha.getText().equals("admin")){
	              try {
	            	  
	                  p.start(new Stage());
	                  fecha();
	                 
	              } catch (Exception ex) {
	                  System.out.println("Erro \n" + ex);
	              }
	          } else {
	              Alert a = new Alert(Alert.AlertType.ERROR);
	                  a.setTitle("Atençao!!!");
	                  a.setHeaderText("login ou senha invalidos");
	                  a.showAndWait();
	                  
	              txtLogin.setText("");
	              txtSenha.setText("");
	              lblMensagen.setText("Porfavor Tente Novamente");
	          }
	    }
	public void fecha() {
		Login.getStage().close();
	}
    
}
