package alquilervehiculos2;

public class Precio extends AlquilerVehiculo {
	private int toneladas;
	private double dias;
	private String fecha;
	private double precio;
	
	public Precio() {
		super();
	}

	public int getToneladas() {
		return toneladas;
	}

	public void setToneladas(int toneladas) {
		this.toneladas = toneladas;
	}

	public double getDias() {
		return dias;
	}

	public void setDias(double dias) {
		this.dias = dias;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	

	
}
