package fp.daw.examen2ev;

public final class Coche extends VehiculoPersonas {
	
	private double suplemento = 1.5;
	
	public Coche(String matricula, String marca, String modelo, int plazas) {
		super(matricula,marca,modelo, plazas);
	}
	
	
	@Override
	public void getPrecioAlquiler(int dias) {
		double precio = dias * 50;
		precio += this.suplemento * this.plazas;
		System.out.println("Importe alquiler para " + dias + " días: " + precio + " euros.");
	}
	
	@Override
	public String toString() {
		return "Datos del COCHE:\n" + super.toString();

	}
	
}
