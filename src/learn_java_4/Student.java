package learn_java_4;
/** 
 * @author 作者 : jwh5566
 * @version 创建时间：2017年10月18日 下午4:01:31 
 * 类说明 
 */
public class Student extends Person{
	private String major;
	
	public Student(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDescription() {
		return "a student majoring in " + major;
	}
	
	
}
