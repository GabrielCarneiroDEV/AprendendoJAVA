/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author gabri
 */
public class Testefuncao01 {

    static void soma (int a, int b){
        int s = a + b;
        System.out.println(s);
    }
    static int sub (int a, int b){
        int s = a - b;
        return s;
    }
  
    public static void main(String[] args) {
       soma(2,5);
       int subtra = sub(5,2);
        System.out.println(subtra);
        
        System.out.println(sub(8,2));
    }
    
    
}
