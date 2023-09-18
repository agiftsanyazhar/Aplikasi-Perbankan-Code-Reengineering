import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
// import BCrypt;

public class Nasabah {
  // Encapsulation
  // private String name;

  // // Getter
  // public String getName() {
  // return name;
  // }

  // // Setter
  // public void setName(String newName) {
  // this.name = newName;
  // }
  protected int id = 1;
  protected String name;
  protected String email;
  protected String password;
  protected String generatedPassword;
  protected String cardType;
  protected int accountNumber;
  protected int balance;

  // Constructor yang menerima parameter email dan password
  public Nasabah(String newEmail, String newPassword) {
    this.email = newEmail;
    this.password = newPassword;
  }

  // Getter
  public int getId() {
    return id;
  }

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
  public void setId(int newId) {
    this.id = id++;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setGeneratedPassword(String newGeneratedPassword) {
    String originalPassword = newGeneratedPassword;
    passwordHash(originalPassword);
  }

  public void passwordHash(String originalPassword) {
    // String generatedBcrypt = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
    // System.out.println(generatedBcrypt);
    // this.password = generatedBcrypt;

    // boolean matched = BCrypt.checkpw(originalPassword, generatedBcrypt);
    // System.out.println(matched);
    try {
      // Create MessageDigest instance for MD5
      MessageDigest md = MessageDigest.getInstance("MD5");

      // Add password bytes to digest
      md.update(originalPassword.getBytes());

      // Get the hash's bytes
      byte[] bytes = md.digest();

      // This bytes[] has bytes in decimal format. Convert it to hexadecimal format
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < bytes.length; i++) {
        sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
      }

      // Get complete hashed password in hex format
      generatedPassword = sb.toString();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    // System.out.println(generatedPassword);
  }

  public void setCardType(String newCardType) {
    switch (newCardType) {
      case "1":
        this.cardType = "Debit";
        break;
      case "2":
        this.cardType = "Credit";
        break;
      default:
        break;
    }
  }

  public void setAccountNumber(int newAccountNumber) {
    this.accountNumber = (int) (Math.random() * 10000000) + 10000000;
  }

  public void setBalance(int newBalance) {
    this.balance = newBalance;
  }

}
