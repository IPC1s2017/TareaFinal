public class EF1 {
    public static int Numero;
   public static void main(String[] args) {
      int N= Integer.parseInt(args[0]);
     System.out.println(Fact(N));
   }
    public static int Fact(int N){
       if (Numero == 0){
            return 1;
       }else{
           return Numero * Fact(N-1);
        }
        
   }
}

