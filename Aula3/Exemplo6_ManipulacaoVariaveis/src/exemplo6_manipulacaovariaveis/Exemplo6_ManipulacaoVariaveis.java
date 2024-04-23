/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo6_manipulacaovariaveis;

/**
 *
 * @author Marcos Melo
 * Aula 3 2024-04-23
 */
public class Exemplo6_ManipulacaoVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        a=4;
        a++; // a incrementando em 1
        int b;
        b=3;
        int c;
        c=a+b; // c=8
        System.out.println(c);
        
        int d;
        d=b/a; // d=3/5=0
        System.out.println(d);
        
        int e;
        e=b%a; // e resto da divisão 3/5 ou seja 3
        System.out.println(e);
        
        e+=10; // e incrementado em 10 -> e=13
        //e=e+10;
        System.out.println(e);
        
        e=e+2; // e=15
        System.out.println(e);
        
        e-=2; // e=13
        System.out.println(e);
        
        e--; // e=12
        // e-=1;
        System.out.println(e);
        
        int x=0;
        x++;
        x--;
        x+=5;
        x-=1;
        if (++x>4) {
            System.out.println("x maior que 4");
        }
        System.out.println("x=" +x);
        
        
    } // main    
} // class
