
public class EF2 {


public static void main(String[] args) {
 
    
    int[] matriz= {2, 3, 8, 109, 13, 4, 18, 10, 23, 18, 50, 11, 13, 2};
    int aux;
 
 	System.out.print("{");
 		
 	for(int i=0;i<matriz.length;i++) {
 	for(int j=i+1;j<matriz.length;j++) {
 		if(matriz[i]>matriz[j]) {
 			aux=matriz[i];
 			matriz[i]=matriz[j];
 			matriz[j]=aux;
 				 
 					}
 			
 				}
 				
 			if(i<matriz.length-1) {
 				System.out.print(matriz[i]+", ");
			}
 			else {
 				System.out.print(matriz[i]);
 			}
 
 		}
 			
 			System.out.print("}");
		}
 
 
  	}	