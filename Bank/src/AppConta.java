import models.CountBasic;
import models.CountCollectors;
import models.CountExecutives;
import util.*;

public class AppConta {
    public static void main(String[] args) {


        CountBasic c1b = new CountBasic(1, "Bob", 33, 33333);
        Balance balance = new Balance();
        balance.transaction(c1b);
        c1b.transactionOk();

        CountExecutives c1e = new CountExecutives(2, "Bo2", 45, 333444);
        PaymentService paymentService = new PaymentService();
        paymentService.transaction(c1e);
        Transfer transfer = new Transfer();
        transfer.transaction(c1e);
        c1e.transactionOk();


        CountCollectors c1c = new CountCollectors(2, "Bo2", 43, 33334443);
        WithDrawMoney withDrawMoney = new WithDrawMoney();
        withDrawMoney.transaction(c1c);
        c1e.transactionNotOk();



    }
}
