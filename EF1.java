public class EF1{
    
    public static void main(String args[]){
        int numero = Integer.parseInt(args[0]);
        System.out.println(Factorial(numero));
    }   

    public static int Factorial(int numero){
        if(numero==1 || numero==0){
            return 1;  
        }else{return numero*Factorial(numero-1);

        }
    }
}
