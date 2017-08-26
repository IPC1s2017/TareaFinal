public class EF2Cristian_201603103{
	static int numero[] = new int[14];
	public static void main(String[] args){
		numero[0]= 2 ;
        numero[1]= 3 ;
        numero[2]= 8 ;
        numero[3]= 109 ;
        numero[4]= 13 ;
        numero[5]= 4 ;
        numero[6]= 18 ;
        numero[7]= 10 ;
        numero[8]= 23 ;
        numero[9]= 18;
        numero[10]= 50 ;
        numero[11]= 11 ;
        numero[12]= 13 ;
        numero[13]= 2 ;
        System.out.print("{");
       for(int j=0; j < 13; j++){
            System.out.print(+numero[j]+",");
        }
       System.out.print(numero[13]+"}");
       System.out.println();
       System.out.print("{");
       for(int k = 1; k <= 13; k++){ 
       for(int j=0; j <= k; j++){
        if(numero[j] < numero[k]){
        System.out.print(numero[j]+",");
        }else{
        System.out.print(numero[k]+",");
        }  
      }
       }
       System.out.print("}");
	}
}