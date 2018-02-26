package server;

import java.io.IOException;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) throws UnknownHostException, IOException {
		ChatServer ChatServ1 = new ChatServer(6789);
		ChatServ1.execute();

	}

}
