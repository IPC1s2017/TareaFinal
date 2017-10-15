public class EF1{
<<<<<<< HEAD
  public static void main (String args[]){
    int n = Integer.parseInt(args[0]); 
    EF1 fact = new EF1();
    System.out.println(fact.Factorial(n));
  }
  public int Factorial(int n){
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return (n)*Factorial(n-1);
    }
  }
}
=======

	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		System.out.println(Factorial(n));
	}

	public static int Factorial(int n){
		if(){//Escribir condición de salida
			return 1;
		}else{//Escribir el retorno para la recursividad

		}
	}
}
>>>>>>> 37667cd7fd2d36c5543bc9eac614d8d042ccd9d5
