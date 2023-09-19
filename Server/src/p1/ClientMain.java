package p1;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("클라이언트 프로그램 시작");
		
		
		
		//172.30.1.53(내 ip 주소) = localHost = 127.0.0.1(루프 백 주소)
		
		Socket socket = new Socket("172.30.1.76",7777);//서버에 접속하겠다. IP주소와 포트번호가 무조건 필요하다.
		System.out.println("접속 완료");
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());//보내고 싶으면 Output
		
		System.out.println("서버로 전달할 값 > ");
		String inputValue = scn.nextLine();
		
		dos.writeUTF(inputValue);
		
		System.out.println("서버로 값을 전달하였습니다.");
		System.out.println("클라이언트 종료");
	}

}
