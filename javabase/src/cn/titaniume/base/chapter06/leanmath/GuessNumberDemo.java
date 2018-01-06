package cn.titaniume.base.chapter06.leanmath;

import java.util.Scanner;

/**
需求：猜数字小游戏

分析：
	A:系统产生一个1-100之间的随机数。
		int number = (int)(Math.random()*100)+1;
	B:键盘录入数据,用Scanner实现
	C:用这两个数据进行比较
		大	提示大了
		小	提示小了
		等	恭喜你，猜中了
	D:为了保证我们能够猜中，我们就加入循环，实现多次猜。直到猜中。
*/
public class GuessNumberDemo {

	public static void main(String[] args) {
		//系统产生一个1-100之间的随机数。
		int rand=(int)(Math.random()*100)+1;
		//System.out.println(rand);
		while(true){
			//键盘录入数据,用Scanner实现
			Scanner sc = new Scanner(System.in);	
			System.out.println("请输入数字:[1~100之间的数字:]");
			int guessnum = sc.nextInt();
			
			
			//用这两个数据进行比较
			
			if(guessnum > rand){
				System.out.println("你猜的数据"+guessnum+"太大了");
			}else if(guessnum < rand){
				System.out.println("你猜的数据"	+guessnum+"太小了");
			}else{
				System.out.println("恭喜你，猜中了啊！");
				break;
			}
			
		}
	}

}
