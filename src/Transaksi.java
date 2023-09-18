import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaksi extends Nasabah {
    private LocalDateTime date;
    private String transactionType;
    private String description;
    private int accountNumber;
    private int balance;
    private int amount;
    private List<String> history;
    private Nasabah nasabah;

    public Transaksi(Nasabah nasabah, LocalDateTime newDate, int newAmount) {
        super(nasabah.getEmail(), nasabah.getPassword());
        this.date = newDate;
        this.amount = newAmount;
        this.history = new ArrayList<>();
        this.nasabah = nasabah;
    }

    // Getter
    public LocalDateTime getDate() {
        return date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getDescription() {
        return description;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getAmount() {
        return amount;
    }

    // Setter
    public void setTransactionType(String newTransactionType) {
        switch (newTransactionType) {
            case "2":
                this.transactionType = "Deposit";
                break;
            case "3":
                this.transactionType = "Withdraw";
                break;
            case "4":
                this.transactionType = "Trasnfer";
                break;
            case "5":
                this.transactionType = "History";
                break;
            default:
                break;
        }
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public void infoAkun() {
        System.out.println("==============================");
        System.out.println("Account Info");
        System.out.println("==============================");
        System.out.println("Account Number: " + nasabah.getAccountNumber());
        System.out.println("Card Type: " + nasabah.getCardType());
        System.out.println("Name: " + nasabah.getName());
        System.out.println("Email: " + nasabah.getEmail());
        System.out.println("Account Balance: " + nasabah.getBalance());
        System.out.println("");
    }

    // Menampilkan history
    public void displayHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (String transaction : history) {
            System.out.println(transaction);
        }
    }

}
