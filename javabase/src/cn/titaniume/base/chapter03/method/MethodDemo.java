package cn.titaniume.base.chapter03.method;
/*
	方法：完成特定功能的代码块

	格式：
		修饰符 返回值类型 方法名(参数类型 参数名1，参数类型 参数名2…) {
			方法体;
			return 返回值;
		}

	修饰符：public static
	返回值类型：功能最终的值的数据类型
	方法名：是为了方便调用而起的一个名字
	参数：
		形式参数：用于接受实际参数的变量
		实际参数：实际参与运算的数据
	方法体：完成特定功能的代码
	return 返回值：通过return把结果返回给调用者

	我们虽然知道了方法的格式，那么我们该如何写一个方法呢?
	两个明确：
		A:返回值类型
			结果的数据类型
		B:参数列表
			有几个参数参加，并且每个参数的数据类型是什么

	需求：求两个数据之和的案例
		A:我没有说数据的类型，默认int类型。
		B:求两个数据的和
			说明有两个参数参加，并且默认都是int类型
		C:两个int类型相加的结果是什么类型呢?
			是int类型，所以返回值类型这里是int类型

	方法的执行特点：
		不调用不执行。

	有明确返回值的方法的调用：
		A:单独调用，没有意义。
		B:输出调用，不是很好，因为我们可能需要针对结果还要进行其他的操作。
		C:赋值调用，推荐方式。
*/
class MethodDemo {
	public static void main(String[] args) {
		//定义两个变量
		int x = 10;
		int y = 20;

		//单独调用
		//sum(x,y);

		//输出调用
		System.out.println(sum(x,y));

		//赋值调用
		int result = sum(x,y);
		//result进行操作
		System.out.println(result);
	}

	//如果我自己要想写一个方法
	public static int sum(int a,int b) {
		int c = a + b;
		return c;
	}
}