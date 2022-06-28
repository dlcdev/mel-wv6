import modelo.ContaCorrente;
import modelo.ContaEspecial;
import util.MongoDB;
import util.MySQL;

public class AppConta {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial ce1 = new ContaEspecial(222, 1000);

        MySQL mySQL = new MySQL();
        MongoDB mongoDb = new MongoDB();

        cc1.gravar(mySQL);
        ce1.gravar(mongoDb);

    }
}
