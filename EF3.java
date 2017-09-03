


import java.util.Scanner;


public class EF3 {
    static String mensaje;
    static int cont=0;
    static int contador=0;
    static String cifrados[]=new String[5];
    static String descifrados[]=new String[5];
    static char cad[];
    public static void main(String[]args){
        menu();
       
    }
    
    public static void menu(){
            System.out.println("******Menú******");
        System.out.println();
        System.out.println("Elije el número de  opción");
        System.out.println("1- Si deseas cifrar un mensaje");
        System.out.println("2- Si deseas descifrar un mensaje");
        System.out.println("3- Si quieres ver todos lo mensajes");
        Scanner lector=new Scanner(System.in);
        String opcion=lector.next();
        Encripatador e=new Encripatador();
        switch(opcion){
            case "1":
              System.out.println("Escribe tu mensaje");
              mensaje=lector.next();
              System.out.println(e.Cifrar(mensaje));   
              System.out.println();
              menu();
              break;
            case "2":
                System.out.println("Escribe el mensaje a descifrar");
                mensaje=lector.next();
                System.out.println(e.Descifrar(mensaje));
                System.out.println();
                menu();
            case "3":
                System.out.println("Las frases cifradas son: ");
               for(int i=0;i<cifrados.length;i++){
                   
                   System.out.println(cifrados[i]);
                   
               }
               System.out.println("Las frases descifradas son: ");
               for(int i=0;i<descifrados.length;i++){
                   
                   
                   System.out.println(descifrados[i]);
               }
               menu();
              break;
            default:
                    System.out.println("intenta de nuevo");
                    menu();
        }
        
    }
    
    static public class Encripatador{
        StringBuffer a=new StringBuffer();
        char alfa[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };

    public String Cifrar(String mensaje){
                    cad=mensaje.toCharArray();
      for(int i=0;i<cad.length;i++){
                            
                            for(int j=0;j<alfa.length;j++){
                                
                                if(cad[i]==alfa[j]){
                                  int c=(5*j+11)%26+1;  
                                   cad[i]=alfa[c];
                                   if (cad[i]==' '){
                                       cad[i]=' ';
                                       
                                   }
                                }
                                
                 
                         }
                            a= a.append(cad[i]);
                        }
                        cont++;
                          cifrados[cont] = a.toString( );
      return  a.toString();
                        
    }

    public String Descifrar(String mensaje){
                    cad=mensaje.toCharArray();
      for(int i=0;i<cad.length;i++){
                            for(int j=0;j<alfa.length;j++){
                                if(cad[i]==alfa[j]){
                                   int d=(21*(j - 11))%26;  
                                   cad[i]=alfa[d];
                                }
                                if(cad[i]==' '){
                                    cad[i]=' ';
                                }
                               
                         }
                            a= a.append(cad[i]);
                        } 
                        contador++;
                        descifrados[contador]=a.toString();
      return a.toString();
    }
  }
    
}

