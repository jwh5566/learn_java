package learn_java_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import org.junit.Test;

/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月24日 上午11:27:00 
 * 类说明 
 */
public class TestCollection {
	@Test
	public void testCollection1() {
		Collection col1 = new ArrayList();
		System.out.println(col1.size());
		col1.add(123);
		col1.add("AA");
		col1.add(new Date());
		col1.add("BB");
		System.out.println(col1.size());
	}
}
