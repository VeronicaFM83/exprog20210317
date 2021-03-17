package fp.daw.examen2ev;

public final class Camion extends VehiculoMercancia {
	

	public Camion(String matricula, String marca, String modelo, double pma) {
		super(matricula, marca, modelo, pma);
	}

	
	@Override
	public String toString() {
		return "Datos del CAMIÓN:\n" + super.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
