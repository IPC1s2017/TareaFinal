public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,1,6,2,4,3}; 
        BubbleSort bs = new BubbleSort();
        bs.sort(arr);
        bs.print(arr);
    }
    public void sort(int array []){
        for(int i = 0;i < (array.length) ; i++){
            for (int j = 1; j < (array.length-i);j++){
                this.print(array);
                if (array[j-1]>array[j]){
                    int temp = array [j];
                    array[j] = array [j-1];
                    array[j-1] = temp;    
                }
            }
        }

    }
    public void print(int array []){
        System.out.print("{ ");
        for (int i:array)
            System.out.print(i + " ");
        System.out.print("}");
        System.out.println("");
    }  
}
