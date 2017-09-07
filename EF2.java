public class EF2 {

  
    public static void main(String[] args) {
        int vector[] = {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2};
	Ordenamiento(vector);
        Mostrar(vector);
		
    }
    public static void Ordenamiento(int vector[]){
        for(int i=0; i<vector.length;i++){
            for(int j=0;j<vector.length-1;j++){
                if(vector[j]>vector[j+1]){
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                
                }
            }
        
        }
    
    }
    public static void Mostrar(int vector[]){
        System.out.print("{");
    for(int i=0;i<14;i++){
        
        if(i<13){
            System.out.print(vector[i]+",");
        }
        
        
        
    
    }
    for(int i=13; i==13;i++){
            if(i==13){
                
                System.out.println(vector[i]+"}");
            
            }
        }
    
    }
    
}
