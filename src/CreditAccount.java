public class CreditAccount extends AbstractAccount implements Credit{
    private double APR;

    public static final double DEFAULT_APR = 30;

    public CreditAccount(){
        super();
        this.APR = DEFAULT_APR;
    }

    public CreditAccount(String number, double balance, double APR){
        super(number,balance);
        setAPR(APR);
    }

    @Override
    public double getAPR() {
        return APR;
    }

    @Override
    public void setAPR(double APR) {
        this.APR = APR;
    }
}