public class DebitAccount extends AbstractAccount implements Account{

    public DebitAccount() {
        super();
    }

    public DebitAccount(String number, double balance) {
        super(number,balance);
    }
}
