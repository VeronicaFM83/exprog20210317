package fp.daw.examen2ev;

public final class Furgoneta extends VehiculoMercancia{
	
	public Furgoneta(String matricula, String marca, String modelo, double pma) {
		super(matricula, marca, modelo, pma);
		
	}

	@Override
	public String toString() {
		return "Datos de la FURGONETA:\n" + super.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Furgoneta nuevo = new Furgoneta("1245abc", "Ford", "Focus", 1.3);
		System.out.println(nuevo);
		nuevo.getPrecioAlquiler(2);
	}

}
