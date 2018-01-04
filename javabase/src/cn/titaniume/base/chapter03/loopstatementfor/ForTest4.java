package cn.titaniume.base.chapter03.loopstatementfor;
/*
	所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	举例：153就是一个水仙花数。
	153 = 1*1*1 + 5*5*5 + 3*3*3

	分析：
		A:一个三位数其实告诉我们的是范围，通过for循环就可以搞定。
		B:其各位数字的立方和等于该数本身就是规则
			我们如何取得每一个位上的数据呢?

			给了任意的一个数据x 153
			个位：x%10
			十位：x/10%10
			百位：x/10/10%10
			千位：x/10/10/10%10
			...

			x == (个位*个位*个位 + 十位*十位*十位 + 百位*百位*百位)
*/
class ForTest4 {
	public static void main(String[] args) {
		for(int x=100; x<1000; x++) {
			int ge = x%10;
			int shi = x/10%10;
			int bai = x/10/10%10;

			if(x == (ge*ge*ge + shi*shi*shi + bai*bai*bai)){
				System.out.println(x);
			}
		}
	}
}