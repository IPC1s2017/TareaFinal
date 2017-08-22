public class EF2 {
    public static void main(String[] args) {
        int arr[] = {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2}; 
        EF2 ef = new EF2();
        ef.sort(arr);
        ef.print(arr);
    }
    public void sort(int array []){
        for(int i = 0;i < (array.length) ; i++){
            for (int j = 1; j < (array.length-i);j++){
                if (array[j-1]>array[j]){
                    int temp = array [j];
                    array[j] = array [j-1];
                    array[j-1] = temp;    
                }
            }
        }

    }
    public void print(int array []){
        System.out.print("{");
        for (int i = 0; i < array.length ; i++){
            System.out.print(array[i]); 
            if (i!=(array.length-1)) {
	        System.out.print(", ");
            } else {
                break;
            }
        }
        System.out.print("}");
        System.out.println("");
    }  
}
