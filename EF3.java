import java.util.Scanner;

public class EF3{
    String[] Cripted = new String[5];
    
    public static void main(String args[]){
        EF3 cript = new EF3();  
        cript.menu();
    }
        
    public void menu(){
        Scanner in = new Scanner(System.in);
        byte opcion=0;
        System.out.println("-----------MENU------------\n");
        System.out.println("  1. CIFRAR");
        System.out.println("  2. MOSTRAR CIFRADOS");
        System.out.println("  3. MOSTRAR DESCIFRADOS");
        System.out.println("  4. SALIR\n");
        System.out.println("---------------------------");
        
        try{
        opcion = in.nextByte();}
        catch (Exception e){
            menu();
        }
        
        switch(opcion){
            case 1:
                mCifrar();
                break;
            case 2:
                System.out.println("|#| Mensaje Cifrado |");
                for (int c = 0 ; c < 5;c++ ){
                    if (Cripted[c]!=null){
                        System.out.println("|"+(c+1)+"| "+Cripted[c]+" |");
                    } else {
                        System.out.println("\n");
                        menu();
                        break;
                    }     
                }
                System.out.println("\n");
                menu();
                break;
            case 3:
                System.out.println("|#| Mensaje Descifrado |");
                mDCifrar();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                menu();
                break;
            }
    }
        
    public void mCifrar(){
        Scanner in = new Scanner(System.in);
        String mensaje;
        String cifrado;
        Encriptador cript = new Encriptador();  
         
        System.out.println("Escribe el mensaje alfabetico que desees cifrar");
        mensaje = in.nextLine();
           
        cifrado = cript.Cifrar(mensaje);
            
        for (int i = 0 ; i < 5 ; i++){
            if (Cripted[i] == null){
                Cripted[i] = cifrado;
                break;
            }
        }
        menu();
    }
        
    public void mDCifrar(){
        Scanner in = new Scanner(System.in);
        String mensaje;
        Encriptador cript = new Encriptador();  
          
        for (int c = 0 ; c < Cripted.length;c++ ){
            if (Cripted[c]!=null){
                mensaje = cript.Descifrar(Cripted[c]);
                System.out.println("|"+(c+1)+"| "+mensaje+" |");
            } else {
            break;
            }
        }
        System.out.println("\n");
        menu();
    }
    
    public class Encriptador{
        public String Cifrar(String mensaje){
            String cifrado="";
            int c;
            int aux1;
            int aux2;
            for (int i = 0 ; i < mensaje.length() ; i++){
                char letra = mensaje.charAt(i);
                for (int j = 65 ; j < 91 ; j++){//utilicé este rango, dado que estoy utilizando código ASCII
                    if ((char)j == letra){
                        aux1 = j - 64;//son mayúsculas en ASCII. Esto hace que el rango este en [1,26] -- de igual forma con Descifrar
                        c = (5*(aux1)+11)%26 + 1;
                        cifrado = cifrado + (char)(c+64);//Hace que «c» este en el rango [65,90], para el ASCII -- de igual forma con Descifrar
                        break;
                    } else if((char)(j+32)==letra){
                        aux2 = j - 64;//son minúsculas en ASCII. Esto hace que el rango este en [1,26] -- de igual forma con Descifrar
                        c = (5*(aux2)+11)%26 + 1;
                        cifrado = cifrado + (char)(c+96);//Hace que «c» este en el rango [97,122], para el ASCII -- de igual forma con Descifrar
                        break;
                    }
                }
            }
            return cifrado;
        }

        public String Descifrar(String mensaje){
            String descifrado="";
            int d;
            int aux1;
            int aux2;
            for (int i = 0 ; i < mensaje.length() ; i++){
                char letra = mensaje.charAt(i);
                //Desafortunadamente la formula proporcionada (para descifrar) no funcionó (¿Por qué?, hasta ahora no encontré la razón),
                //por lo que intenté y encontré una nueva formula. No creo que tenga que ver con la utilización del ASCII.
                //Encontré la nueva formula utilizando Wolfram, fui cambiando diferentes parametros de la formula original
                //y encontré una formula que retornaba la misma posición (numero entero) del alfabeto que se cifró.
                for (int j = 65 ; j < 91 ; j++){
                    if ((char)j == letra){//mayusculas
                        aux1 = j - 64;
                        d = ((int)Math.floor(21*(aux1+5.3)))%26 + 1;
                        descifrado = descifrado + (char)(d+64);
                        break;
                    } else if((char)(j+32)==letra){//minusculas
                        aux2 = j - 64;
                        d = ((int)Math.floor(21*(aux2+5.3)))%26 + 1;
                        descifrado = descifrado + (char)(d+96);
                        break;
                    }
                }
            }
            return descifrado;
        }
    }
}