public class EF1 {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número del cual desea saber el factorial");
        int numero = teclado.nextInt();
        Factorial(numero);
              
    }
    
    public static int Factorial(int numero){
        int r;
        if(numero==0 || numero==1){
            r = 1;
        }else{
            r = numero*Factorial(numero-1); 
            
        }
        
        System.out.println("El factorial de "+numero+"es: "+r);
        return r;
    }
    
}