package cn.titaniume.base.chapter03.loopstatementwhile;

/*
 我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
 请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?

 分析：
 A:初始化条件
 我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。
 B:统计变量
 我折叠多少次
 C:判断条件
 纸张厚度<=8848
 D:变化的数据
 纸张厚度每折叠一次是以前的2倍
 */
class WhileTest {
	public static void main(String[] args) {
	
		//初始化条件
		int end = 884800;
		int start = 1;
		
		//定义统计变量
		int count = 0;
		
		//while循环
		while(start <=end){
			count ++;
			
			//纸张厚度没折叠一次是之前的2倍
			start*=2;
			
		}
		System.out.println("需要折叠:"+count+"次");
		
		//用for循环
		int counts =0;
		for (int x=1,y =884800; x <=y; x*=2) {
			counts++;
		}
		System.out.println("需要折叠:"+counts+"次");
	}
}