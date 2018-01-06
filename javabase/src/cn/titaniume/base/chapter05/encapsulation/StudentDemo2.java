package cn.titaniume.base.chapter05.encapsulation;

/*
 private的应用场景：
 a:把成员变量给私有化
 b:对外提供公共的getXxx()和setXxx()方法
 */
class Student1 {
	private String name;
	private int age;

	// 针对name给出get和set方法
	public void setName(String n) {
		// 我们在这里其实也是可以对name做一些判断的
		name = n;
	}

	public String getName() {
		return name;
	}

	// 针对age给出get和set
	public void setAge(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}
}

public class StudentDemo2 {
	public static void main(String[] args) {
		// 创建对象
		Student1 s = new Student1();
		// 输出成员变量的值
		System.out.println(s.getName() + "---" + s.getAge());

		// 给成员变量赋值
		s.setName("林青霞");
		s.setAge(28);

		// 再次输出成员变量的值
		System.out.println(s.getName() + "---" + s.getAge());
	}
}
