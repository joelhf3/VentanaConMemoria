package dad.javafx.ventana;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controlador controlador;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		controlador = new Controlador();
		
		Scene scene = new Scene(controlador.getView(), controlador.getView().getPrefWidth(), controlador.getView().getPrefHeight());

		Stage stage = new Stage();
		stage.setTitle("Ventana con Memoria");
		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
