/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo9_classe;

//import java.util.Scanner;

import veiculos.Bicicleta;
import veiculos.Triciclo;

/**
 * @author Marcos Melo
 * Aula6
 * criado: 2024/05/20
 * Atualizado_ 2027/05/23
 */
public class Exemplo9_classe {

    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        //b1.cor = "Azul bebé";
        
        Triciclo t1 = new Triciclo();        
        t1.distanciaEntreEixos = 3;
        t1.cor= 2;
        
        t1.DefinirAtributo1(25);
        System.out.println(t1.ObterAtributo());
        //BicicletaComMotor bm1 = new BicicletaComMotor();
    }
    
}
