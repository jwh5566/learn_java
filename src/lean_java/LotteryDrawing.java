package lean_java;

import java.util.*;
/** 
 * @author ���� : jwh5566
 * @version ����ʱ�䣺2017��10��11�� ����3:40:24 
 * ��˵�� 
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
			n--; // ��Ϊ������Ƴ����һ�����֣���������Ҫ�����һ������ ��pick�����ֽ��л���
		}
		// print the sorted array
		Arrays.sort(result);
		for (int r : result)
			System.out.print(r+ " ");
	}
}
