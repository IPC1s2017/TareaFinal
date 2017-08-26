package ef1;
/**
 *
 * @author lenovo
 */
public class EF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Entra como argumento en args[0]=5 args[1]=4 args[2]=3 args[3]=2 args[4]=8");
        int n = Integer.parseInt(args[0]);
        System.out.println("Sale factorial de args[0]: ");
        System.out.println(Factorial(n));
    }

    private static int Factorial(int n) {
         if (n==0 || n==1)
            return 1;
        else {
            return (Factorial(n-1)*n);
           
        }
        
    }
    
    
}
