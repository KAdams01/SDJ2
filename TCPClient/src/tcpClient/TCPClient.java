package tcpClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TCPClient {
	private static InetAddress host;
	private static final int PORT = 3456;
	
	public static void main(String[] args) {
		try {
			host = InetAddress.getLocalHost();
		} catch (UnknownHostException uhe) {
			System.out.println("Unable to find the Host ID!");
			System.exit(1);
		}
		accessServer();

	}
	
	private static void accessServer() {
		Socket clientSocket = null;
		try {
			clientSocket = new Socket(host, PORT);
			DataInputStream inFromServer = new DataInputStream(clientSocket.getInputStream());
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			Scanner userInput = new Scanner(System.in);
			int tempInt = 1;
			int msg;
			String resp;
			do {
				System.out.println("Please enter integer number " + String.valueOf(tempInt));
				tempInt++;
				msg = userInput.nextInt();
				outToServer.writeInt(msg);
				try {
				resp = inFromServer.readUTF();
				System.out.println("\nFROM SERVER> " + resp);
				} catch (EOFException e) {
					System.out.println("Connection to the server closed.");
				}
				
			} while (msg != 0);
			userInput.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (NoSuchElementException nse) {
			System.out.println("NoSuchElementException");
		} finally {
			try {
				clientSocket.close();
			} catch (IOException ioe) {
				System.out.println("Unable to close the connection to the server!");
				System.exit(1);
			}
		}
		
	}

}
