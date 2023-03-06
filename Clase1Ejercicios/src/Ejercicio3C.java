import javax.swing.JOptionPane;

public class Ejercicio3C {
	
	public static void main(String[] args) {
		
		int numeroInicio = 5;
		int numeroFin = 14;
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese 1, si quiere ver los numeros"
				+ "impares o 2 para los pares"));
		
		while (numeroInicio < numeroFin) {
			numeroInicio++;
			if ((numeroInicio % 2 == 0) && (num1 == 2)) {
				System.out.println(numeroInicio + " par");
			} else if ((numeroInicio % 2 != 0) && (num1 == 1)) {
				System.out.println(numeroInicio + " impar");
			}
		}
	}

}
