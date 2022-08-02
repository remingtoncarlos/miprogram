package alquilervehiculos2;

public class AlquilerVehiculo {
	private int matricula;
	private String tipo_vehiculo,fecha;
	private int cf_dia, cf_micro, cf_carga, cf_camion;
	private double cf_coche;
	
//CONSTRUCTOR
	public AlquilerVehiculo() {
		super();
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(String tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCf_dia() {
		return cf_dia;
	}

	public void setCf_dia(int cf_dia) {
		this.cf_dia = cf_dia;
	}

	public int getCf_micro() {
		return cf_micro;
	}

	public void setCf_micro(int cf_micro) {
		this.cf_micro = cf_micro;
	}

	public int getCf_carga() {
		return cf_carga;
	}

	public void setCf_carga(int cf_carga) {
		this.cf_carga = cf_carga;
	}

	public int getCf_camion() {
		return cf_camion;
	}

	public void setCf_camion(int cf_camion) {
		this.cf_camion = cf_camion;
	}

	public double getCf_coche() {
		return cf_coche;
	}

	public void setCf_coche(double cf_coche) {
		this.cf_coche = cf_coche;
	}
	
//METODOS GETT Y SETT

}
