/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo16_contador;

/**
 *
 * @author Marcos Melo
 */
public class Exemplo16_Contador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //(new Classe_Janela()).setVisible(true);
       
       
        int i=0;
        while (i<10) {
            Classe_Janela f1;
            f1 = new Classe_Janela();
            f1.setVisible(true);
            f1.setLocation((int) (Math.random()*500), (int) (Math.random()*500));
            i++;
        }
    }
    
}
