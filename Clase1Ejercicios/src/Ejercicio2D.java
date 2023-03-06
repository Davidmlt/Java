
public class Ejercicio2D {

	public static void main(String[] args) {

		double ingresosMensuales = 500.000;
		int vehiculos = 3;
		int inmuebles = 3;
		String poseeEmbarcacionAeronave = "no";

		if ((ingresosMensuales >= 572.386) || (vehiculos >= 3) || (inmuebles >= 3)
				|| (poseeEmbarcacionAeronave == "si")) {
			System.out.println("Segmento ingresos altos");

		} else if ((ingresosMensuales >= 163.539) && (ingresosMensuales < 572.386) || (vehiculos < 3) || (inmuebles < 3)
				|| (poseeEmbarcacionAeronave == "no")) {
			System.out.println("Segmento ingresos medios");		
		}

	}

}
