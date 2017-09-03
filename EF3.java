package ef3;

import java.util.Scanner;
public class EF3 {

   
    public String Alfb[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"," "};
            int c,x=0,ai=21;
    static String cadena;
    static int cif[]= new int[100];
    static int d;
    int opcion;
            //char sc[]=new char[25];
    public static void main(String[] args) {
        
        EF3 ef= new EF3();
            ef.Menu();
    }
    public void Menu(){
        Scanner scn= new Scanner(System.in);
        System.out.println("1. Escribir nuevo mensaje");
        System.out.println("2. Ver mensajes");
        System.out.println("3. Salir");
         opcion=scn.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Escriba el mensaje");
                    cadena=scn.next();
                    Cifrar(cadena);
                    Menu();
            case 2:
                System.out.println("1. Mostrar cifrado");
                System.out.println("2. Mostrar decifrado");
                System.out.println("3. regresar");
                opcion=scn.nextInt();
                    switch(opcion){
                        case 1:
                            for(int h=0;h<cadena.length(); h++){
                                System.out.print(cif[h]);
                            }
                        case 2:
                            Descifrar();
                        case 3:
                            Menu();
                    }
            case 3:
                System.exit(1);
        }
    }
    	public String Cifrar(String cadena){
            cadena=this.cadena;
            char[] scn =cadena.toCharArray();
                    for(int j=0;j<cadena.length();j++){
                        for (int i=0;i<=Alfb.length; i++){
                            if( String.valueOf(scn[j]).equals(Alfb[i])){
                                c = ((5*i + 11 ) % 26) + 1;
                                cif[j]=c;
                                
                            }
                        }
                    }
                    
			return "cifrado";
		}

        public String Descifrar(){
		for(int j=0;j<=cadena.length(); j++){
                    d= (ai * (cif[j] - 11))% 26;
                   System.out.print(Alfb[d]);
                }			
                
			return "Descifrado";
		}
	
}
