


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Familia
 */
public class suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La suma de los digitos de 126 es de: "+SumaRecur(126));
        System.out.println("La suma de los digitos de 49 es de: "+SumaRecur(49));
        System.out.println("La suma de los digitos de 12 es de: "+SumaRecur(12));
        
        
    }
    public static int SumaRecur(int Num){
        if (Num < 10) {
            return Num;
        }else{
           return SumaRecur(Num/10)+(Num%10);
        }
    }
}

    
