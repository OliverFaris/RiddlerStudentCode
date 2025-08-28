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

        // Iterate through each char in the encrypted message
        for (int i=0; i< encrypted.length(); i++) {
            // Get ascii value of a char
            ascii = (int) (encrypted.charAt(i));

            // Check if this char is punctuation/space or not
            if (!Character.isAlphabetic(encrypted.charAt(i))) {
                decrypted += encrypted.charAt(i);
            }
            // Check if uppercase/lowercase and adjust the shift accordingly
            else if (Character.isUpperCase(encrypted.charAt(i))) {
                decrypted += (char) ((ascii-65 + 9) % 26 + 65);
            }
            else if (Character.isLowerCase(encrypted.charAt(i))){
                decrypted += (char) ((ascii - 97 + 9) % 26 +97);
            }
        }
        return decrypted;
    }

    public String decryptTwo(String encrypted) {
        String decrypted = "";
        // Make a string of all the numbers
        String[] parsed = encrypted.split(" ");

        // Loop through the whole list of strings/ints
        for (int i=0; i< parsed.length; i++) {
            // Convert to an int and convert the ascii to a char
            decrypted += (char) Integer.parseInt(parsed[i]);
        }
        return decrypted;
    }

    public String decryptThree(String encrypted) {
        String decrypted = "";
        // Iterate through the string 8 bits at a time
        for (int i=0; i<encrypted.length(); i+=8) {
            // Convert the 8 bits to the ascii value and convert to a char
            char c = (char) Integer.parseInt(encrypted.substring(i, i+8), 2);
            decrypted += c;
        }
        return decrypted;
    }

    public String decryptFour(String encrypted) {
        String decrypted = "";
        // Iterate through the encrypted string
        for (int i=0; i<encrypted.length(); i++) {
            // Get the decimal version of the emoji at index i, then subtract the key from it and convert to chars
            char letter = (char) (encrypted.charAt(i) - 9919);
            decrypted += letter;
        }
        return decrypted;
    }
}
