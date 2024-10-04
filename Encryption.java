package InterPro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Note: Encryption Key acts as Password to Decrypt the same Image, otherwise it will corrupt the Image.");
        
        // Key is used as a password to Encrypt and Decrypt the Image
        System.out.print("Enter key for Encryption: ");
        int key = sc.nextInt();
        
        // Path to the image file
        String inputFilePath = "C:\\Users\\91950\\project\\serverconnectionproject\\serverconnectionproject\\1.jpg";
        String outputFilePath = "C:\\Users\\91950\\project\\serverconnectionproject\\serverconnectionproject\\1_encrypted.jpg";
        
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            
            // Converting Image into byte array, create an array of the same size as Image size
            byte[] data = new byte[fis.available()];
            
            // Read the array
            fis.read(data);
            int i = 0;
            
            // Performing an XOR operation on each value of byte array
            for (byte b : data) {
                data[i] = (byte) (b ^ key);
                i++;
            }
            
            // Writing new byte array value to image which will Encrypt it.
            fos.write(data);
            System.out.println("Encryption Done...");
            
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + inputFilePath);
        } catch (IOException e) {
            System.err.println("I/O error occurred: " + e.getMessage());
        }
        
        sc.close();
    }
}
