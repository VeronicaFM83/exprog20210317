package fp.daw.examen2ev;

public abstract class Vehiculo {
	 
	protected enum tipoTransporte { PERSONAS,MERCANCIA } // PTE REVISAR
	 
	protected String matricula, marca, modelo;
	protected int plazas;
	protected String tipoTransporte;
	protected double suplemento;
	
	public Vehiculo(String matricula, String marca, String modelo, int plazas) { // PTE REVISAR
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.plazas = plazas;
		//this.tipoTransporte = Vehiculo.tipoTransporte;
	}
	
	
	protected double getPrecioAlquiler(int dias) {
		double precio = dias * 50;
		return precio;
	}
	
	@Override
	public String toString() {
		return "Datos del VEHÍCULO:\n" + "Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo
				+ " Nº de plazas: " + plazas;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
