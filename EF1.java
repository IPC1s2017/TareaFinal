/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ef1;
import java.util.Scanner;

/**
 *
 * @author Adam Navas
 */
public class EF1 {
    public static int Num;
    public static void main(String[] args) {
      int N= Integer.parseInt(args[0]);
      System.out.println(Fact(N));
    }
    public static int Fact(int N){
        if (Num == 0){
            return 1;
        }else{
            return Num * Fact(N-1);
        }
        
    }
}
