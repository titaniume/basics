package cn.titaniume.base.chapter05.paramproblems;

//����������Ϊ�������ݣ���Ҫ�����Ƕ���(��ֵַ)
//����ѧ���࣬������ѧϰ����
class Student1 {
	public void study(){
		System.out.println("ѧ����ѧϰ!");
	}
}

class StudentDemo1{
	//Student�࣬������������
	public void test(Student1 s){
		s.study();
	}
}

public class StudentTest {

	public static void main(String[] args) {
		//��ε���?
//		StudentDemo1 sd = new StudentDemo1();
//		Student1 s = new Student1();
//		sd.test(s);
		
		//��������
		new StudentDemo1().test(new Student1());
	}
}
