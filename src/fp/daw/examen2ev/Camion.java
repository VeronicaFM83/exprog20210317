package fp.daw.examen2ev;

public final class Camion extends VehiculoMercancia{
	

	public Camion(String matricula, String marca, String modelo, double pma) {
		super(matricula, marca, modelo, pma);
	}

	
	@Override
	public String toString() {
		return "Datos del CAMIÓN:\n" + super.toString();
	}
	
	@Override
	public void getPrecioAlquiler(int dias) {
		double precio = dias * 50;
		precio += this.suplemento * this.pma;
		precio += 40;
		System.out.println("Importe alquiler para " + dias + " días: " + precio + " euros.");
	}
	
}
