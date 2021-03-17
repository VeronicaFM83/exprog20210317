package fp.daw.examen2ev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linea = "";
		System.out.print("calculadora > ");
		while (!(linea=in.readLine()).equalsIgnoreCase("fin") ) {
			calcular(linea);
			System.out.print("calculadora > ");
		}
	}
		
		static void calcular(String linea) throws IOException {
			Scanner s = new Scanner(linea);

			double num1, num2, resultado;
			String operador;
			try {
				num1 = s.nextDouble();
				operador = s.next();
				num2 = s.nextDouble();
				// System.out.println(num1+operador+num2);
			
				if (s.hasNext()) {
					throw new IllegalArgumentException();
				} else {
					switch (operador) {
					case "+":
						resultado = num1 + num2;
						break;
					case "-":
						resultado = num1 - num2;
						break;
					case "*":
						resultado = num1 * num2;
						break;
					case "/":
						resultado = num1 / num2;
						break;
					default:
						throw new IllegalArgumentException();
					}
					System.out.println("Resultado: " + resultado + "\n");
				
				}
			} catch (InputMismatchException e) {
				System.err.println("Expresión incorrecta\n");
			} catch (IllegalArgumentException e) {
				System.err.println("El operador no es correcto\n");
			} catch (Exception e) {
				System.err.println("\nError: " + e);
			}	
			s.close();
		}			
}	