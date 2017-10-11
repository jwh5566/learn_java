package lean_java;
/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月11日 下午5:11:24 
 * 类说明 
 */
public class LotteryArray {
	public static void main(String[] args) {
		final int NMAX = 10;
		// allocate triangular array
		int[][] odds = new int[NMAX+1][];
		for (int n=0; n<=NMAX; n++)
			odds[n] = new int[n+1];
		
		// fill atiangilar array
		for (int n=0; n<odds.length; n++)
			for (int k=0; k<odds[n].length; k++)
			{
				int lotteryOdds = 1;
				for (int i=1; i<=k;i++)
					lotteryOdds = lotteryOdds * (n-i+1)/i;
				odds[n][k] = lotteryOdds;
			}
		
		// print triangular array
		for (int[] row: odds)
		{
			for (int odd : row)
				System.out.printf("%4d", odd);
			System.out.println();
		}
	}
}
