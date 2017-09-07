
import java.util.Scanner;

public class EF3{
public static String Mensajein[]=new String[5];
public static String Mensajedes[]=new String[5];
	public static void main(String args[]){
        
        Menu();
        
        }
        public static void Menu(){
                Scanner lee =new Scanner(System.in);
                Encripatador ms = new Encripatador();
		 int i=0;
                  System.out.println("Bienvenido");
                  while(i<5){
                  System.out.println("Escriba su mensaje");
                  ms.Cifrar(lee.nextLine());
                  i++;
                  }     
                  System.out.println("Que mensaje desea desencriptar");       
                 
          for(int j=0;j<Mensajein.length;j++){
             if(Mensajein[j]!=null){
              System.out.println(j+". "+Mensajein[j]);
          }}
        int selec=lee.nextInt();
          ms.Descifrar(selec);
            for(int j=0;j<Mensajedes.length;j++){
                if(Mensajedes[j]==null){
                System.out.println(j+". "+Mensajedes[j]);
          }}
	}
        
        
        
	public static class Encripatador{
            public String Abc[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y"," ","z"};
	 String c="";
         int ai=21;
         int contador=0;
            public String Cifrar(String mensaje){
		String md[];
                int m=0;
                int c1=0;
                String M=mensaje;
                md=M.split("");
                for(int i=0;i<md.length;i++){
                   
                         for(int j=0;j<Abc.length;j++){
                             
                             if(md[i].equals(Abc[j])){
                            
                             c1= (5*j+11)%26+1;
                             c=c+Integer.toString(c1)+" ";
                               
                             }
                         
                         }        

                    }
                if(contador<5){
                    Mensajein[contador]=c;
                    contador++;
                    c="";         
                }
                
                       
			return c;
		}
                int d=0;
                String m ="";
		public String Descifrar(int numensaje){
                        int pos=numensaje;
                        contador=0;
                        int x =0;    
                        String des="";
                        des=Mensajein[pos];
                         String[] desm = des.split(" ");
                        for(int i=0;i<desm.length;i++){
                          
                           x = Integer.parseInt(desm[i]);
                            d=Math.abs((ai*(x-11))%26);
                            m=m+Integer.toString(d)+" ";
                        }
                      
                        String[]me=m.split(" ");
                         int y=0;
                        for(int i =0;i<me.length;i++){
                            y= Integer.parseInt(me[i]) ;
                                  if(Mensajedes[pos]==null){
                                  Mensajedes[pos]=Abc[y];  
                                
                                  }
                                  else{
                                  
                                      Mensajedes[pos]=Mensajedes[pos]+Abc[y];
                                  }
                            }
                               
                
                         
			return Integer.toString(d);
                    }
                        
                        
                      
		}
	}
