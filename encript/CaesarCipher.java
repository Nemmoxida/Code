public class CaesarCipher {

    // Metode untuk enkripsi
    public static String encrypt(String plaintext, int shift) {
        StringBuilder ciphertext = new StringBuilder();
        shift = shift % 26; // Menghindari shift lebih dari alfabet (26 huruf)

        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) { // Cek apakah karakter adalah huruf
                char base = Character.isUpperCase(c) ? 'A' : 'a'; // Tentukan base (A atau a)
                c = (char) ((c - base + shift) % 26 + base); // Geser karakter
            }
            ciphertext.append(c); // Tambahkan ke hasil
        }
        return ciphertext.toString();
    }

    // Metode untuk dekripsi
    public static String decrypt(String ciphertext, int shift) {
        return encrypt(ciphertext, 26 - (shift % 26)); // Geser balik ke arah sebaliknya
    }

    // Main method untuk pengujian
    public static void main(String[] args) {
        String plaintext = "Hello World!";
        int shift = 3;

        // Enkripsi
        String ciphertext = encrypt(plaintext, shift);
        System.out.println("Ciphertext: " + ciphertext);

        // Dekripsi
        String decryptedText = decrypt(ciphertext, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}