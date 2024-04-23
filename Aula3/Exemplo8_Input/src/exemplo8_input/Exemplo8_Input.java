/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo8_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Marcos Melo
 * Aula 3 2024-04-23
 */
public class Exemplo8_Input {
    
    public static void main(String[] args) throws IOException {
        System.out.println("Indique um valor: ");
        InputStreamReader i1= new InputStreamReader(System.in);
        BufferedReader r1= new BufferedReader(i1);
        String texto= r1.readLine();
        int valor= Integer.parseInt(texto);
        System.out.println(valor+1);
    }
    
}
