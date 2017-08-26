public class EF2{

    
    public static void main(String[] args) {
        
        int array[] ={2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2};
        BubbleSort bs= new BubbleSort();
        bs.sort(array);
        bs.print(array);
        
    }
    
    public void sort(int array[]){
        
        for(int i=0; i<=array.length; i++){
            for(int j=1; j<array.length; j++){
                if(array[j-1]>array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1]=temp;
                }
            }
        }
            
    }
    
    public void print(int array[]){
        System.out.println("{");
        for(int i : array){ //Esto se conoce como foreach
            System.out.print(i+",");
            System.out.println("");
        }
        System.out.println("}");
    }
   
}