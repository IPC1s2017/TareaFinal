public class EF1{
	import java.util.Scanner;
	public static void main(String args[]){
		public static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(Factorial(n));
        Factorial(n);
    }
    public static int Factorial(int n){
         int resp;
         System.out.println("Ingrese un numero");
         n = sc.nextInt();
         if(n == 1){
             return 1;
         }else{
             resp = n*Factorial(n-1);
         }
        return resp;
         
    }
}