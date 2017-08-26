package ef2;

/**
 *
 * @author lenovo
 */
public class EF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[]= {2,3,8,109,13,4,18,10,23,18,50,11,13,2};
        EF2 ps= new EF2();
         ps.sort(array);
        ps.print(array);
        
     
    }
    
    public void sort(int array[]){
        for (int i=0; i<array.length; i++){
            
            for (int j=1; j<array.length -i; j++){
                if (array[j-1]>array[j]){
                    int temporal=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temporal;

                }
            }
            
        }
    }
    
    public void print(int array[]){
       //esto es un for each
       System.out.print("{");
       for (int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(",");
            }
        }
       System.out.println("}");
    }
    
}
