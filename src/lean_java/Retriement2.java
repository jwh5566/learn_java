package lean_java;

import java.util.*;


/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月11日 上午9:52:25 
 * 类说明 
 */
public class Retriement2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("年薪多少?");
		double payment = in.nextDouble();
		
		System.out.print("年利息?");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		do
		{
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			
			year++;
			
			System.out.printf("%d年后,你的账户有%,.2f%n", year, balance);
			System.out.print("准备退休?(Y/N)");
			input = in.next();
		}
		while (input.equals("N"));
		
	}
}
