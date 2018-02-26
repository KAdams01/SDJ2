package tcpClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain
{
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		for(int i = 0; i<1;i++) {
		final int PORT = 2910;
		final String HOST = "10.152.250.10";

		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
		Socket clientSocket = new Socket(HOST, PORT);
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
//		System.out.print("Enter study number and name: ");
//		String sentence = inFromUser.readLine();
		String sentence = " ^---- This guy sucks    ";
		System.out.println("Client> " + sentence);
		outToServer.println(sentence);
		String modifiedSentence = inFromServer.readLine();
		System.out.println("Server> " + modifiedSentence);
		clientSocket.close();
		}
	}
}
