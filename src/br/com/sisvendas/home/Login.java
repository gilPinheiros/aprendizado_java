package br.com.sisvendas.home;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application {
	
    public static Stage stage;
    
    
    
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		Login.stage = stage;
	}

	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Login.fxml"));
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.setTitle("VENDAS PINHEIROS");
			//stage.getIcons().addAll(new javafx.scene.image.Image(Login.class.getResourceAsStream("")));
			stage.setResizable(false);
			setStage(stage);
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
