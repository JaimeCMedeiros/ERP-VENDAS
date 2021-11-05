
package erp.jdbc;
import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        try {
            new ConnectionFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Deu Certo!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ferrou" + " "+ e);
        }
    }
}
