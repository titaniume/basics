package cn.titaniume.base.chapter06.codeblock;

/*
 执行过程：静态代码库 --> 构造代码块 --> 构造方法 --> 局部代码块

 静态代码块：只执行一次。
 构造代码库：每次创建对象都执行。
 */
class Student {
	static {
		System.out.println("静态代码库1");
	}

	{
		System.out.println("构造代码块1");
	}

	public Student() {
		{
			System.out.println("构造方法");
		}
	}

	static {
		System.out.println("静态代码库2");
	}

	{
		System.out.println("构造代码块2");
	}
}

public class CodeTest {

	public static void main(String[] args) {
		Student s = new Student();
		Student ss = new Student();

	}

}
