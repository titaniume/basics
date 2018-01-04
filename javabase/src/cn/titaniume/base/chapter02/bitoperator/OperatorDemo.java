package cn.titaniume.base.chapter02.bitoperator;

/*
	位运算符：位运算符一定是先把数据转成二进制，然后再运算。

	面试题：&和&&的区别?
			A:&和&&都可以作为逻辑运算，&&具有短路效果。
			B:&还可以作为位运算。
*/
class OperatorDemo {
	public static void main(String[] args) {
		//&,|,^,~
		System.out.println(3 & 4); //0
		System.out.println(3 | 4); //7
		System.out.println(3 ^ 4); //7
		System.out.println(~3); //
	}
}

/*
	A:计算出3，4的二进制
		3的二进制：00000000 00000000 00000000 00000011
		4的二进制：00000000 00000000 00000000 00000100
	B:位&运算	有0则0
		00000000 00000000 00000000 00000011
	   &00000000 00000000 00000000 00000100
	   ------------------------------------
	    00000000 00000000 00000000 00000000
	C:位|运算	有1则1
		00000000 00000000 00000000 00000011
	   &00000000 00000000 00000000 00000100
	   ------------------------------------
	    00000000 00000000 00000000 00000111
	D:位^运算	相同则0，不同则1
		00000000 00000000 00000000 00000011
	   &00000000 00000000 00000000 00000100
	   ------------------------------------
	    00000000 00000000 00000000 00000111
	E:位~运算 把数据每个位都按位取反
		00000000 00000000 00000000 00000011
	   ~11111111 11111111 11111111 11111100
	 反:11111111 11111111 11111111 11111011
	 原:10000000 00000000 00000000 00000100
*/