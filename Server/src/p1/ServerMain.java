package p1;


import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("서버 가동 시작");
		ServerSocket serverSocket = new ServerSocket(7777);
		
		System.out.println("접속 대기 중");
		Socket socket = serverSocket.accept();//접속할 때까지 멈춰있음
		
		System.out.println("접속 완료");
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());//받고싶으면 Input 
		System.out.println("값 수신 대기중..");
		String value = dis.readUTF();
		
		System.out.println("수신 값: " + value);
		
		System.out.println("서버 종료");
	}

}
