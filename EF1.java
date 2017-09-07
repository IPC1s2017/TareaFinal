

public class EF1 {


    public static void main(String args[]) {

         int N= Integer.parseInt(args[0]);

        System.out.println(Fact(N));
    }

    static int Fact(int N) {

        if (N <= 0) {

            return 1;
        } else {
            return N * (Fact(N - 1));
        }

    }

}