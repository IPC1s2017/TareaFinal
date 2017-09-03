public class EF1 {
	public static int numero;
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(factorial(n));	
	}
	
	public static int factorial (int n) {
		if (numero == 0) 
		return 1;
		else 
		return numero * factorial(n-1);
	}
}