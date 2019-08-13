package section4.Constructor.ex1;

public class Account {

    private static final double TAX_WITHDRAW = 5;
    private int accNumber;
    private String holderName;
    private double ccBalance;

    public Account(int accNumber, String holderName) {
        this.accNumber = accNumber;
        this.holderName = holderName;
    }

    public Account(int accNumber, String holderName, double inicialDeposit) {
        this.accNumber = accNumber;
        this.holderName = holderName;
        deposit(inicialDeposit);
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

    public double getCcBalance(){
        return ccBalance;
    }

    public void deposit(double amount){
        ccBalance += amount;
    }

    public double withdraw(double amount){
        return ccBalance = (ccBalance - amount) - TAX_WITHDRAW;
    }

    public String toString(){
        return "Account "
                + getAccNumber()
                + " , holder: "
                + getHolderName()
                + ", Balance: $ "
                + String.format("%.2f", getCcBalance());
    }

}
