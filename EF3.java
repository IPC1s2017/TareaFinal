import java.util.Scanner;
public class EF3{
	
	public static void main(String[] args){
		EF3 ef = new EF3();
		ef.encriptado();
	}
	String mensaje;
	int c;
	char palabra[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Scanner sc = new Scanner(System.in);
	public EF3 (){
		encriptado();
	}
	public void encriptado(){
		char letra;
		System.out.println("Ingrese un mensaje");
		mensaje=sc.nextLine();
		for(int j=0; j<mensaje.length(); j++){
			letra=mensaje.charAt(j);
			for(int i=0; i<palabra.length; i++){
				if(letra==palabra[i]){
					System.out.println("mensaje encriptado");
					c=(5*i)%26+1;
					System.out.println(c);
				}
			}
		}
	}
}