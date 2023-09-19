package p1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		// 파일 입출력: 로우레벨의 API는 사실상 쓸 일이 많지 않음
		
		int a = 10;
		
		File file = new File("C:\\temp1\\qqq.qqq");
		try(FileOutputStream fos = new FileOutputStream(file)){
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF("안녕하세요");
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
