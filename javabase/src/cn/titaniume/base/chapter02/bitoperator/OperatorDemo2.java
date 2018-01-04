package cn.titaniume.base.chapter02.bitoperator;

/*
	<<:左移，右边补0
	>>:右移，根据最高位确定补齐是0还是1
	>>>:无符号右移 左边补0
*/
class OperatorDemo2 {
	public static void main(String[] args) {
		/*
		System.out.println(4 << 2); //16 = 4 * 2^2
		System.out.println(3 << 3); //3 * 2 ^ 3
		System.out.println(32 >> 2); //32 / 2^2
		System.out.println(32 >>> 2);
		*/

		System.out.println(-32 >> 2);
		System.out.println(-32 >>> 2);
	}
}

/*
	A:<<
		4的二进制：
			00000000 00000000 00000000 00000100
		(00)000000 00000000 00000000 0000010000

	B:>>>
		原：10000000 00000000 00000000 00100000
		反：11111111 11111111 11111111 11011111
		补：11111111 11111111 11111111 11100000

		>>>
			11111111 11111111 11111111 11100000
			0011111111 11111111 11111111 111000(00)
*/