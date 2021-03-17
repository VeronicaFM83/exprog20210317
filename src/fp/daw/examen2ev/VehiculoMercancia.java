package fp.daw.examen2ev;

public abstract class VehiculoMercancia extends Vehiculo {
	
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
	protected double getPrecioAlquiler(int dias) {
		double precio = super.getPrecioAlquiler(dias);
		precio += this.suplemento * this.pma;
		return precio;
	}

}
