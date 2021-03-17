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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camion nuevo = new Camion("9854gjh", "Renault", "Abcde", 5.2);
		System.out.println(nuevo);
		nuevo.getPrecioAlquiler(1);
	}

}
