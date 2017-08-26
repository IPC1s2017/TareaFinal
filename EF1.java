public class EF1{
	public static void main(String[] args) {

		int n= Integer.parseInt(args[0]);
		System.out.println(Factorial(n));
    }

    public static int Factorial(int n) {
	if (n == 0){ 
		return 1;
	}
		else{ 
			return n * Factorial(n-1);
		}
	
  }
}