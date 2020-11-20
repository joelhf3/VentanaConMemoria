package dad.javafx.ventana;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Modelo {

	private IntegerProperty valorRojo = new SimpleIntegerProperty();
	private IntegerProperty valorVerde = new SimpleIntegerProperty();
	private IntegerProperty valorAzul = new SimpleIntegerProperty();
	
	public final IntegerProperty valorRojoProperty() {
		return this.valorRojo;
	}
	
	public final int getValorRojo() {
		return this.valorRojoProperty().get();
	}
	
	public final void setValorRojo(final int valorRojo) {
		this.valorRojoProperty().set(valorRojo);
	}
	
	public final IntegerProperty valorVerdeProperty() {
		return this.valorVerde;
	}
	
	public final int getValorVerde() {
		return this.valorVerdeProperty().get();
	}
	
	public final void setValorVerde(final int valorVerde) {
		this.valorVerdeProperty().set(valorVerde);
	}
	
	public final IntegerProperty valorAzulProperty() {
		return this.valorAzul;
	}
	
	public final int getValorAzul() {
		return this.valorAzulProperty().get();
	}
	
	public final void setValorAzul(final int valorAzul) {
		this.valorAzulProperty().set(valorAzul);
	}
}
