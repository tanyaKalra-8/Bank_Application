public class HDFCAccount implements Bankinterface {

    private int balance;
    private String name;
    private String password;
    private String accountNo;
    private double rateOfInterest;

    public HDFCAccount( String name,int balance, String password) {
        this.balance = balance;
        this.name = name;
        this.password = password;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        balance+=amount;
        return "Amount credited: " + amount;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(enteredPassword.equals(password)){
            if(amount>balance){
                return "Insufficient Balance";
            }
            else{
                return "Amount Debited: " + amount;
            }
        }
        else{
            return "Incorrect Password";
        }
    }

    @Override
    public double calculateInterest(int time) {

        return (balance*rateOfInterest*time)/100;
    }
}
