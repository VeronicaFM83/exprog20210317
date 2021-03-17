package fp.daw.examen2ev;

public abstract class VehiculoMercancia extends Vehiculo implements PrecioAlquiler {
	
	protected double pma;

	public VehiculoMercancia(String matricula, String marca, String modelo, double pma) {
		super(matricula, marca, modelo);
		this.pma = pma;
		this.suplemento= 20;
		this.tipo_transporte = "Mercancia";
	}
	
	@Override
	public String toString() {
		return super.toString() + ", PMA: " + pma + "Tn";
	}
	
	@Override
	public void getPrecioAlquiler(int dias) {
		double precio = dias * 50;
		precio += this.suplemento * this.pma;
		System.out.println("Importe alquiler para " + dias + " días: " + precio + " euros.");
	}

}
