package Assignment1;

public class Customer extends Person{
    private long accountNumber;
    private String address;
    private double balance;
    private Boolean isAccountActive;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Boolean getAccountActive() {
        return isAccountActive;
    }

    public void setAccountActive(Boolean accountActive) {
        isAccountActive = accountActive;
    }

    public String withdrawMoney(double withdraw){
        if (this.balance > withdraw){
            this.balance -= withdraw;
            return "Success";
        }
        else{
            return "Fail";
        }

    }

    public double depositMoney(double depositAmount){
         this.balance += depositAmount;
         return this.balance;
    }

    public double checkBalance(){
        return this.balance;
    }
}
