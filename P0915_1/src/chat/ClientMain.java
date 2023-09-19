package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("[클라이언트] 시작");
		System.out.println("[클라이언트] 서버 접속 중");
		
		try{//소켓이 생성된 동시에 스트림도 자동 생성
			Socket socket = new Socket("home.s0011ec.com", 7122);
			System.out.println("[클라이언트] 서버 접속 성공");
			
			System.out.println("[클라이언트] 사용할 닉네임을 입력해주세요");
			System.out.print("[클라이언트] 입력 > ");
			String nickname = scanner.nextLine();
			
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			dos.writeInt(1);
			dos.writeUTF(nickname);
			
			new SendThread(scanner, socket).start();
			new ReceiveThread(socket).start();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
class SendThread extends Thread{
	private Scanner scn; //주입 받을꺼임
	private Socket socket;//주입 받을꺼임
	private DataOutputStream dos;
	
	public SendThread(Scanner scn, Socket socket) {
		this.scn = scn;
		this.socket = socket;
		
	}
	
	public void run() {
	
		try{
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			
			while(true) {
				//System.out.println("보낼 메세지 (종료=q) >  ");
				String message = scn.nextLine();
				
				if(message.equals("q")) {
					dos.writeInt(3);
					System.out.println("[클라이언트] 프로그램 종료합니다.");
					socket.close();
					
					break;
				}
				
				dos.writeInt(2);
				dos.writeUTF(message);
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}

class ReceiveThread extends Thread{
	private Socket socket;
	
	public ReceiveThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while(true) {
				String message = dis.readUTF();
				System.out.println(message);
			}
			
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("접속이 종료되었습니다.");
		}
	}
}





