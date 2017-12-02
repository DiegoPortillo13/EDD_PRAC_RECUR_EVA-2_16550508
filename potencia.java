/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva.pkg2_recursividad_3;

/**
 *
 * @author Familia
 */
public class potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El numero 3 elevado a la 1 es igual a: " + potenciaN(3, 1));
        System.out.println("El numero 3 elevado a la 2 es igual a: " + potenciaN(3, 2));
        System.out.println("El numero 3 elevado a la 3 es igual a: " + potenciaN(3, 3));
    }

    public static int potenciaN(int b, int e) {
        switch (e) {
            case 0:
                return 1;
            case 1:
                return b;
            default:
                return b * potenciaN(b, e - 1);
        }
    }
}
