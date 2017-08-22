public class EF1{
  public static void main (String args[]){
    int n = Integer.parseInt(args[0]); 
    EF1 fact = new EF1();
    System.out.println(fact.Factorial(n));
  }
  public int Factorial(int n){
    if (n == 0 || n == 1) {
      return 1;
    } else {
      return (n)*Factorial(n-1);
    }
  }
}