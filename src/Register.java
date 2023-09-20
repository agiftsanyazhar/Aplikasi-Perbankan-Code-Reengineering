import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Register extends Nasabah {

    public Register(String name, String email, String password, String cardType, int balance) {
        super(email, password);
        setName(name);
        setGeneratedPassword(password);
        setCardType(cardType);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    // // HASIL BARD! MASIH KURANG PAHAM. JANGAN DIUNCOMMENT
    @Override
    public void setGeneratedPassword(String password) {
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Add password bytes to digest
            md.update(password.getBytes());

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
        // System.out.println(password);
        // System.out.println(generatedPassword);
    }

}
