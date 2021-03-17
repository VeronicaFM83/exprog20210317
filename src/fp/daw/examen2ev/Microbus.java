package fp.daw.examen2ev;

public final class Microbus extends VehiculoPersonas {
	
	private double suplemento = 2;
	
	public Microbus(String matricula, String marca, String modelo, int plazas) {
		super(matricula,marca,modelo,plazas);
	}
	
	
	@Override
	public void getPrecioAlquiler(int dias) {
		double precio = dias * 50;
		precio += this.suplemento * this.plazas * dias;
		System.out.println("Importe alquiler para " + dias + " días: " + precio + " euros.");

	}
	
	@Override
	public String toString() {
		return "Datos del MICROBUS:\n" + super.toString();

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microbus nuevo = new Microbus("9854gjh", "Renault", "ABCD", 10);
		System.out.println(nuevo);
		nuevo.getPrecioAlquiler(1);
	}

}
