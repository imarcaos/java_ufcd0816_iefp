// Aula 2 2024-04-22 - Marcos Melo
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo4_tipos;

/**
 *
 * @author Marcos Melo
 */
public class Exemplo4_tipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char a; // ocupa 1 byte
        a=119; // 'w'
        System.out.println("O código 119 corresponde a " + a + " em ascii");
        // em c: printf("o código %d corresponde a %c em ascii", a, a);
        a=77; // M
        System.out.print(a);
        a=97-32; // a
        System.out.print(a);
        a=114-32; // r
        System.out.print(a);
        a=99-32; // c
        System.out.print(a);
        a=111-32; // o 
        System.out.print(a);
        a=115-32; // s
        System.out.print(a);
        a=0; // null
        System.out.print(" ");
        a=77; // M
        System.out.print(a);
        a=101; // e
        System.out.print(a);
        a=108; // l
        System.out.print(a);
        a=111; // o
        System.out.println(a);
        System.out.println("----------------");
        
        int b; // ocupa 4 bytes
        b= 85;
        System.out.println(b);
       
        boolean c;
        c= ((-1>0) && (2>1)); // &&=AND , basta uma falsa para resultar falso
        System.out.println(c);
       
        boolean d;
        d= ((3>1) || (2<1)); // ||=OR -> False or False = False, basta um verdadeiro para resultar verdadeiro
        System.out.println(d);       
        
        byte b1;
        b1=-128; // valores entre -128~127
        System.out.println(b1);
        
        float e;
        e=13.12f;
        System.out.println(e);
        
        short f;
        f=32767;
        System.out.println(f);
        
        long g;
        g=40000;
        System.out.println(g);
        
        double h;
        h=40000;
        System.out.println(h);
        
        float a1=3.12f;
        int b2=(int)a1;
        System.out.println("O valor convertido é " + b2);
        
        String s="4";
        
        int t;
        t= Integer.parseInt(s);
        System.out.println(t);
    }
    
}
