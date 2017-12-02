/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class pares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(par("yyzzza"));
    }
     public static String par(String lel) {
        if (lel.length() == 1)  
            return lel;
        if (lel.charAt(0)==lel.charAt(1)) {
            return par(lel.substring(1));
        }else{
            return lel.charAt(0)+par(lel.substring(1));
        }}
   
        
}

