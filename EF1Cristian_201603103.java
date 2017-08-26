import java.util.Scanner;
public class EF1Cristian_201603103{
	
	public static void main(String args[]){
		 Scanner num = new Scanner(System.in);        
        int n = 0;
                System.out.println("Ingrese un numero");
                n = Integer.parseInt(num.nextLine());
                Factorial(n);		
		System.out.println(Factorial(n));
    }
    public static int Factorial(int n){
               
		if(n == 1 || n == 0) {
			return 1;  
		}else{
                   
                    return n * Factorial(n-1);

		}
	}
}