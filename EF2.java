public class EF2 {

   
    public static void main(String[] args) {
        
        int[] numerosOrdenar = {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2};
        int i, o, flotante;
        
        for(i=0;i<numerosOrdenar.length-1;i++){
            for(o=0;o<(numerosOrdenar.length-i-1);o++){
                if(numerosOrdenar[o+1]<numerosOrdenar[o]){
                  flotante=numerosOrdenar[o+1];
                  numerosOrdenar[o+1]=numerosOrdenar[o];
                  numerosOrdenar[o]=flotante;
               }
                
            }
        }
        
        System.out.print("Los numeros ordenados son { ");
        for(i=0;i<numerosOrdenar.length;i++){
            System.out.print(numerosOrdenar[i]);
            System.out.print(",");
        }
        System.out.print(" }");
          
    }
    
}