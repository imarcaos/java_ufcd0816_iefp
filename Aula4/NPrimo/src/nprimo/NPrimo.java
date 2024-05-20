/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nprimo;
import java.util.Scanner;
/** *
 * @author Marcos Melo
 * Aula4
 * 2024/05/06
 */
public class NPrimo {    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);         
        int numero= 17;
        int resto= 0;        
        System.out.println("Indique o 1 valor: ");
        numero= scanner.nextInt();        
        
        for(int i=0;i<numero-1;i++) {
            if(i>2){
                resto= numero%i;
                if(resto==0) break;
            }  
        }
        if(resto==0) {
            System.out.println("Nao e um numero primo!");
        } else {
             System.out.println("E um numero primo!");
        }

        // teste que formador passou, criar um loop for com os números
        // de -100 a 0 e do 0 ao -100
        for(int x=0; x>=-100; x-- ){
            System.out.println(x);
        }
    }    
}
