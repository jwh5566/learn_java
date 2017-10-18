package learn_java_4;
/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月18日 下午3:51:41 
 * 类说明 
 */
public abstract class Person {
	public abstract String getDescription();
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}
