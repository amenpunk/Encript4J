import main.java.ming.lib.AES;

/// muercielago
// aes-256
// aes-512

public class Main{
    public static void main(String[] args){
        AES aes = new AES();
        aes.GenerateKey("holamundo");
        String hash = aes.toHexString();
        System.out.println(hash);
    }
}
