public class EF1{
    
    public static void main(String args[]){
	int n = Integer.parseInt(args[0]);

        class Factorial{
        public int Factorial(int m){
        if (m == 0){
            return 1;
        }
        else{
            return m*Factorial(m-1);
        }
        }
        }
     Factorial resultado = new Factorial();
     
        System.out.println(resultado.Factorial(n));
     }
}