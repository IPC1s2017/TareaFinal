public class EF1 {

    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        EF1 ef = new EF1();
        System.out.println(ef.factorial(n));
    }

    
    
    public static int factorial(int fac) {
       
        if (fac == 0) {
            return 1;
        } else {
            return fac * (factorial(fac - 1));
        }
        
    }
}