package lean_java;

import java.math.BigInteger;
import java.util.*;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月11日 上午11:46:42 
 * 类说明 
 */
public class BigIntegerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("how many numbers do you need pick?");
		int k = in.nextInt();
		
		System.out.print("what is the highet number you can pick?");
		int n = in.nextInt();
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for (int i=1; i<= k; i++)
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
		
		System.out.println("Your Odds are 1 in "+ lotteryOdds + ". Good luck!");
	}
}
