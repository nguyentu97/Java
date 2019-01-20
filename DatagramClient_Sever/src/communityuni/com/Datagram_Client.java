package communityuni.com;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Datagram_Client {
	public static void main(String[] args) {
		String hostname;
		int port = 2018;
		int len = 1024;
		DatagramPacket sPacket, rPacket;
		if (args.length > 0) {
			hostname = args[0];
		} else {
			hostname = "192.168.101.4";
		}
		try {
			InetAddress ia = InetAddress.getByName(hostname);
			DatagramSocket datasocket = new DatagramSocket();
			BufferedReader stdinp = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				try {
					System.out.println("Input data : ");
					String echoline = stdinp.readLine();
					if (echoline.equals("done"))
						break;
					byte[] buffer = new byte[echoline.length()];
					buffer = echoline.getBytes();
					sPacket = new DatagramPacket(buffer, buffer.length, ia, port);
					datasocket.send(sPacket);
					byte[] rbuffer = new byte[len];
					rPacket = new DatagramPacket(rbuffer, rbuffer.length);
					datasocket.receive(rPacket);
					String retstring = new String(rPacket.getData(), 0, rPacket.getLength());
/*					
					String arr[] = dataStr.split("\\+");// tách chuỗi theo dấu "+"
					int s = 0;
					int result = 0;
					for (int i = 0; i < arr.length; i++) { // duyệt từng phần tử sau khi tách theo "+"
						s = Integer.parseInt(arr[i]);// ép từ kiểu chuỗi sang kiểu số
						result = result + s; // cộng dồn được tổng result
					
					}
*/				
					System.out.println("Received data from sever : " + retstring);

				} catch (IOException e) {
					System.err.println(e);
				}
			} // while
		} catch (UnknownHostException e) {
			System.err.println(e);
		} catch (SocketException ex) {
			Logger.getLogger(Datagram_Client.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}
