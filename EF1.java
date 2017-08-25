
import java.util.Scanner;


public class EF1 {

    public static void main(String[] args) {
        int n;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un numero natural ");
            n = scanner.nextInt();
            System.out.println(factorial(n));
    }
    
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
