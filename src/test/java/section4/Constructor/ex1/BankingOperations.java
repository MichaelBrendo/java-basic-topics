package section4.Constructor.ex1;

public class BankingOperations {

    private static final double TAX_WITHDRAW = 5;
    private int accNumber;
    private String holderName;
    private double ccValue;


    public BankingOperations(int accNumber, String holderName) {
        this.accNumber = accNumber;
        this.holderName = holderName;
    }

    public BankingOperations(int accNumber, String holderName, double ccValue) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        this.ccValue = ccValue;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getCcValue(){
        return ccValue;
    }

    public void setCcValue(double ccValue){
        this.ccValue = ccValue;
    }

    public void deposit(double ccValue){
        this.ccValue += ccValue;
    }

    public double withdraw(double ccwithdraw){
        return ccValue = (ccValue - ccwithdraw) - TAX_WITHDRAW;
    }

}
