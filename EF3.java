/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author LuisMiguel
 */
public class EF3 {

    Scanner scanner;
    int op;

    public EF3() {
        scanner = new Scanner(System.in);
        try {
            menu();
        } catch (Exception e) {
            System.out.println("Ingresa valores validos porfavor \n");
            new EF3();
        }
    }

    private void menu() {

        String mensaje;
        while (op != 3) {
            System.out.println("CRIPTOGRAFIA \n"
                    + "Selecciona una opcion ingresando su numero correspondiente \n"
                    + "1.) Cifrar mensaje. \n"
                    + "2.) Descifrar mensaje. \n"
                    + "3.) Salir");
            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Ingrese el mensaje a cifrar");
                    mensaje = scanner.nextLine();
                    System.out.println(cifrar(mensaje));
                    break;
                case 2:
                    System.out.println("Ingrese el mensaje a descifrar");
                    mensaje = scanner.nextLine();
                    System.out.println(descifrar(mensaje));
                    break;
                case 3:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Debes ingresar un valor con las opciones anteriores \n");
                    break;
            }
        }

    }

    private int letrastonumeros(char entrada) {

        //nos devuelve el numero en el alfabeto de la letra, para espacio en blanco es 0
        int salida = 0;
        switch (entrada) {
            case 'a':
                salida = 1;
                break;
            case 'b':
                salida = 2;
                break;
            case 'c':
                salida = 3;
                break;
            case 'd':
                salida = 4;
                break;
            case 'e':
                salida = 5;
                break;
            case 'f':
                salida = 6;
                break;
            case 'g':
                salida = 7;
                break;
            case 'h':
                salida = 8;
                break;
            case 'i':
                salida = 9;
                break;
            case 'j':
                salida = 10;
                break;
            case 'k':
                salida = 11;
                break;
            case 'l':
                salida = 12;
                break;
            case 'm':
                salida = 13;
                break;
            case 'n':
                salida = 14;
                break;
            case 'o':
                salida = 15;
                break;
            case 'p':
                salida = 16;
                break;
            case 'q':
                salida = 17;
                break;
            case 'r':
                salida = 18;
                break;
            case 's':
                salida = 19;
                break;
            case 't':
                salida = 20;
                break;
            case 'u':
                salida = 21;
                break;
            case 'v':
                salida = 22;
                break;
            case 'w':
                salida = 23;
                break;
            case 'x':
                salida = 24;
                break;
            case 'y':
                salida = 25;
                break;
            case 'z':
                salida = 26;
                break;
            case ' ': //para espacios en blanco
                salida = 0;
                break;

        }
        return salida;
    }

    private char numerostoletras(int entrada) {
        char salida = ' ';
        switch (entrada) {
            case 1:
                salida = 'a';
                break;
            case 2:
                salida = 'b';
                break;
            case 3:
                salida = 'c';
                break;
            case 4:
                salida = 'd';
                break;
            case 5:
                salida = 'e';
                break;
            case 6:
                salida = 'f';
                break;
            case 7:
                salida = 'g';
                break;
            case 8:
                salida = 'h';
                break;
            case 9:
                salida = 'i';
                break;
            case 10:
                salida = 'j';
                break;
            case 11:
                salida = 'k';
                break;
            case 12:
                salida = 'l';
                break;
            case 13:
                salida = 'm';
                break;
            case 14:
                salida = 'n';
                break;
            case 15:
                salida = 'o';
                break;
            case 16:
                salida = 'p';
                break;
            case 17:
                salida = 'q';
                break;
            case 18:
                salida = 'r';
                break;
            case 19:
                salida = 's';
                break;
            case 20:
                salida = 't';
                break;
            case 21:
                salida = 'u';
                break;
            case 22:
                salida = 'v';
                break;
            case 23:
                salida = 'w';
                break;
            case 24:
                salida = 'x';
                break;
            case 25:
                salida = 'y';
                break;
            case 26:
                salida = 'z';
                break;
            case 0: //para espacios en blanco
                salida = ' ';
                break;
        }
        return salida;
    }

    public String cifrar(String mensaje) {

        int i;
        char[] aux = mensaje.toCharArray();

        for (i = 0; i < aux.length; i++) {
            //(5X + 11 ) mod 26 + 1
            aux[i] = numerostoletras((5 * letrastonumeros(aux[i]) + 11) % 26 + 1);
        }
        mensaje = String.valueOf(aux);

        return mensaje;
    }

    public String descifrar(String mensaje) {
        int i;
        char[] aux = mensaje.toCharArray();

        for (i = 0; i < aux.length; i++) {
            //(ai * (C - 11)) mod 26
            aux[i] = numerostoletras((21) * (letrastonumeros(aux[i]) - 11) % 26);
        }
        mensaje = String.valueOf(aux);

        return mensaje;
    }

    public static void main(String[] args) {
        new EF3();
    }

}
