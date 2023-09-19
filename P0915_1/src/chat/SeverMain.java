package chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Vector;

public class SeverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[서버] 가동 시작...");
		
		try(ServerSocket serverSocket = new ServerSocket(8888)) {
		
			while(true) {
				Socket socket = serverSocket.accept();
				
				new ServerReceiveThread(socket).start();
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}


class ServerReceiveThread extends Thread{
	
	private String nickname;
	private Socket socket;
	
	public ServerReceiveThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			
			while(true) {
				int command = dis.readInt();
				
				if(command == 1) {
					nickname = dis.readUTF();
					ClientDto clientDto = new ClientDto(nickname, socket);
					
					BroadCastor.list.add(clientDto);
					
					BroadCastor.broadCast(nickname + "님이 입장하셨습니다");
					
					
				}else if(command == 2) {
					String message = dis.readUTF();
					BroadCastor.broadCast(nickname + "] " + message);
				}else if(command == 3) {
					for(ClientDto clientDto : BroadCastor.list) {
						if(clientDto.getSocket() == socket) {
							BroadCastor.list.remove(clientDto);
							break;
						}
					}
					BroadCastor.broadCast(nickname + "님이 퇴장하셨습니다.");
					socket.close();
					break;
				}
			}
			
			
			
		}catch(Exception e){
			for(ClientDto clientDto : BroadCastor.list) {
				if(clientDto.getSocket() == socket) {
					BroadCastor.list.remove(clientDto);
					BroadCastor.broadCast(nickname + "님이 접속 종료되었습니다.");
				}
			}
			
		}
	}
}
class BroadCastor{
	public static List<ClientDto> list = new Vector<>();
	
	public static void broadCast(String message) {
		
		System.out.println("서버 테스트: " + message);
		
		for(ClientDto clientDto : list) {
			try {
				DataOutputStream dos = new DataOutputStream(clientDto.getSocket().getOutputStream());
				
				dos.writeUTF(message);
				
			}catch(Exception e) {
				//e.printStackTrace();
			}
		}
	}
}

class ClientDto{
	private String nickname;
	private Socket socket;
	
	public ClientDto(String nickname, Socket socket) {
		super();
		this.nickname = nickname;
		this.socket = socket;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	
}











