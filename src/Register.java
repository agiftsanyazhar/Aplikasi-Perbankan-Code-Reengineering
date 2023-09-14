public class Register {
    protected String name;
    protected String email;
    protected String password;
    protected String generatedPassword;
    protected String cardType;
    protected int accountNumber;
    protected int balance;

    // Getter
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getGeneratedPassword() {
        return generatedPassword;
    }

    public String getCardType() {
        return cardType;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void setGeneratedPassword(String newGeneratedPassword) {
        this.password = newGeneratedPassword;
    }

    public void setCardType(String newCardType) {
        if (newCardType.equals("0")) {
            this.cardType = "Debit";
        } else if (newCardType.equals("1")) {
            this.cardType = "Credit";
        } else {
            throw new IllegalArgumentException("Invalid card type: " + newCardType);
        }
    }

    public void setAccountNumber(int newAccountNumber) {
        this.accountNumber = (int) (Math.random() * 10000000) + 10000000;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
}
