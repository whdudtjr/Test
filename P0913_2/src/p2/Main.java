package p2;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		// 로드
		File file = new File("c:\\temp1\\qqq.qqq");
		try (FileInputStream fis = new FileInputStream(file)){
			DataInputStream dis = new DataInputStream(fis);
			
			String str = dis.readUTF();
			System.out.println(str);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");

	}

	

}

