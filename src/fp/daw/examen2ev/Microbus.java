package fp.daw.examen2ev;

public final class Microbus extends VehiculoPersonas {
	
	private double suplemento = 2;
	
	public Microbus(String matricula, String marca, String modelo, int plazas) {
		super(matricula,marca,modelo,plazas);
	}
	
	
	@Override
	protected double getPrecioAlquiler(int dias) {
		double precio = super.getPrecioAlquiler(dias);
		precio += this.suplemento * this.plazas * dias;
		return precio;
	}
	
	@Override
	public String toString() {
		return "Datos del MICROBUS:\n" + super.toString();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microbus nuevo = new Microbus("1245abc", "Ford", "Focus", 10);
		System.out.println(nuevo);
		System.out.println(nuevo.getPrecioAlquiler(1));
	}

}
