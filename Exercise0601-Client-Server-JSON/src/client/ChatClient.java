package client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.google.gson.Gson;

import model.Message;

public class ChatClient {
	private Scanner input;
	private DataInputStream in;
	private DataOutputStream out;
	private Socket socket;
	
	public ChatClient(String host, int port) throws UnknownHostException, IOException {
		input = new Scanner(System.in);
		socket = new Socket(host, port);
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
	}
	
	public void execute() throws IOException {
		String temp = "";
		boolean tempBool = true;
		while(tempBool) {
			System.out.println("Write a message to the server");
			temp = input.nextLine();
			if(temp.equalsIgnoreCase("Exit")) {
				tempBool = false;
			}
			Message message = new Message(temp);
			Gson gson = new Gson();
			String json = gson.toJson(message);
			out.writeUTF(json);
		}

		close();
		
	}
	public void close() throws IOException {
		socket.close();
		input.close();
	}

}
