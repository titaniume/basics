package cn.titaniume.base.chapter05.paramproblems;

//引用类型作为参数传递，需要传递是对象。(地址值)
//定义学生类，并定义学习功能
class Student1 {
	public void study(){
		System.out.println("学生爱学习!");
	}
}

class StudentDemo1{
	//Student类，类是引用类型
	public void test(Student1 s){
		s.study();
	}
}

public class StudentTest {

	public static void main(String[] args) {
		//如何调用?
//		StudentDemo1 sd = new StudentDemo1();
//		Student1 s = new Student1();
//		sd.test(s);
		
		//匿名调用
		new StudentDemo1().test(new Student1());
	}
}
