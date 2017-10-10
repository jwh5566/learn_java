package lean_java;

import java.util.Scanner;

/** 
* @author 作者 : jwh5566
* @version 创建时间：2017年10月11日 上午7:30:05 
* 类说明 
*/
public class Retirement {

	public static void main(String[] args) {
		// read inputs
		Scanner in = new Scanner(System.in);
		System.out.println("你需要多少钱退休?");
		double goal = in.nextDouble();
		
		System.out.println("你每年赚多少钱?");
		double payment = in.nextDouble();
		
		System.out.println("利息是多少?");
		double interestRate = in.nextDouble();
		
		double blance = 0;
		int years = 0;
		
		// 更新账户余额
		while (blance <goal)
		{
			blance += payment;
			double interest = blance * interestRate / 100;
			blance += interest;
			years++;
		}
		System.out.println("你将在"+ years +"年后退休");
	}

}
