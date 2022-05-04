import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        boolean runCipher = true;

        while (runCipher) {

            System.out.println("Welcome to my Caesar Cipher");
            System.out.println("============================");
            System.out.println("Enter encrypt to encrypt or decrypt to decrypt or exit to leave the app");
            String choice = myScanner.nextLine();

           switch (choice) {
               case "encrypt" -> {
                    break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                    System.out.println("To decrypt a message enter the message below");
                    String input = myScanner.nextLine();
                    System.out.println("============================");
                    System.out.println("Enter a key");
                    int key = myScanner.nextInt();
                    System.out.println("============================");
                    Enscrypt cipher = new Enscrypt(input, key);
                    String encrypted = Enscrypt.encrypt(cipher);
                    System.out.println("Encrypted message: " + encrypted);
                    System.out.println("============================");
                    System.out.println("============================");
                    System.out.println("============================");
                }
                case "decrypt" -> {
                    System.out.println("To decrypt a message enter the message below");
                    String seam = myScanner.nextLine();
                    System.out.println("============================");
                    System.out.println("Enter the key you used");
                    int nab = myScanner.nextInt();
                    System.out.println("============================");
                    Descrypt ceaser = new Descrypt(seam, nab);
                    String decrypted = Descrypt.decrypt(ceaser);
                    System.out.println("Decrypted message: " + decrypted);
                    System.out.println("============================");
                    System.out.println("============================");
                    System.out.println("============================");
                }
                case "exit" -> runCipher = false;

            }
        }
    }
}
