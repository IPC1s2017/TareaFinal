public class EF2 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2}; 
        EF2 arreglo = new EF2();
        arreglo.sort(arr);
        arreglo.imprimir(arr);
 }
    public void sort(int arr []){
        for(int i = 0; i < (arr.length); i++){
             for (int j = 1; j < (arr.length-i);j++){
                 if (arr[j-1] > arr [j]){
                     int temp = arr [j];
                     arr [j] = arr [j-1];
                     arr [j-1] = temp; 
                 }
                 }
             }
        }
    
    public void imprimir(int arr []){
        System.out.print("{");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]); 
            if (i!=(arr.length-1)) {
                System.out.print(",");
                }
                }  
            System.out.println("}");

}
}