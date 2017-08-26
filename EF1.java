public class EF1{
	public static void main(String[]args){
		//int n=Integer.parseInt(args[]);
		int n= Integer.parseInt(args[0]);
		EF1 bs = new EF1();
        System.out.println(bs.factorial(n));	
	}
	public static int factorial(int n){
		if(n==0){
			return 1;
		}else{
			return n*(factorial(n-1));
		}
	}
}