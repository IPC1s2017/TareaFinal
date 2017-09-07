import java.util.Scanner;
public class EF3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String txt ="";
		int arreglo[];
		System.out.println("Ingrese un mensaje a cifrar: ");
		txt = sc.nextLine();
		//Encriptador
		char array[]=txt.toCharArray();
		
		for(int i = 0;i<array.length;i++){
			array[i]=(char)(array[i]+(char)6);
		}
		String encriptado = String.valueOf(array);
		System.out.println("Texto encriptado: "+encriptado);
		//Desencriptador
		char arrayD[]=encriptado.toCharArray();
		for(int i = 0;i<array.length;i++){
			arrayD[i]=(char)(arrayD[i]-(char)6);
		}
		String desencriptado = String.valueOf(arrayD);
		System.out.println("Texto desencriptado: "+desencriptado);
		
	}
	
	
	
}
