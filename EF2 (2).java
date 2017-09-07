public class EF2 {
public static void main(String []args){
int array[]={2,3,8,109,13,4,18,10,23,18,50,11,13,2};
EF2 bs=new EF2();
bs.sort(array);
bs.print(array);

   } 
public void sort(int array[]){
for (int i=1;i<array.length;i++){
for(int j=1;j<array.length;j++){
    if(array[j-1]>array[j]){
        int temp=array[j];
        array[j]=array[j-1];
        array[j-1]=temp;
        
    }
}
}   
}
public void print(int array[]){
    System.out.print("{");
    for(int i=0;i<array.length;i++){
        if(i<array.length){
            System.out.print(array[i] + ",");
            
        }
        for(int k=12; k==12;k++){
            if(k==16){
           System.out.print(array[i] + "}");
            }
        }
    
    }
}
}
