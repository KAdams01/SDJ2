package tcpServer;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
	private static ServerSocket welcomingSocket;
	private static final int PORT = 3456;
	private static String clientIP;

	public static void main(String[] args) {
		System.out.println("Starting Server...");
		
		try {
			welcomingSocket = new ServerSocket(PORT);
		} catch (IOException ioe){
			System.out.println("Unble to connect with the given port!");
			System.exit(1);
		}
		do {
			System.out.println("Waiting for a client...");
			handleClient();
		} while(true);

	}
	private static void handleClient() {
		Socket connSocket = null;
		
		try {
			connSocket = welcomingSocket.accept();
			clientIP = connSocket.getInetAddress().getHostAddress();
			System.out.println("Welcome " + clientIP);
			
			DataInputStream inFromClient = new DataInputStream(connSocket.getInputStream());
			DataOutputStream outToClient = new DataOutputStream(connSocket.getOutputStream());
			
			int msgCount = 0;
			
//			String message = inFromClient.readUTF();
			int tempInt1 = inFromClient.readInt();
			while(tempInt1 != 0) {
				System.out.println("Received Message. OK!");
				msgCount++;
				outToClient.writeUTF("Message number " + msgCount + ": " + tempInt1);
//				message = inFromClient.readUTF();
				tempInt1 = inFromClient.readInt();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		try {
			System.out.println("\nNow closing connection...");
			connSocket.close();
		} catch (IOException e) {
			System.out.println("Unable to close the connection!");
			System.exit(1);
		}
	}

}
