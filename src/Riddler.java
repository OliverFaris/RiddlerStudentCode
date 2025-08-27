/**
 * The Riddler:
 * A puzzle by Zach Blick
 * for Adventures in Algorithms
 * At Menlo School in Atherton, CA
 *
 * Completed by: Oliver Faris
 */
public class Riddler {

    public String decryptOne(String encrypted) {
        String decrypted = "";
        int ascii = 0;

        for (int i=0; i< encrypted.length(); i++) {
            // I need to check if a certain char is a letter or not
            ascii = (int) (encrypted.charAt(i));
            decrypted += (char) (ascii+9);
        }
        // TODO: Complete the decryptOne() function.

        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptTwo() function.

        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptThree() function.

        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";

        // TODO: Complete the decryptFour() function.

        return decrypted;
    }
}
