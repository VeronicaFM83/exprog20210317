package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
		
		listaVehiculos.add(new Coche("1245abc", "Ford", "Focus", 4));
		listaVehiculos.add(new Microbus("9854gjh", "Renault", "Abcde", 10));
		listaVehiculos.add(new Furgoneta("2562ert", "Seat", "Egwegh", 2.5));
		listaVehiculos.add(new Camion("9854gjh", "Mercedes", "Prwerg", 2.5));
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca numero de dias de alquiler de los vehiculos");
		try {
			int dias = input.nextInt();
			for (Vehiculo x: listaVehiculos) {
				System.out.println(x);
				x.getPrecioAlquiler(dias);
			}
		} catch (Exception e) {
			System.err.println("Error al introducir numero");
		}
		
	}

}
