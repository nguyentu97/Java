package communityuni.com;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Datagram_Sever {
    public static void main(String[] args) {
       DatagramPacket datapacket,returnpacket;
       int port = 2018;
       int len = 1024;
       try{
           DatagramSocket datagramsocket = new DatagramSocket(port);
           byte[] buf = new byte[len];
           while (true) {
               try {
                   System.out.println("Waiting data from cliens...");
                   datapacket = new DatagramPacket(buf,buf.length);
                   datagramsocket.receive(datapacket);
                   String dataStr = new String(datapacket.getData());		
                   System.out.println(dataStr);
                   String a = dataStr;
                   System.out.println(a);
                   					
					String arr[] = a.split("\\+");// tách chuỗi theo dấu "+"
					int s ;
					int result =0;
					String str ="";
					for (String x : arr) { 
						
						System.out.println(x);
						//result = result+ s; 
					}
//					str = str+ result;
//					System.out.println(str);
                   //System.out.println("Received data from client"+datapacket.getAddress()+"-"+result);
                   returnpacket = new DatagramPacket(datapacket.getData(),datapacket.getLength(),datapacket.getAddress(),datapacket.getPort());
                   datagramsocket.send(returnpacket);
               } catch (IOException e) {
                   System.err.println(e);
               }             
           }
       } catch (SocketException se) {
            System.err.println(se);
        }
    }
    
}
