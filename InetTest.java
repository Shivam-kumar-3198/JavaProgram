package JavaProgram;
import java.net.*;

class InetTest {
    public static void main(String[] args) {
        try {
            InetAddress i = InetAddress.getLocalHost();
            System.out.println("LocalHost = " + i);
            System.out.println("LocalHost Name = " + i.getHostName());

            i = InetAddress.getByName("157.240.13.35");
            System.out.println("Address Name = " + i.getHostName());

            i = InetAddress.getByName("google.co.in");
            System.out.println(i.getHostAddress());
            System.out.println(i.isMulticastAddress() ? "Yes" : "No");
            System.out.println(i.isLoopbackAddress() ? "Yes" : "No");

            InetAddress iArr[] = InetAddress.getAllByName("github.co.in");
            for (int k = 0; k < iArr.length; k++) {
                System.out.println(iArr[k]); // Use iArr[k] to access array elements
            }
        } catch (UnknownHostException e) {
            // Handle the exception here
            e.printStackTrace();
        }
    }
}