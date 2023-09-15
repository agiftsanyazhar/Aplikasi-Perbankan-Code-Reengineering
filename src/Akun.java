public class Akun extends Register {
    // private String name;
    // private String email;
    // private String cardType;
    // private int accountNumber;
    // private int balance;

    public Akun(String name, String email, String password, String cardType, int balance) {
        // this.name = name;
        // this.email = email;
        // this.cardType = cardType;
        // this.accountNumber = accountNumber;
        // this.balance = balance;

        setName(name);
        setEmail(email);
        setPassword(password);
        setGeneratedPassword(password);
        setCardType(cardType);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }
}
