/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo5_for;

/**
 *
 * @author Marcos Melo
 * Aula 2 2024-04-22
 */
public class Exemplo5_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (int i=0;i<10;i++) {
            System.out.println("For 1 -> " + i);
        }
        
        System.out.println("------------------------");
        int i=0;
        for (;;) {
            if (i>=10)
                break;
            System.out.println("For 2 -> " + i);
            i=i+1;  
        }
        
        System.out.println("------------------------");
        int k=0;
        while (k<10) {
            System.out.println(k);
            k++;
        }
        
//        Tarefa:
//        com for ou while mostrar todos os avlores de 100 a -100 
//        com saltos de 10: 100, 90, 80, 70, ......, 10, 0 , -10, -20, -30, ....-90, -100
        System.out.println("---------- Tarefa 1 ----------");
        int c=100;
        while (c>=-100) {
            System.out.println("Valor Descrescente de 10: " + c);
            c-=10;
        }
    }
    
}
