import java.util.Arrays;


public class EF2 {


    public static void main(String[] args) {
 
        int[] arreglo = new int[14];
        arreglo[0]=2;
        arreglo[1]=3;
        arreglo[2]=8;
        arreglo[3]=109;
        arreglo[4]=13;
        arreglo[5]=4;
        arreglo[6]=18;
        arreglo[7]=10;
        arreglo[8]=23;
        arreglo[9]=18;
        arreglo[10]=50;
        arreglo[11]=11;
        arreglo[12]=13;
        arreglo[13]=2;
        
        System.out.println(Arrays.toString(burbuja(arreglo)));
        System.out.println();
        
    }
    public static int[] burbuja(int [] A){
         int i, j, aux;
         for(i=0;i<A.length-1;i++)
              for(j=0;j<A.length-i-1;j++)
                   if(A[j+1]<A[j]){
                      aux=A[j+1];
                      A[j+1]=A[j];
                      A[j]=aux;
                   }
         return A;
}
}
