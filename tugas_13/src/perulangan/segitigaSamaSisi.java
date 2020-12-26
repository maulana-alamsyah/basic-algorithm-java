/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan;

/**
 *
 * @author UserPCC
 */
public class segitigaSamaSisi {
    public static void main(String[] args){
       for(int x=1; x<=6; x++){
           for(int y=1; y<=6-x; y++){
               System.out.print(" ");
           }
           for(int z=1; z<=x; z++){
               System.out.print("A ");
           }
           System.out.println("");
       }
    }
} 
