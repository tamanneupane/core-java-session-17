package objectbasic.bank;

 public class BankAccount {

    // 27.67385304712147, 85.36163799574742

    //States
    /*
        Account Number - String
        Account Holder Name - String
        Bank Name - String
        Customer Id - String
        Routing Number - int
        Account Opening Date - String
        Account Type - String
        Has Debit Card - boolean
        Has Credit Card - boolean
        Account Balance - double
        Account Ownership
        Statements
        Nominee / Beneficiary Name
        Signature Image
        is Locked - boolean
        ssn
    */

    private String accountNumber;
    private String accountHolderName;
    private String bankName;
    private String customerId;
    private int routingNumber;
    private String accountOpeningDate;
    private String accountType;
    private boolean hasDebitCard;
    private boolean hasCreditCard;
    private double accountBalance;
    private  boolean isLocked;
    private String ssn;
//    private String country;
//    private String state;
//    private  String city;
//    private String streetAddress;

     private Address address;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(int routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public boolean isHasDebitCard() {
        return hasDebitCard;
    }

    public void setHasDebitCard(boolean hasDebitCard) {
        this.hasDebitCard = hasDebitCard;
    }

    public boolean isHasCreditCard() {
        return hasCreditCard;
    }

    public void setHasCreditCard(boolean hasCreditCard) {
        this.hasCreditCard = hasCreditCard;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void withDraw(double withdrawAmount){
        this.accountBalance = this.accountBalance - withdrawAmount;
    }

    public void deposit(double amount){
        this.accountBalance = this.accountBalance + amount;
    }

    void transfer(){

    }



//Constructors


    // Behaviour
}
