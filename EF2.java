public class EF2{
	public static void main(String[]args){
		//int n=Integer.parseInt(args[]);
		int array[]={2,3,8,109,13,4,18,10,23,18,50,11,13,2};
        EF2 bs= new EF2();
        bs.sort(array);
        bs.print(array);	
	}
	    public void sort(int array[]){
        
        for(int i=0;i< array.length ;i++){
            for(int j=1;j<array.length-i;j++){
                if(array[j-1]>array[j]){
                    int temporal=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temporal;
                }
            }
        }
    }
	public void print(int array[]){
        //declaracion foresach=es usado para recorrere arreglos
          System.out.print("{");
          int j=array.length;
        for(int i : array){
        	if(i<=j+50){
        	System.out.print(i+","); 	
        	}else{
        		System.out.print(i);
        	}	
          	  
        }
        System.out.print("}");
            System.out.println();
        //fin declaracion foreach
    }
}