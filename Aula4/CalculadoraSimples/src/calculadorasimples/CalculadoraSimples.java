/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorasimples;

import java.util.Scanner;

/**
 *
 * @author Marcos Melo
 * Aula4: 2024/05/06
 */
public class CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        
        int escolha;         
        do{
            System.out.println("Menu opcoes(1=Loop,2=Operacoes,0=Sair): ");
            escolha= scanner.nextInt();
            
            switch(escolha) {
                case 1:
                    cicloCalc();
                    break;
                case 2:
                    calcularOperacao();
                    break;                    
            }                          
        }while(escolha!=0);                          
    }
    
    
    public static void calcularOperacao() {
        Scanner scanner= new Scanner(System.in);
                 
        Double valor1, valor2;
        Double resultCalculo= 0.0;   
        String operacao;      
        
        System.out.println("Indique o 1 valor: ");
        valor1= scanner.nextDouble();
        
        System.out.println("Digite a operacao(+,-,/,*):  ");
        operacao= scanner.next();
        
        System.out.println("Indique o 2 valor: ");
        valor2= scanner.nextDouble();
            
            switch(operacao) {
                case "+":
                    resultCalculo= valor1+valor2;
                    break;
                case "-":
                    resultCalculo= valor1-valor2;
                    break;
                case "/":
                    resultCalculo= valor1/valor2;
                    break;
                case "*":
                    resultCalculo= valor1*valor2;
                    break;
                default:
                    System.out.println("Operação Invalida!");                    
            }
            System.out.println("O resultado da operacao "+valor1+operacao+valor2+"= "+resultCalculo);
    }  
    
    public static void cicloCalc() {
        Scanner scanner= new Scanner(System.in);                
        Double valor1, valor2;  
                
        for(int i=0;i<3;i++) {
            System.out.println("Indique o 1 valor: ");
            valor1= scanner.nextDouble();        
            System.out.println("Indique o 2 valor: ");
            valor2= scanner.nextDouble();
            
            System.out.println("O valor da soma e: "+(valor1+valor2));
            System.out.println("O valor da Subtracao e: "+(valor1-valor2));
            System.out.println("O valor da Divisao e: "+(valor1/valor2));
            System.out.println("O valor da Multiplicacao e: "+(valor1*valor2));
        }
        
    }
}