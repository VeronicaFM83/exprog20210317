package fp.daw.examen2ev;

public class VehiculoPersonas extends Vehiculo {
	
	protected int plazas;
	
	public VehiculoPersonas(String matricula, String marca, String modelo, int plazas) {
		super(matricula, marca, modelo);
		this.plazas = plazas;
		this.tipo_transporte = "Personas";
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Plazas: " + plazas;
	}

}
