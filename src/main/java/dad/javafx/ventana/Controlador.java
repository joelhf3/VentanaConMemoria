package dad.javafx.ventana;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class Controlador implements Initializable {

	Modelo modelo = new Modelo();

	@FXML
	private GridPane view;

	@FXML
	private Slider sliderRojo;

	@FXML
	private Slider sliderVerde;

	@FXML
	private Slider sliderAzul;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public Controlador() throws IOException {
		FXMLLoader cargador = new FXMLLoader(getClass().getResource("Vista.fxml"));
		cargador.setController(this);
		cargador.load();
	}

	@FXML
	void arrastrarRojo(MouseEvent event) {

	}

	@FXML
	void clickRojo(MouseEvent event) {

	}
	
	@FXML
	void arrastrarVerde(MouseEvent event) {

	}
	
	@FXML
	void clickVerde(MouseEvent event) {

	}
	
	@FXML
	void arrastrarAzul(MouseEvent event) {

	}
	
	@FXML
	void clickAzul(MouseEvent event) {

	}

	public Modelo getModelo() {
		return modelo;
	}

	public GridPane getView() {
		return view;
	}
}
