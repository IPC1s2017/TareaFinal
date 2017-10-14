/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author mendez
 */
public class EjercicioNo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] mensajesPosibles =  new String[5];
        Integer contador = 0;
        Boolean finalizar = false;
        
        while (!finalizar) {          //Condición trivial: siempre cierta
            System.out.println("************Bienvenido a CIFRADOS.COM******");
            System.out.println("1. Cifrar mensajes");
            System.out.println("2. Mostrar mensajes cifrados");
            System.out.println("3. Mostrar mensajes descifrados");
            System.out.println("4. Salir");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            String [] abecedario = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M","N","Ñ","O","P","Q","R","S","T","U","V","W", "X","Y","Z" };
            
            switch(i){  
                case 1:
                    if(contador != 5){
                        
                        System.out.println("Ingrese un mensaje para cifrar");
                        Scanner sco = new Scanner(System.in);
                        String mensaje = sco.nextLine();
                        mensaje = mensaje.toUpperCase();
                        String totalPalabraCifrada = "";

                        for(int s=0; s<mensaje.length(); s++){
                            for(int ab = 0; ab< abecedario.length; ab++){
                                if(String.valueOf(mensaje.charAt(s)).equals(abecedario[ab])){
                                    Integer posLetraCifrada = ((5*(ab) + 11 ) % 26) + 1;
                                    if(totalPalabraCifrada.isEmpty()){
                                        totalPalabraCifrada = String.valueOf(posLetraCifrada);
                                    }else{
                                        totalPalabraCifrada = totalPalabraCifrada + "," +String.valueOf(posLetraCifrada); 
                                    }
                                    
                                }
                            }
                        }
                        mensajesPosibles[contador] = totalPalabraCifrada;
                        System.out.println("Mensaje cifrado correctamente");
                        contador++;
                    }else{
                        System.out.println("Ya ingreso sus 5 palabras");
                    }
                    break;
                case 2:
                    System.out.println("************MENSAJES CIFRADOS***************");
                    for(int h=0; h<5; h++){
                        if(mensajesPosibles[h]!=null){
                            String[] stArr = mensajesPosibles[h].split(",");
                            System.out.print((h+1)+". ");
                            for(int stNo=0; stNo<stArr.length ; stNo++){
                                System.out.print(abecedario[Integer.parseInt(stArr[stNo])]);
                            }
                            System.out.println("");
                        }
                    }
                    break;    
                case 3:
                    System.out.println("**************DESCIFRANDO MENSAJES****************");
                    System.out.println("***ESPERE UN MOMENTO...");
                    String armandoPalabra = "";
                    for(int h=0; h<5; h++){
                        armandoPalabra = "";
                        if(mensajesPosibles[h]!=null){
                            String[] stArr = mensajesPosibles[h].split(",");
                            for(int stNo=0; stNo<stArr.length ; stNo++){
                                Integer posABCNORMAL = ( ((Integer.parseInt(stArr[stNo])-1) - 11) * 21) % 26;
                                if(armandoPalabra.isEmpty()){
                                    armandoPalabra = abecedario[(posABCNORMAL)];
                                }else{
                                    armandoPalabra = armandoPalabra + abecedario[(posABCNORMAL)];
                                }
                            }
                            System.out.println("1." + armandoPalabra);
                        }
                    }
                    break;
                case 4:
                    finalizar = true;
                    break;    
            }
        }     
        
        
        
    }
    
}
