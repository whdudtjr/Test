package com.ja.stm.component;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.ja.stm.dto.*;

import com.ja.stm.util.IoUtil;

public class CommandHandler {
	
	private DataModel dataModel = new DataModel();
	
	public void addStudent() {
		IoUtil.println("학생 정보 등록을 시작합니다.");
		String name = IoUtil.input("학생 정보 입력 > ");
		int age = Integer.parseInt(IoUtil.input("학생 나이 입력 > "));
		int score = Integer.parseInt(IoUtil.input("학생 점수 입력 > "));
		
		StudentDto studentDto = new StudentDto(name,age,score);
		dataModel.add(studentDto);
		
		
		IoUtil.println("학생 정보 등록이 완료되었습니다");
	}
	
	public void printStudentsList() {
		IoUtil.println("학생 정보 리스트를 출력합니다.");
		
		StudentDto[] list = dataModel.getList();
		
		
		for(StudentDto studentDto : list) {
			String text = "이름: " + studentDto.getName();
			text += ", 나이: " + studentDto.getAge();
			text += ", 점수: " + studentDto.getScore();
			
			IoUtil.println(text);
		}
		IoUtil.println("총 학생 수: " + list.length);
	}
	
	public void searchStudent() {
		IoUtil.println("학생 검색을 시작합니다.");
		String search = IoUtil.input("검색할 학생 이름 입력 > ");
		
		StudentDto[] list = dataModel.getList();
		
		int searchCount = 0;
		for(StudentDto studentDto : list) {
			if(!studentDto.getName().contains(search)) continue;
			String text = "이름: " + studentDto.getName();
			text += ", 나이: " + studentDto.getAge();
			text += ", 점수: " + studentDto.getScore();
			
			IoUtil.println(text);
			searchCount++;
		}
		IoUtil.println("검색된 학생 수: " + searchCount);
	}
	
	public void deleteStudent() {
		IoUtil.println("학생 정보 삭제를 시작합니다.");
		String delete = IoUtil.input("삭제할 학생의 이름 > ");
		
		int count = dataModel.remove(delete);
		
		IoUtil.println(count + "명의 학생 정보가 삭제되었습니다.");
	}
	
	public void printStatistics() {
		IoUtil.println("학생 정보 통계");
		StudentDto[] list = dataModel.getList();
		
		int sum = 0;
		for(StudentDto studentDto: list) {
			sum += studentDto.getScore();
		}
		double average = sum/(double)list.length;
		
		IoUtil.println("총 인원: " + list.length);
		IoUtil.println("평균 점수: " + average);
	}
	
	public void save() {
		StudentDto[] list = dataModel.getList();
		
		File file = new File("C:\\temp1\\qwe.dat");
		try(FileOutputStream fos = new FileOutputStream(file)){
			DataOutputStream dos = new DataOutputStream(fos);
			
			// 메타 데이터
			dos.write('S');
			dos.write('T');
			dos.write('M');
			dos.writeInt(list.length);
			
			
			// 실제 데이터
			for(StudentDto studentDto : list) {
				dos.writeUTF(studentDto.getName());
				dos.writeInt(studentDto.getAge());
				dos.writeInt(studentDto.getScore());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		IoUtil.println("파일 저장 완료");
	}
	
	public void load() {
		File file = new File("C:\\temp1\\qwe.dat");
		
		if(!file.exists()) {
			IoUtil.println("저장된 파일을 찾을 수 없습니다.");
			return;
		}
		try(FileInputStream fos = new FileInputStream(file)){
			DataInputStream dis = new DataInputStream(fos);
			
			if(!(dis.read() == 'S' && dis.read() == 'T'&& dis.read() == 'M')) {
				IoUtil.println("잘못된 형식의 파일입니다.");
				return;
			}
			
			int length = dis.readInt();
			
			for(int x = 0; x < length; x++) {
				String name = dis.readUTF();
				int age = dis.readInt();
				int score = dis.readInt();
				StudentDto studentDto = new StudentDto(name,age,score);
				dataModel.add(studentDto);
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		IoUtil.println("파일 로드 완료");
		
	}
}
