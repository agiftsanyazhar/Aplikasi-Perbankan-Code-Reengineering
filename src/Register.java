public class Register extends Akun {

    public Register(String name, String email, String password, String cardType, int balance) {
        super(email, password);
        setName(name);
        setGeneratedPassword(password);
        setCardType(cardType);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

}
