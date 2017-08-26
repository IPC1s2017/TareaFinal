//Ejercicio de Recursividad Factorial

public class EF1 {
	static int factorial (int numero) {
		if (numero == 0) return 1;
		else 
		return numero * factorial(numero-1);
	}
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		System.out.println(factorial(n));	
	}
}