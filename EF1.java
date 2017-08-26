public class EF1{
	public static int factorial(int num){
		if(num<1){
			return(1);
		}
		else{
			return(factorial(num-1)*num);
		}
	}

	public static void main(int args[]){
		int num=0;
		args[0]=num;
		System.out.println(factorial(num));
	}
}