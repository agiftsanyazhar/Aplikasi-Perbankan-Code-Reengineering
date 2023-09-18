import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Review Java (Encapsulation)
        // Scanner scanner = new Scanner(System.in);

        // Nasabah myObj = new Nasabah();

        // System.out.println("Enter username: ");
        // String userName = scanner.nextLine();
        // myObj.setName(userName);
        // System.out.println("Username is: " + myObj.getName());

        // scanner.close();

        Scanner scanner = new Scanner(System.in);

        int inputOption;

        System.out.println("==============================");
        System.out.println("Welcome!");
        System.out.println("==============================");

        System.out.println("Welcome to the BankMo");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("");
        System.out.print("Enter an option: ");
        inputOption = scanner.nextInt();

        scanner.nextLine();

        System.out.println("");

        switch (inputOption) {
            case 1:
                // Login login = new Login();
                break;
            case 2:
                Register register = new Register();

                System.out.print("Enter Your Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Your Email: ");
                String email = scanner.nextLine();

                System.out.print("Enter Your Password: ");
                String password = scanner.nextLine();

                System.out.println("Which Card Type Do You Want The Account To Be Initialized In?:");
                System.out.println("[0] Debit\r\n" + //
                        "[1] Credit");
                System.out.print("Your choice [0-1]: ");
                String cardType = scanner.nextLine();

                System.out.print("Deposit Your First Balance: ");
                int balance = scanner.nextInt();

                // Menyimpan akun
                register.setName(name);
                register.setEmail(email);
                register.setPassword(password);
                register.setGeneratedPassword(password);
                register.setCardType(cardType);
                register.setBalance(balance);

                // Buat akun dari constructor yang extends Register
                Akun akun = new Akun(name, email, password, cardType, balance);

                System.out.println("");
                System.out.println("Account created successfully. Please login");
                System.out.println("Name: " + akun.getName());
                System.out.println("Email: " + akun.getEmail());
                System.out.println("Password: " + akun.getPassword());
                System.out.println("Password Hash: " + akun.getGeneratedPassword());
                System.out.println("Card Type: " + akun.getCardType());
                System.out.println("Account Number: " + akun.getAccountNumber());
                System.out.println("Account Balance: " + akun.getBalance());

                break;
            default:
                System.out.println("Invalid option. Try again");
                break;
        }

        scanner.close();
    }
}
