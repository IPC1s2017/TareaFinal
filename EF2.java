public class EF2{
	
	public static void main(String args[]){
		
		
		public static void main(String[] args) {
		int[] cadena= {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2};
		int aux;

		System.out.print("{");
		
		for(int i=0;i<cadena.length;i++) {
			for(int j=i+1;j<cadena.length;j++) {
				if(cadena[i]>cadena[j]) {
					aux=cadena[i];
					cadena[i]=cadena[j];
					cadena[j]=aux;
				 
					}
			
				}
				
			if(i<cadena.length-1) {
				System.out.print(cadena[i]+", ");
			}
			else {
				System.out.print(cadena[i]);
			}

		}
			
			System.out.print("}");
		
		}


	}	

	
}