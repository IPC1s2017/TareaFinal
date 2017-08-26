package ef2;

public class EF2 {
    int orden[] = new int[14];
    static int cont = 0;

    public static void main(String[] args) {
    int array[] = {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2};
        System.out.println("Entrada: ");
        System.out.println("{2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2}");
        EF2 bs= new EF2();
        System.out.println();
        System.out.println("Salida:");
        bs.sort(array);
    }
    public void sort(int array[]){
        for(int i=0; i < array.length-1;i++){
            for(int j=1; j < array.length-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j+1];
                    array[j+1]= array[j];
                    array[j]=temp;
                }
            }
            for(int v=0; v < array.length;v++ ){
                orden[v]= array[v];
            } 
        }
            this.print(array);
    }
    public void print (int array[]){
        System.out.print("{");
    for(int i = 0; i < array.length;i++){
        if (orden[i] == 109){
            System.out.print(orden[i]);
        }else{
            System.out.print(orden[i]+", "); 
        }        
     }
     System.out.print("}");
     System.out.println();
    }
}

