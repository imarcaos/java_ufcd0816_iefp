/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo7_strings;

/**
 *
 * @author Marcos Melo
 * Aula 3 2024-04-23
 */
public class Exemplo7_Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String metade1;
        String metade2;
        String total;
        
        metade1= "corona";
        System.out.println(metade1);
        
        metade2= "virus";
        System.out.println(metade2);
        
        total= metade1+" "+metade2; // total é a concatenação de metade1 e metade2
        System.out.println(total);
        
        int c=total.length();
        System.out.println(c);
        
        String pequenina=total.substring(6, 11);
        System.out.println(pequenina);
        
        String depois= total.replaceAll("ona", "ina");
        System.out.println(depois);
        
        int igual=depois.compareToIgnoreCase("corinavirus");
        System.out.println(igual);
        
        int indice=depois.indexOf("ina");
        System.out.println("indexOf: " + indice);
        
        depois=depois.toUpperCase();
        System.out.println("toUppercase: " + depois);
        
        depois=depois.toLowerCase();
        System.out.println("toLowerCase: " + depois);
        
        depois= depois.substring(0,1).toUpperCase()+depois.substring(1);
        System.out.println("upperCase First word: " + depois);
        
        
        // Tarefa 2
        //separar nome próprio e apelido, sabendo que o que separa é o espaço em branco
        //usar os métodos indexOf e substring e pôr em duas instância
        String s1= "marcos melo";
        String firstName, lastName, upFN, upLN;
        int eS = s1.indexOf(" "); // eS empty space
        firstName= s1.substring(0,eS);
        lastName= s1.substring(eS+1);
        upFN= firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        upLN= firstName.substring(0,1).toUpperCase()+lastName.substring(1);
        System.out.println("---------- Tarefa 2 ----------");
        System.out.println(upFN);
        System.out.println(upLN);   
        
        
    } // main    
} // class
