import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkDetails {

    public static void main(String[] args) {
        try {
            // Get local host details
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("Host IP Address: " + localHost.getHostAddress());

            // Get network interfaces and associated details
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                System.out.println("\nNetwork Interface: " + networkInterface.getName());
                System.out.println("Display Name: " + networkInterface.getDisplayName());

                // Get IP addresses associated with this network interface
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = inetAddresses.nextElement();
                    System.out.println("InetAddress: " + inetAddress.getHostAddress());
                }
            }
        } catch (UnknownHostException e) {
            System.err.println("Unknown Host Exception: " + e.getMessage());
        } catch (SocketException e) {
            System.err.println("Socket Exception: " + e.getMessage());
        }
    }
}
