package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatServer {
	private ServerSocket welcomeSocket;
	
	public ChatServer(int port) {
		try {
			welcomeSocket = new ServerSocket(port);
			System.out.println("Server Started");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void execute() throws UnknownHostException, IOException {
		do {
			try {
				Socket connectionSocket = welcomeSocket.accept();
				CommunicationThreadHandler cTH1 = new CommunicationThreadHandler(connectionSocket);
				Thread t1 = new Thread(cTH1);
				t1.start();
			} catch (IOException e) {
				e.printStackTrace();
			}

			
		} while(true);
	}

}
