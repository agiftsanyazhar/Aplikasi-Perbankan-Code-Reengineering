import java.time.LocalDateTime;
import java.util.ArrayList;

public class Transaksi extends Nasabah {
    private LocalDateTime date;
    private String transactionType;
    private String description;
    private int amount;
    private ArrayList<String> history;
    private Nasabah nasabah;

    public Transaksi(Nasabah newNasabah, LocalDateTime newDate, int newAmount) {
        super(newNasabah.getEmail(), newNasabah.getPassword());
        this.date = newDate;
        this.amount = newAmount;
        this.history = new ArrayList<>();
        this.nasabah = newNasabah;
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

    public int getAmount() {
        return amount;
    }

    public ArrayList<String> getHistory() {
        return history;
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

    public void deposit(int newAmount) {
        if (newAmount > 0) {
            nasabah.setBalance(nasabah.getBalance() + newAmount);
            // nasabah.balance += newAmount;
            history.add("Deposit: " + newAmount + " | Date: " + LocalDateTime.now());

            System.out.println("Transaction added to history: " + history);
            System.out.println("");

            // System.out.println(nasabah.getBalance());
            // System.out.println("Date: " + LocalDateTime.now());

            // displayHistory();
        }
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
        System.out.println("Displaying history");
        System.out.println(history);
        for (String transaction : history) {
            System.out.println(transaction);
        }
        System.out.println("");
    }

}
