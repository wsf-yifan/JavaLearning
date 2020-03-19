/**
 * 
 */
package com.yifan.javabasic.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author yifan
 *
 */
public class SocketClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		try {
			Socket socket = new Socket("127.0.0.1", 9527);

			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// send message
			pw.println("Client Send Data!");
			pw.flush();

			// receive the data
			String line = br.readLine();
			System.out.println("Received from Server: " + line);

			// release resource
			pw.close();
			br.close();

			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
