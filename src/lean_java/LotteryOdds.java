package lean_java;

import java.util.Scanner;


/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月11日 上午10:41:02 
 * 类说明 
 */
public class LotteryOdds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("你要取几个数字?");
		int k = in.nextInt();
		
		System.out.print("你所要取的数字最大是多少?");
		int n = in.nextInt();
		
		int lotteryOdds = 1;
		for (int i=1; i<=k; i++)
			lotteryOdds = lotteryOdds * (n-i+1)/i;
		System.out.printf("你赢的概率是%d分之一, 祝你好运!", lotteryOdds);
	}
}
