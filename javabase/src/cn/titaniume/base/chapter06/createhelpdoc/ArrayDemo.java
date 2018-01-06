package cn.titaniume.base.chapter06.createhelpdoc;

//因为这个数组的工具类并没有使用非静态的成员。
//为了方便调用，我们就把这个方法改进为静态修饰的
/*
	制作一个说明书的过程：
		A:写代码
		B:加入文档注释
		C:通过javadoc工具生成说明书
			格式：javadoc -d 目录 -author -version ArrayTool.java
				  javadoc -d doc -author -version ArrayTool.java
			注意：javadoc: 错误 - 找不到可以文档化的公共或受保护的类。
				说明类的权限不够大，用public修饰即可
*/
public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr = {56,38,91,72,40};

		//需求：遍历数组
		//ArrayTool at = new ArrayTool();
		//at.printArray(arr);

		ArrayTool.printArray(arr);

		//需求：我要获取数组中的最大值
		int max = ArrayTool.getMax(arr);
		System.out.println("最大值是:"+ max);
	}
	

}
