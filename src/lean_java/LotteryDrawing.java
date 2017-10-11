package lean_java;

import java.util.*;
/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月11日 下午3:40:24 
 * 类说明 
 */
public class LotteryDrawing {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("how many numbers do you need pick?");
		int k = in.nextInt();
		
		System.out.print("what is the highest number from the range?");
		int n = in.nextInt();
		
		// fill an array with number 1,2,3...n
		int[] numbers = new int[n];
		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;
		
		// pick k numbers and put them into second array
		int [] result = new int[k];
		for (int i = 0; i< result.length; i++)
		{
			// make random index between 0 and n-1
			int r = (int) (Math.random()*n);
			result[i] = numbers[r];
			// move the last element into the location
			numbers[r] = numbers[n-1];
			n--; // 因为这里会移除最后一个数字，所以上面要将最后一个数字 和pick的数字进行互换
		}
		// print the sorted array
		Arrays.sort(result);
		for (int r : result)
			System.out.print(r+ " ");
	}
}
