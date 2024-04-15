/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo3_float;

/**
 *
 * @author Marcos Melo
 */
public class Exemplo3_Float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float y= 3.4e38f; // e equivale x 10^= 3.4x10
        System.out.println(y);
        
        y=45.7f;
        int z=(int)y; // faz o casting de float para int
        System.out.println(z);
        
        double c;
        c= 1.79e308;
        //1.797693134486
        System.out.println(c);
        
        int a= 3;
        int b= 2;
        float quociente=(float)(a/b);
        System.out.println("quociente: "+quociente);
    }
    
}
