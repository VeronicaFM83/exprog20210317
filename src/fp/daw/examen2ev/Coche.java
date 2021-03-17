package fp.daw.examen2ev;

public final class Coche extends VehiculoPersonas {
	
	private double suplemento = 1.5;
	
	public Coche(String matricula, String marca, String modelo, int plazas) {
		super(matricula,marca,modelo, plazas);
	}
	
	
	@Override
	protected double getPrecioAlquiler(int dias) {
		double precio = super.getPrecioAlquiler(dias);
		precio += this.suplemento * this.plazas;
		return precio;
	}
	
	@Override
	public String toString() {
		return "Datos del COCHE:\n" + super.toString();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche nuevo = new Coche("1245abc", "Ford", "Focus", 4);
		System.out.println(nuevo);
		System.out.println(nuevo.getPrecioAlquiler(2));
	}

}
