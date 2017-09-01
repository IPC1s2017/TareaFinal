
public class EF2{
	
	public static void main(String[]args){

		int lista[]={2,3,8,109,13,4,18,10,23,18,50,11,13,2};
        sort(lista);
        imprimir(lista);

	}

	public static void sort(int lista[]){
        for(int i=0;i<lista.length;i++){
            for(int j=1;j<lista.length;j++){
                if(lista[j-1]>=lista[j]){
                    int temporal=lista[j];
                    lista[j]=lista[j-1];
                    lista[j-1]=temporal;
                }
            }
        }
        
    }
    
    public static void imprimir(int lista[]){
        System.out.print("{");
        for(int i=0;i<lista.length;i++){
        
             System.out.print(lista[i]);
        if(i!=lista.length-1){     
            System.out.print(",");
        }
       
        if(i==lista.length-1){
            System.out.print("}");
        }
        }
        
    }

}