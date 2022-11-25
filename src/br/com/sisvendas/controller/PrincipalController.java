package br.com.sisvendas.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrincipalController implements Initializable{
    

    @FXML
    private Label lblUsuario;
    @FXML
    private Button btnVerificar;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		btnVerificar.setOnMouseClicked((event) ->{
			lblUsuario.setText("Olá gilmar");
		});
	}

}
