package client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		ChatClient c1 = new ChatClient(InetAddress.getLocalHost().getHostAddress(),6789);
		c1.execute();

	}

}
