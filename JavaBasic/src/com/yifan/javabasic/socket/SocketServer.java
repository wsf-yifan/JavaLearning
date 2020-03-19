/**
 * 
 */
package com.yifan.javabasic.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

/**
 * @author yifan
 *
 */
public class SocketServer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		try {
			System.out.println("Socket Server Started.");

			ServerSocket server = new ServerSocket(9527);
			Socket socket = server.accept();

			// Get the data from client
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String msg = br.readLine();
			System.out.println("Received from client: " + msg);

			// send data to the client
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			pw.println("Server Received the message from client, msg:" + msg);

			pw.flush();

			// release all the sources
			pw.close();
			br.close();
			socket.close();
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
