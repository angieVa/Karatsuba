package main;

import java.math.BigInteger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Karatsuba;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
	
		Parent root = FXMLLoader.load(getClass().getResource("/view/gui.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Karatsuba");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
