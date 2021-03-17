package fp.daw.examen2ev;

public final class Coche extends Vehiculo {
	// atrib
	private double suplemento = 1.5;
	
	public Coche(String matricula, String marca, String modelo, int plazas) {
		super(matricula,marca,modelo,plazas);
		this.tipoTransporte = Vehiculo.tipoTransporte()
	}
	
	@Override
	protected double getPrecioAlquiler(int dias) {
		double precio = super.getPrecioAlquiler(dias);
		precio += this.suplemento * this.plazas;
		return precio;
	}
	
	@Override
	public String toString() {
		return "Datos del COCHE:\n" + "Matr�cula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo
				+ " N� de plazas: " + plazas;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
