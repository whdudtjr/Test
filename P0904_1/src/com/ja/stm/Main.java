package com.ja.stm;

import com.ja.stm.b.QQQ;
import com.ja.stm.dto.Student;

public class Main {
	// 똑같은 이름의 클래스를 다른 패키지에 쓰일 수 없다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.test();
		
		Student st1 = new Student();
		QQQ q = new QQQ();
		q.qq2();
		
		com.ja.stm.a.QQQ q2 = new com.ja.stm.a.QQQ();
		q2.qq1();
	}
}
