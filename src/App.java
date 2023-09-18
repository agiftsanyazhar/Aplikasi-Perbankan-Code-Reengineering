import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;
import java.io.IOException;

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
        boolean registered = false;
        boolean loggedIn = false;

        System.out.println("==============================");
        System.out.println("Welcome!");
        System.out.println("==============================");

        System.out.println("Welcome to the BankMo");
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        System.out.println("[3] Exit");
        System.out.println("");

        System.out.print("Enter an option: ");
        inputOption = scanner.nextInt();

        scanner.nextLine();
        System.out.println("");

        switch (inputOption) {
            case 1:
                // Login login = new Login();

                System.out.println("==============================");
                System.out.println("Login");
                System.out.println("==============================");

                // System.out.print("Enter Your Name: ");
                // String name = scanner.nextLine();

                // System.out.print("Enter Your Email: ");
                // String email = scanner.nextLine();

                // System.out.print("Enter Your Password: ");
                // String password = scanner.nextLine();

                break;
            case 2:
                System.out.println("==============================");
                System.out.println("Register");
                System.out.println("==============================");

                System.out.print("Enter Your Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Your Email: ");
                String email = scanner.nextLine();

                System.out.print("Enter Your Password: ");
                String password = scanner.nextLine();

                System.out.println("Which Card Type Do You Want The Account To Be Initialized In?:");
                System.out.println("[1] Debit\r\n" + //
                        "[2] Credit");
                System.out.print("Your choice [1-2]: ");
                String cardType = scanner.nextLine();

                System.out.print("Deposit Your First Balance: ");
                int balance = scanner.nextInt();

                // Buat akun dari constructor yang extends Register
                Register register = new Register(name, email, password, cardType, balance);

                // Buat akun sukses
                System.out.println("");
                System.out.println("Account created successfully. Please login");
                System.out.println("Name: " + register.getName());
                System.out.println("Email: " + register.getEmail());
                System.out.println("Card Type: " + register.getCardType());
                System.out.println("Account Number: " + register.getAccountNumber());
                System.out.println("Account Balance: " + register.getBalance());

                // // HASIL BARD! MASIH KURANG PAHAM. JANGAN DIUNCOMMENT
                // // Create a new StringBuilder object
                // StringBuilder sb = new StringBuilder();

                // // Append the fields of the Register object to the StringBuilder object in
                // // JSON
                // // format
                // sb.append("[");
                // sb.append("{");
                // sb.append("\"id\": \"").append(register.getId()).append("\",");
                // sb.append("\"name\": \"").append(register.getName()).append("\",");
                // sb.append("\"email\": \"").append(register.getEmail()).append("\",");
                // sb.append("\"cardType\": \"").append(register.getCardType()).append("\",");
                // sb.append("\"accountNumber\":
                // \"").append(register.getAccountNumber()).append("\",");
                // sb.append("\"balance\": ").append(register.getBalance());
                // sb.append("}");
                // sb.append("]");

                // // Convert the StringBuilder object to a String object
                // String json = sb.toString();

                // // Save the String object to a file
                // Writer writer = new FileWriter("nasabah.json");
                // writer.write(json);
                // writer.close();

                scanner.nextLine();
                System.out.println("");

                while (!loggedIn) {
                    System.out.println("==============================");
                    System.out.println("Login");
                    System.out.println("==============================");

                    System.out.print("Enter Your Email: ");
                    String inputEmailLogin = scanner.nextLine();

                    System.out.print("Enter Your Password: ");
                    String inputPasswrodLogin = scanner.nextLine();

                    Login login = new Login(inputEmailLogin, inputPasswrodLogin);
                    String emailLogin = login.getEmail();
                    String passwordLogin = login.getPassword();

                    if (!(emailLogin.equals(register.getEmail()) && passwordLogin.equals(register.getPassword()))) {
                        System.out.println("");
                        System.out.println("Login failed. Try again.");
                        System.out.println("[1] Retry login");
                        System.out.println("[2] Exit");

                        System.out.print("Your choice [1-2]: ");
                        String choice = scanner.nextLine();

                        if (choice.equals("2")) {
                            System.out.println("");
                            System.out.println("Exiting login.");
                            break;
                        }
                    } else {
                        loggedIn = true;
                    }
                }

                System.out.println("\n");
                System.out.println("==============================");
                System.out.println("Welcome " + register.getName() + "!");
                System.out.println("==============================");

                do {
                    System.out.println("Welcome to the BankMo");
                    System.out.println("[1] Account Info");
                    System.out.println("[2] Deposit");
                    System.out.println("[3] Withdraw");
                    System.out.println("[4] Transfer");
                    System.out.println("[5] Exit");
                    System.out.println("");

                    System.out.print("Enter an option: ");
                    inputOption = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("");
                } while (loggedIn && );

                break;
            case 3:
                System.out.println("See you soon...");
                break;
            default:
                System.out.println("Invalid option. Try again");
                break;
        }

        scanner.close();
    }
}
