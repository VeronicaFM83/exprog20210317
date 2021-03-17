package fp.daw.examen2ev;

public abstract class Vehiculo {
	 
	protected String matricula, marca, modelo;
	protected double suplemento;
	protected String tipo_transporte;
	
	public Vehiculo(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected double getSuplemento() {
		return suplemento;
	}

	protected void setSuplemento(double suplemento) {
		this.suplemento = suplemento;
	}

	protected String getTipo_transporte() {
		return tipo_transporte;
	}

	protected void setTipo_transporte(String tipo_transporte) {
		this.tipo_transporte = tipo_transporte;
	}

	
	protected double getPrecioAlquiler(int dias) {
		double precio = dias * 50;
		return precio;
	}
	
	@Override
	public String toString() {
		return "Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo
				+ ", Tipo de transporte: " + tipo_transporte;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
