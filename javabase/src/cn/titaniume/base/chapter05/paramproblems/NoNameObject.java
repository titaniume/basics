package cn.titaniume.base.chapter05.paramproblems;
/*
	匿名对象：没有名字的对象。

	使用场景：
		A:调用方法,该方法仅仅被使用一次的时候适用。
		B:作为实际参数传递
*/

//定义学生类，写一个love方法
class Student  {
	public void love() {
		System.out.println("学生喜欢放假");
	}
}

class StudentDemo {
	public void test(Student s) {
		s.love();
	}
}

//测试类
class NoNameObject {
	public static void main(String[] args) {
		/*
		//创建对象
		StudentDemo s = new StudentDemo();
		s.love();
		s.love();

		//匿名对象
		new StudentDemo().love();
		new StudentDemo().love();
		*/

		//有名字的情况
		//StudentDemo sd = new StudentDemo();
		//StudentDemo s = new StudentDemo();
		//sd.test(s);

		//没有名字的情况
		//StudentDemo sd = new StudentDemo();
		//sd.test(new StudentDemo());

		//不妨在来一步
		new StudentDemo().test(new Student());
	}
}