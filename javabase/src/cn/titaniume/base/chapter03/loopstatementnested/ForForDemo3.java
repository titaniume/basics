package cn.titaniume.base.chapter03.loopstatementnested;
/*
	需求：在控制台输出九九乘法表。

		1*1=1
		1*2=2	2*2=4
		1*3=3	2*3=6	3*3=9
		...
		1*9=9	2*9=18	3*9=27	4*9=36	...

	转移字符：
		\t	tab键的位置
*/
class ForForDemo3 {
	public static void main(String[] args) {
		
		//第一步：看作是打印三角形
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*" + "\t");
			}
			System.out.println();
		}
		//接下来，我们要把*替换为表达式
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+"*"+i+"="+(j*i)+ "\t");
			}
			System.out.println();
		}
	}
}