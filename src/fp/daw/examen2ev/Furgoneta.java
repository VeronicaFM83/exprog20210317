package fp.daw.examen2ev;

public final class Furgoneta extends VehiculoMercancia{
	
	public Furgoneta(String matricula, String marca, String modelo, double pma) {
		super(matricula, marca, modelo, pma);
		
	}

	@Override
	public String toString() {
		return "Datos de la FURGONETA:\n" + super.toString();
	}
}
