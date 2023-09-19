package p1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) {
		// 코드로 비트맵 이미지를 생성하자
		
		File file = new File("C:\\temp1\\test.bmp");
		try(FileOutputStream fos = new FileOutputStream(file)) {
			DataOutputStream dos = new DataOutputStream(fos);
			
			// 헤더 영역 (메타 데이터)
			dos.write('B');
			dos.write('M');
			
			dos.write(30054);
			dos.write(30054 >> 8);
			dos.write(30054 >> 16);
			dos.write(30054 >> 24);
			
			dos.write(0);
			dos.write(0);
			dos.write(0);
			dos.write(0);
			
			dos.write(54);
			dos.write(54 >> 8);
			dos.write(54 >> 16);
			dos.write(54 >> 24);
			
			dos.write(40);
			dos.write(40 >> 8);
			dos.write(40 >> 16);
			dos.write(40 >> 24);
			
			//가로
			dos.write(100);
			dos.write(100 >> 8);
			dos.write(100 >> 16);
			dos.write(100 >> 24);
			
			//세로
			dos.write(100);
			dos.write(100 >> 8);
			dos.write(100 >> 16);
			dos.write(100 >> 24);
			
			dos.write(1);
			dos.write(1>>8);
			
			dos.write(24);
			dos.write(24 >> 8);
			
			dos.write(0);
			dos.write(0>>8);
			dos.write(0>>16);
			dos.write(0>>24);
			
			dos.write(30000);
			dos.write(30000 >> 8);
			dos.write(30000 >> 16);
			dos.write(30000 >> 24);
			
			dos.write(0);
			dos.write(0>>8);
			dos.write(0>>16);
			dos.write(0>>24);
			
			dos.write(0);
			dos.write(0>>8);
			dos.write(0>>16);
			dos.write(0>>24);
			
			dos.write(0);
			dos.write(0>>8);
			dos.write(0>>16);
			dos.write(0>>24);
			
			dos.write(0);
			dos.write(0>>8);
			dos.write(0>>16);
			dos.write(0>>24);
			
			// 입력
			int inputX1 = 50;
			int inputY1 = 50;
			int distance = 10;
			
			// 데이터 영역
			for(int y = 99; y >= 0; y--) {
				for(int x =99; x>=0; x--) {
					int pixelDistance = 
							(int)Math.sqrt(
							Math.pow((inputX1-x),2) +
							Math.pow((inputY1-y),2)
					);
					if(pixelDistance >= distance) {
						dos.write(0x00);//B
						dos.write(0x00);//G
						dos.write(0xFF);//R
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("이미지 생성 완료");
	}

}
