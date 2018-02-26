package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

import com.google.gson.Gson;

import model.Message;

public class CommunicationThreadHandler implements Runnable{
	
	private DataInputStream in;
	private DataOutputStream out;
	private Socket socket;
	private String ip;
	
	public CommunicationThreadHandler(Socket socket) {
		this.socket = socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		ip = socket.getInetAddress().getHostAddress();

	}

	@Override
	public void run(){
		boolean tempBool = true;
		while(tempBool) {
		try {
			String clientText = in.readUTF();
			Gson gson = new Gson();
			Message message = gson.fromJson(clientText, Message.class);
			System.out.println("User " + message.getId()+ ":" + message.getBody());
			 {
			if(message.getBody().equalsIgnoreCase("Exit")) {
				tempBool = false;
			}
			}
		} catch (IOException e) {
		}
		}
		

		
	}

}
