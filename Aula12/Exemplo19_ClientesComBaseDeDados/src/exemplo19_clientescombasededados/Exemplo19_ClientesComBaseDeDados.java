
package exemplo19_clientescombasededados;

/**
 * @author Marcos Melo
 */
public class Exemplo19_ClientesComBaseDeDados {
    
    public static Encomendas enc;

    public static void main(String[] args) {
        Clientes cli = new Clientes();
        cli.setVisible(true);        
        //(new Clientes()).setVisible(true);
        
        //Encomendas enc = new Encomendas();
        enc = new Encomendas();
        enc.setVisible(true);
        enc.setLocation(420, 0);
        //(new Encomendas()).setVisible(true);
    }
    
}
