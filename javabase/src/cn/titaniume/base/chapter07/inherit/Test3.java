package cn.titaniume.base.chapter07.inherit;

/*
	基础知识：
		A:代码块的执行顺序：
			静态代码块 --> 构造代码块 --> 构造方法
		B:代码的执行特点
			静态代码块只执行一次
			构造代码块每次调用构造方法都执行
*/
class Fu4 {
	static {
		System.out.println("静态代码块Fu");
	}

	{
		System.out.println("构造代码块Fu");
	}

	public Fu4() {
		System.out.println("构造方法Fu");
	}
}

class Zi4 extends Fu4 {
	static {
		System.out.println("静态代码块Zi");
	}

	{
		System.out.println("构造代码块Zi");
	}

	public Zi4() {
		System.out.println("构造方法Zi");
	}
}

class Test3 {
	public static void main(String[] args) {
		Zi4 z = new Zi4();
		Zi4 z2 = new Zi4();
	}
}
