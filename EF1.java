public class EF1{
	
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		System.out.println(Factorial(n));
	}	

	public static int Factorial(int n){
		if(n==0){//Escribir condición de salida 
			return 1;  
		}else{//Escribir el retorno para la recursividad
			return fac * (factorial(fac - 1));
		}
	}
}