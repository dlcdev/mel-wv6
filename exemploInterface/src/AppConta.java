import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaEspecial;
import util.MongoDB;
import util.MySQL;

import java.util.ArrayList;
import java.util.HashMap;

public class AppConta {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(111);
        ContaEspecial ce1 = new ContaEspecial(222, 1000);

        ArrayList<Conta> contas = new ArrayList();
        HashMap<Integer, Conta> mapaDeContas = new HashMap<>();

        contas.add(cc1);
        contas.add(ce1);

        MySQL mySQL = new MySQL();
        MongoDB mongoDb = new MongoDB();

       for (Conta conta: contas ) {
           System.out.println("Conta: " + conta.getNumber());
       }

//        cc1.gravar(mySQL);
//        ce1.gravar(mongoDb);

        mapaDeContas.put(cc1.getNumber(), cc1);
        mapaDeContas.put(ce1.getNumber(), ce1);

        Conta contaEncontrada = mapaDeContas.get(111);

        System.out.println("Conta: " + contaEncontrada.getNumber());



    }
}
